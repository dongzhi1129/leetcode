package com.leetcode.algorithm;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TowSumFunctionTest {

	/* 如果int[] nums，作为参数第一项，会有问题？？如何解决 */
	@Test
	@Parameters(method = "mixedParameters")
//	@TestCaseName("{0},{1}")
	public void twoSum(int target, int[] nums, int[] expect) {

		int[] actual = TowSumFunction.twoSum(nums, target);
		System.out.println(Arrays.toString(actual));
		assertArrayEquals(expect, actual);

	}

	/* 如果int[] nums，作为参数第一项，会有问题？？如何解决 */
	@Test
	@Parameters(method = "mixedParameters")
	public void twoSumSolution(int target, int[] nums, int[] expect) {
		int[] actual = TowSumFunction.toSumOtherSolution(nums, target);
		System.out.println(Arrays.toString(actual));
		assertArrayEquals(expect, actual);

	}
	
	@Test
	@Parameters(method = "mixedParameters")
	public void twoSumSolutionPlus(int target, int[] nums, int[] expect) {
		int[] actual = TowSumFunction.toSumOtherSolutionPlus(nums, target);
		System.out.println(Arrays.toString(actual));
		assertArrayEquals(expect, actual);

	}

	@SuppressWarnings("deprecation")
	public Object mixedParameters() {
		int[] nums = { 2, 7, 11, 5 };
		int target = 9;
		int[] expect = { 0, 1 };

		int[] nums1 = { 2, 7, 11, 5 };
		int target1 = 9;
		int[] expect1 = { 0, 1 };
		return $($(target, nums, expect), $(target1, nums1, expect1));
	}

}
