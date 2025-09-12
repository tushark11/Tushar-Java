package com.exceptionhandling;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		System.out.println("this statement will be executed");
		
		try {
			String s= args[1];//arrayIndexOutOfBounds exception
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("array args is empty array");
		}

	}

}
