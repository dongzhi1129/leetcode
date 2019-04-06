package com.leetcode.algorithm;

/**
 * 3.Given a string, find the length of the longest substring without repeating
 * characters.
 * 
 * Example 1:
 * 
 * Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length
 * of 3. Example 2:
 * 
 * Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the length of
 * 1. Example 3:
 * 
 * Input: "pwwkew" Output: 3 Explanation: The answer is "wke", with the length
 * of 3. Note that the answer must be a substring, "pwke" is a subsequence and
 * not a substring.
 * 
 *
 */
public class LengthOfLongestSubstringFunction {

	public static int lengthOfLongestSubstring(String s) {
		if (s == null) {
			return 0;
		}
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			byte[] charactorMapArray = new byte[128];
			charactorMapArray[s.charAt(i)] = 1;
			int currentLength = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (charactorMapArray[s.charAt(j)] == 1) {
					break;
				} else {
					charactorMapArray[s.charAt(j)] = 1;
					++currentLength;
				}
			}
			maxLength = currentLength > maxLength ? currentLength : maxLength;
		}
		return maxLength;
	}

	// 滑动窗口解法
	public static int lengthOfLongestSubstringPlus(String s) {
		int maxLength = 0, i = 0, j = 0;
		if (s == null) {
			return maxLength;
		}
		byte[] charactorMapArray = new byte[128];
		while (i < s.length() && j < s.length()) {
			if(charactorMapArray[s.charAt(j)] == 0) {
				charactorMapArray[s.charAt(j++)] = 1;
				Math.max(maxLength, j-i);
			} else {
				charactorMapArray[s.charAt(i++)] =0;
			}

		}
		return maxLength;

	}

}
