package com.leetcode.algorithm;

/**
 * 
 * Given a string s, find the longest palindromic substring in s. You may assume
 * that the maximum length of s is 1000.
 * 
 * Example 1:
 * 
 * Input: "babad" Output: "bab" Note: "aba" is also a valid answer. Example 2:
 * 
 * Input: "cbbd" Output: "bb"
 *
 */
public class LongestPalindromeFunction {
	public static String longestPalindrome(String s) {
		if (s == null) {
			return null;
		}
		String palindromicString = "";
		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {
				String positiveSubStr = s.substring(i, j + 1);
				StringBuilder negiveSubstr = new StringBuilder("");
				for (int k = j; k >= i; k--) {
					negiveSubstr.append(s.charAt(k));
				}
				if (positiveSubStr.equals(negiveSubstr.toString())
						&& positiveSubStr.length() > palindromicString.length()) {
					palindromicString = positiveSubStr;
				}
			}

		}
		System.out.println(palindromicString);
		return palindromicString;
	}
	
	public static String longestPalindromePlus(String s) {
		if (s == null) {
			return null;
		}
		String palindromicString = "";
		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {
				String positiveSubStr = s.substring(i, j + 1);
				StringBuilder negiveSubstr = new StringBuilder("");
				for (int k = j; k >= i; k--) {
					negiveSubstr.append(s.charAt(k));
				}
				if (positiveSubStr.equals(negiveSubstr.toString())
						&& positiveSubStr.length() > palindromicString.length()) {
					palindromicString = positiveSubStr;
				}
			}

		}
		System.out.println(palindromicString);
		return palindromicString;
	}
}
