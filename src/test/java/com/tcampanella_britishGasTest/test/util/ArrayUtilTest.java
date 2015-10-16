/**
 * 
 */
package com.tcampanella_britishGasTest.test.util;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.tcampanella.britishGasTest.util.ArrayUtil;

/**
 * @author Tommaso Campanella
 *
 */
public class ArrayUtilTest {
	
	
	@Test
	public void testindexOfSubListOfStrings() {
		
		
		String[] firstTargetArray = {"2","3","4","5"};
		String[] firstSourceArray = {"4","5"};
		
		/**
		 * Check that the arrays of strings are correctly parsed to Integers
		 * and the resulting position calculated (2)
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(firstSourceArray, firstTargetArray) == 2);
		
		String[] secondTargetArray = {"2","3","4","5"};
		String[] secondSourceArray = {"2","3"};
		
		/**
		 * Check that the arrays of strings are correctly parsed to Integers
		 * and the resulting position calculated (0)
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(secondSourceArray, secondTargetArray) == 0);
		
		String[] thirdTargetArray = {"2","3"};
		String[] thirdSourceArray = {"3","4"};
		
		/**
		 * Check that the arrays of strings are correctly parsed to Integers
		 * and -1 is returned, since the arrays cannot have the same length
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(thirdSourceArray, thirdTargetArray) == -1);
		
		String[] fourthwrongTargetArray = {"2","3","4","5"};
		String[] fourthSourceArray = {"3WRONG","4"};
		
		NumberFormatException numberFormatException = null;
		
		try {
			
			ArrayUtil.indexOfSubList(fourthSourceArray, fourthwrongTargetArray);

		} catch (NumberFormatException n) {
			
			numberFormatException = n;
		}
		
		/**
		 * Check that the arrays of strings are not correctly parsed to Integers
		 * and a NumberFormatException is thrown
		 */
		
		assertTrue(numberFormatException != null);
		
	}
	
	@Test
	public void testindexOfSubListOfintegers() {
		
		
		int[] firstTargetArray = {2,3,4,5};
		int[] firstSourceArray = {4,5};
		
		/**
		 * Check that the arrays of integers are correctly parsed to Integers
		 * and the resulting position calculated (2)
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(firstSourceArray, firstTargetArray) == 2);
		
		int[] secondTargetArray = {2,3,4,5};
		int[] secondSourceArray = {2,3};
		
		/**
		 * Check that the arrays of integers are correctly parsed to Integers
		 * and the resulting position calculated (0)
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(secondSourceArray, secondTargetArray) == 0);
		
		int[] thirdTargetArray = {2,3};
		int[] thirdSourceArray = {3,4};
		
		/**
		 * Check that the arrays of integers are correctly parsed to Integers
		 * and -1 is returned, since the arrays cannot have the same length
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(thirdSourceArray, thirdTargetArray) == -1);
		
	}
	
	@Test
	public void testindexOfSubListOfIntegers() {
		
		
		Integer[] firstTargetArray = {2,3,4,5};
		Integer[] firstSourceArray = {4,5};
		
		/**
		 * Check that the position calculated is 2
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(firstSourceArray, firstTargetArray) == 2);
		
		Integer[] secondTargetArray = {2,3,4,5};
		Integer[] secondSourceArray = {2,3};
		
		/**
		 * Check that the position calculated is 0
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(secondSourceArray, secondTargetArray) == 0);
		
		Integer[] thirdTargetArray = {2,3};
		Integer[] thirdSourceArray = {3,4};
		
		/**
		 * Check that -1 is returned, since the arrays cannot have the same length
		 */
		
		assertTrue(ArrayUtil.indexOfSubList(thirdSourceArray, thirdTargetArray) == -1);
		
	}

}
