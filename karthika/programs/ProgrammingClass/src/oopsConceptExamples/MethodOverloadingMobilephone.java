package oopsConceptExamples;


public class MethodOverloadingMobilephone {
	
	public void call()
	 {
		 System.out.println("it supports voice call");
	 }
	 public void call(String v)
	 {
		 System.out.println("it supports "+ v);
	 }
	  
	 public void call(String whatsappvoice,String whatsappvideo ) {
		System.out.println("it supports "+whatsappvoice+" "+"it supports"+whatsappvideo); 
	 }
	

	public static void main(String[] args) {
	
			 MethodOverloadingMobilephone mmp=new MethodOverloadingMobilephone();
			 mmp.call();
			 mmp.call("video call");
			 mmp.call("whatsappvoicecall", "whatsappvideocall");
		 }
   

	}


