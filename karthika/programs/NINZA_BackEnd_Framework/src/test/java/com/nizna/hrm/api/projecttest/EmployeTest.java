package com.nizna.hrm.api.projecttest;



import java.util.Random;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ninz.hrm.api.baseClass.BaseAPIClass;
import com.ninza.hrm.api.pojoclass.EmployePOJO;
import com.ninza.hrm.api.pojoclass.ProjectPojo;
import com.ninza.hrm.contants.endpoints.IEndPoint;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


public class EmployeTest  extends BaseAPIClass{
	

	@Test
	public void addEmployeeTest() throws Throwable {
		
		//create an object to Pojo class
	
		//String BASEURI = fLib.getDataFromPropertiesFile("BASEUri");
		
		String projectName = "Airtel_"+jLib.getRandomNumber();
		String userName = "user"+jLib.getRandomNumber();
		//Api-1 ==> add a project in side server
		ProjectPojo pObj = new ProjectPojo(projectName, "Created", "Deepak", 10);				
                       given()
				          .spec(specReqObj)
				          .body(pObj)
				        .when()
				          .post(IEndPoint.ADDProj)
				        .then()
				         .spec(specRespObj)
				         .log().all();						        
				  
				      
	   //API-2 ==> add employe to same Project
	EmployePOJO empObj = new EmployePOJO("Arcitect", "24/04/1983", "deepak@gmail.com",userName, 18, "9888000876", projectName, "ROLE_ADMIN", userName);	
					 given()
					  .spec(specReqObj)
			          .body(empObj)
			        
			        .when()
			          .post(IEndPoint.ADDEmp)
			        .then()
			        
			         .assertThat().statusCode(201)
			         .and()
			         .time(Matchers.lessThan(3000L))
			         .spec(specRespObj)
			         .log().all();
		
					 //verify the projectName in DB layer
		boolean flag  = dbLib.executeQueryVerifyAndGetData("select * from employee", 5, userName);
	    Assert.assertTrue(flag,"Project in DB is not verified");
		   Assert.assertTrue(flag,"Employe in DB is not verified");
		
	}
	@Test
	public void addEmployeeWithOutEmailTest() throws Throwable {
		
		String BASEURI = fLib.getDataFromPropertiesFile("BASEUri");
		
		//create an object to Pojo class
		Random random = new Random();
		int ranNum = random.nextInt(5000);		
		
		String projectName = "Airtel_"+ranNum;
		String userName = "user"+ranNum;
		//Api-1 ==> add a project in side server
		ProjectPojo pObj = new ProjectPojo(projectName, "Created", "Deepak", 10);				
                       given()
                       .spec(specReqObj)
				          .body(pObj)
				        .when()
				          .post(IEndPoint.ADDProj)
				        .then()
				          .spec(specRespObj)
				         .log().all();						        
				  
				      
	   //API-2 ==> add employe to same Project
	EmployePOJO empObj = new EmployePOJO("Arcitect", "24/04/1983", "",userName, 18, "9888000876", projectName, "ROLE_ADMIN", userName);	
					 given()
					 .spec(specReqObj)
			          .body(empObj)
			        .when()
			          .post(IEndPoint.ADDEmp)
			        .then()
			        
			         .assertThat().statusCode(500)
			         .spec(specRespObj)
			         .log().all();
	
		
		
	}


}
