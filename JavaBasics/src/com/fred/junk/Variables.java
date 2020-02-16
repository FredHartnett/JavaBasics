package com.fred.junk;

public class Variables {
	
	int y = 20;
	static int z = 30;

	public static void main(String[] args) {
		//local
		//System.out.println(x); //can't see x since x is local to the show() method
		
		//instance
		//System.out.println(y); //doesn't work - need to instantiate object
		//Variables v = new Variables();
		//System.out.println(v.y);
		
		//static
		System.out.println(z);

	}
	
	public void show() {
		int x = 10;
	}

}
