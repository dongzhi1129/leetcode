package com.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class LengthOfLongestSubstringFunctionTest {

	@Test
	@Parameters(method="testCase")
	public void testLengthOfLongestSubstring(String src,int expect) {
		int actual = LengthOfLongestSubstringFunction.lengthOfLongestSubstring(src);
		assertTrue(actual == expect);
	}
	
	
	@Test
	@Parameters(method="testCase")
	public void lengthOfLongestSubstringPlus(String src,int expect) {
		int actual = LengthOfLongestSubstringFunction.lengthOfLongestSubstring(src);
		assertTrue(actual == expect);
	}

	private Object testCase() {
		Object[] case1 = new Object[] {"abcabcbb",3};
		Object[] case2 = new Object[] {"bbbbb",1};
		Object[] case3 = new Object[] {"pwwkew",3};
		Object[] case4 = new Object[] {"",0};
		Object[] case5 = new Object[] {" ",1};
		Object[] case6= new Object[] {"dvdf",3};
		Object[] cases = new Object[] {case1,case2,case3,case4,case5,case6};
		return cases;
	}
}
