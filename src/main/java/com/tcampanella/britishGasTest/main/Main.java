package com.tcampanella.britishGasTest.main;

import com.tcampanella.britishGasTest.util.ArrayUtil;

/**
 * @author Tommaso Campanella
 * 
 * Main Class
 */

public class Main {

	/**
	 * Two arguments are expected:
	 * 
	 * 1) target Array
	 * 2) Source Array
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		
		
		if(args.length == 2) {
		
			String[] targetStringArray = args[0].trim().split("");
			String[] sourceStringArray = args[1].trim().split("");
			
			try {
				
				System.out.println("Resulting starting position: " + ArrayUtil.indexOfSubList(sourceStringArray, targetStringArray));
				
			} catch (NumberFormatException n) {
				
				System.out.println("Please provide the correct input format (e.g. 2345 45) ");
			}
		
		} else {
			
			System.out.println("Please provide two arguments");
		}
		
	}

}
