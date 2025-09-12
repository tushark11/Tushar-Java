package com.exceptionhandling;

public class ArithmeticException {
	
	public static void main(String[] args) {
		System.out.println("this statement will be executed");
		
		try {
			
			
			int i=10/0;//arithmetic exception
			
			System.out.println("value of i is:"+i);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("CANNOT DIVIDE BY ZERO");
		}
		System.out.println("this statement will also get executed");
		
		
	}

}
