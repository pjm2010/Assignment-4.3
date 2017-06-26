package com.finalExample;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int y=30;
		int result;
		// y=y+10; This weill throw an error as final variable cannot be changed
		/*Final is used mainly during establishing database connection as it stands to be same throughout the project*/
//		/Please check the comments to get the detail explanation of the final keyword and its functionality 
		
	
		
		System.out.println("The value of int y is "+y); //Printing the value of the final integer
		FinalExample exp=new FinalExample();
		result=exp.display(1, 3);
		System.out.println("The value of the final method is "+result);
		System.out.println("A Java constructor is implicitly final so final keyword is not used for constructor");
		
		
		
	}

}
