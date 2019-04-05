package com.leetcode.algorithm;

import java.util.Arrays;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 */

public class TowSumFunction {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int length = 0;
		if (nums == null || (length = nums.length) <= 0) {
			return nums;
		}
		for (int i = 0; i < length; i++) {
			int currentElem = nums[i];
			result[0] = i;
			for (int j = i + 1; j < length; j++) {
				int chooseElem = nums[j];
				int addResult = currentElem + chooseElem;
				if (addResult == target) {
					result[1] = j;
					return result;
				}
			}

		}
		return result;

	}

	public static int[] toSumOtherSolution(int[] nums, int target) {
		int[] result = new int[2];
		int length = 0;
		if (nums == null || (length = nums.length) <= 0) {
			return nums;
		}
		Map<Integer, Integer> maps = Maps.newHashMap();
		for (int i = 0; i < length; i++) {
			maps.put(nums[i], i);
		}
		for (int j = 0; j < length; j++) {
			int diff = target - nums[j];
			if(maps.containsKey(diff)) {
				result[0]=j;
				result[1]=maps.get(diff);
				break;
			}
		}
		return result;
	}
	
	public static int[] toSumOtherSolutionPlus(int[] nums, int target) {
		int[] result = new int[2];
		int length = 0;
		if (nums == null || (length = nums.length) <= 0) {
			return nums;
		}
		Map<Integer, Integer> maps = Maps.newHashMap();
		for (int j = 0; j < length; j++) {
			int diff = target - nums[j];
			if(maps.containsKey(diff)) {
				result[0]=j;
				result[1]=maps.get(diff);
				Arrays.sort(result);
				break;
			} else {
				maps.put(nums[j], j);
			}
		}
		return result;
	}

}
