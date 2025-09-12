package com.exceptionhandling;

public class UsingTryCatch {

		
		public static void main (String[] args) {
		System.out.println("this statement will be executed ");
		//developer
		try {
		System.out.println("----try block---");
		Integer i = new Integer("pqr");// numberformat exception:when string is passed instead of number
		System.out.println(" value of i is :" + i);
		} catch (Exception e) {
		System.out.println("---catch block--"); e.printStackTrace();
		System.out.println("Now this statement will also be executed ");

	}

}
}