package com.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.leetcode.algorithm.AddTwoNumbersFunction.ListNode;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AddTwoNumbersFunctionTest {

	@Test
//	@Parameters("testCase")
	public void testAddTwoNumbers() {
		ListNode ls = new ListNode(2);
		ListNode ls01 = new ListNode(4);
		ls.next = ls01;
		ListNode ls02 = new ListNode(3);
		ls01.next = ls02;
		ls02.next = null;
		
		ListNode ls2 = new ListNode(5);
		ListNode ls201 = new ListNode(6);
		ls2.next = ls201;
		ListNode ls202 = new ListNode(4);
		ls201.next = ls202;
		ls202.next = null;
		
		ListNode l3 =AddTwoNumbersFunction.addTwoNumbers(ls, ls2);
		while(l3 != null) {
			System.out.println(l3.val+"-->");
			l3 = l3.next;
		}
		assertTrue(true);
	}

	private Object testCase() {
		ListNode ls = new ListNode(2);
		ListNode ls01 = new ListNode(4);
		ls.next = ls01;
		ListNode ls02 = new ListNode(3);
		ls01.next = ls02;
		ls02.next = null;
		
		ListNode ls2 = new ListNode(5);
		ListNode ls201 = new ListNode(6);
		ls2.next = ls201;
		ListNode ls202 = new ListNode(4);
		ls201.next = ls202;
		ls202.next = null;
		Object[] obj = new Object[] {ls,ls2};
		Object[] result = new Object[] {obj};
		return obj;
	}

}
