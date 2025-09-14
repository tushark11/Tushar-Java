package com.exceptionhandling;

public class InnerTryCatchBlockExample {
	
		public static void main(String[] args) {
			
			System.out.println("---main method---");
			
			
			try {
				
				System.out.println("---outer try block---");
				
				String s= args[0];
				System.out.println("value of s:"+s);
				System.out.println("exit from outer try block");
				
				try {
					
					System.out.println("---inner try block---");
					int i=10/0;
					System.out.println("value of i:"+i);
					
				} catch (Exception e) {
					
					System.out.println("---inner catch block---");
					e.printStackTrace();
				}
				
			} catch (Exception e) {
				System.out.println("---outer catch block---");
				e.printStackTrace();
			}
			System.out.println("---exit from the main method---");
		}

}
