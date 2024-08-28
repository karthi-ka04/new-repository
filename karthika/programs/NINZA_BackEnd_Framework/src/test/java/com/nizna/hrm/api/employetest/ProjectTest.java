package com.nizna.hrm.api.employetest;



import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ninz.hrm.api.baseClass.BaseAPIClass;
import com.ninza.hrm.api.pojoclass.ProjectPojo;
import com.ninza.hrm.contants.endpoints.IEndPoint;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class ProjectTest  extends BaseAPIClass{

	ProjectPojo pObj;
	@Test
	public void addSingleProjectWithCreatedTest() throws Throwable {
		

		String expSucMsg = "Successfully Added";
	    String projectName = "ABB_"+jLib.getRandomNumber();		
		 pObj = new ProjectPojo(projectName, "Created", "Deepak", 10);
	
		//verify the projectName in API layer
	Response resp= given()
			         .spec(specReqObj)
			          .body(pObj)
			        
			        .when()
			          .post(IEndPoint.ADDProj);
	
			        resp.then()
			        
			         .assertThat().statusCode(201)
			         .assertThat().time(Matchers.lessThan(3000L))
			         .spec(specRespObj)
			         .log().all();
            
			   String actMsg = resp.jsonPath().get("msg");
			   Assert.assertEquals(expSucMsg, actMsg);
			   
	 //verify the projectName in DB layer
			   dbLib.connectToDB();
		boolean flag  = dbLib.executeQueryVerifyAndGetData("select * from project", 4, projectName);
	    Assert.assertTrue(flag,"Project in DB is not verified");
	           
			   
		
	}
	
	private RequestSpecification spec(ResponseSpecification specRespObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test(dependsOnMethods = "addSingleProjectWithCreatedTest")
	public void createDuplicateProjectTest() throws Throwable {
		
		String BASEURI = fLib.getDataFromPropertiesFile("BASEUri");
		given()
		  .spec(specReqObj)
      
        .body(pObj)
      .when()
        .post(IEndPoint.ADDProj)
       .then()
         
         .assertThat().statusCode(409)
         .spec(specRespObj)
         .log().all();
	}
	

}












