package com.leetcode.algorithm;

import java.util.Arrays;

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

	/**动态规划算法
	 * 
	 * 
	 */
	
	public static String longestPalindromeNew(String s) {
		int length = s.length();
		int[][] flagArray = new int[length][length];
		String maxLengthString = null ;
		for(int i=0;i<length;i++) {
			for(int j=i;j>=0;j--) {
				if(s.charAt(j) == s.charAt(i) && (i - j < 2 || flagArray[j+1][i-1] == 1)) {
					flagArray[j][i] = 1;
					if(maxLengthString == null || i - j + 1 > maxLengthString.length()) {
						maxLengthString = s.substring(j,i+1);
					}
				}
			}
			
		}
		return maxLengthString;
	}
	
	/**
	 * Manacher算法
	 * @param args
	 */
	

	public static void main(String[] args) {
		String a = longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir");
		System.out.println(a);
	}

}
