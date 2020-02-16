package com.fred.demo_switch;

public class DemoSwitch {

	public static void main(String[] args) {
		
		char c = 'h';
		
		switch (c) {
			case 'h': System.out.print("hello ");
				break;
			case 't': System.out.print("this ");
				break;
			case 'w': System.out.print("works ");
				break;
			default: System.out.print("have a great day ");
		}

	}

}

/*
 if - else: use if - else for ranges of values. switch statements don't handle ranges of values  
  
 */
