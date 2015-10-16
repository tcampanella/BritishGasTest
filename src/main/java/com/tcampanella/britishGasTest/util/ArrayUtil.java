/**
 * 
 */
package com.tcampanella.britishGasTest.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author Tommaso Campanella
 * 
 * The following Array Util class provides three static methods
 * to determine the starting position of a first array within a
 * second ones
 *
 */
public class ArrayUtil {
	
	
	
	// Suppresses default constructor, ensuring non-instantiability.
    private ArrayUtil() {}
    
	
    /**
     * 
     * The following method determine the starting position of 
     * first array of Strings within a second array of Strings 
     * @param sourceArray
     * @param targetArray
     * @return starting position of source array within target array
     */
	public static int indexOfSubList(String[] sourceArray,String[] targetArray) throws NumberFormatException {
		
		Integer[] sourceIntegerArray = null;
		Integer[] targetIntegerArray = null;
		
		sourceIntegerArray = Stream.of(sourceArray).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		targetIntegerArray = Stream.of(targetArray).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		
		/*
		Stream.of(sourceIntegerArray).forEach(System.out::println);
		Stream.of(targetIntegerArray).forEach(System.out::println);
		*/
		
		return indexOfSubList(sourceIntegerArray,targetIntegerArray ); 
		
	}
	
	 /**
     * 
     * The following method determine the starting position of 
     * first array of integers within a second array of integers 
     * @param sourceArray
     * @param targetArray
     * @return starting position of source array within target array
     */
	public static int indexOfSubList (int[] sourceArray,int[] targetArray ) {
		
		Integer[] sourceIntegerArray = Arrays.stream(sourceArray).boxed().toArray(Integer[]::new);
		Integer[] targetIntegerArray = Arrays.stream(targetArray).boxed().toArray(Integer[]::new);
		
		/*
		Stream.of(sourceIntegerArray).forEach(System.out::println);
		Stream.of(targetIntegerArray).forEach(System.out::println);
		*/
		
		
		return indexOfSubList(sourceIntegerArray,targetIntegerArray );
	}
	
	 /**
     * 
     * The following method determine the starting position of 
     * first array of Integers within a second array of Integers 
     * @param sourceArray
     * @param targetArray
     * @return starting position of source array within target array
     */
	public static int indexOfSubList (Integer[] sourceArray,Integer[] targetArray ) {
		
		return 	Collections.indexOfSubList(Arrays.asList(targetArray), Arrays.asList(sourceArray));

	}
	

}
