package com.fred.junk;

public class Junk1 {

	public static void main(String[] args) {
		/* save this block
		long startTime = System.currentTimeMillis();
		
		int[] num = new int[2000000];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		} 
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("start: " + startTime);
		System.out.println("end: " + endTime);
		System.out.println("elapsed time: " +  Math.round((endTime - startTime) / 1000));
		*/
		
		for  (int i = 2; i <= 14; i += 3) {
			System.out.printf("%d ",i);
		}

	}

}
