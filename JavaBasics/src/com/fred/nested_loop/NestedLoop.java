package com.fred.nested_loop;

public class NestedLoop {

	public static void main(String[] args) {
		
		pattern();
	}
	
	public static void pattern() {
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("O ");
			}
			
			for(int j = 0; j < 5 - i; j++) {	
				System.out.print(". ");
			}
				
			System.out.println();
		
		}
	}
}
