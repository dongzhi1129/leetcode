package com.leetcode.algorithm;

/**
 * 
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
 * 465 = 807.
 *
 */
public class AddTwoNumbersFunction {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l1;
		}
		if (l2 == null) {
			return l2;
		}
		ListNode l1Ptr = l1;
		ListNode l2Ptr = l2;

		ListNode l3Ptr = null, head = null;
		int incr = 0;
		while (l1Ptr != null && l2Ptr != null) {
			int l1Value = l1Ptr.val;
			int l2Value = l2Ptr.val;
			int sub = l1Value + l2Value + incr;
			int l3Value = (incr = sub / 10) == 0 ? sub : sub % 10;
			if (l3Ptr == null) {
				head = l3Ptr = new ListNode(l3Value);
			} else {
				l3Ptr.next = new ListNode(l3Value);
				l3Ptr = l3Ptr.next;
			}
			l1Ptr = l1Ptr.next;
			l2Ptr = l2Ptr.next;
		}
		while (l1Ptr != null) {
			int l1Value = l1Ptr.val;
			int sub = l1Value + incr;
			int l3Value = (incr = sub / 10) == 0 ? sub : sub % 10;
			if (l3Ptr == null) {
				head = l3Ptr = new ListNode(l3Value);
			} else {
				l3Ptr.next = new ListNode(l3Value);
				l3Ptr = l3Ptr.next;
			}
			l1Ptr = l1Ptr.next;
		}

		while (l2Ptr != null) {
			int l2Value = l2Ptr.val;
			int sub = l2Value + incr;
			int l3Value = (incr = sub / 10) == 0 ? sub : sub % 10;
			if (l3Ptr == null) {
				head = l3Ptr = new ListNode(l3Value);
			} else {
				l3Ptr.next = new ListNode(l3Value);
				l3Ptr = l3Ptr.next;
			}
			l2Ptr = l2Ptr.next;
		}
		if (incr != 0) {
			l3Ptr.next = new ListNode(incr);
			l3Ptr = l3Ptr.next;
		}
		l3Ptr.next = null;
		return head;

	}

	public static ListNode addTwoNumbersPlus(ListNode l1, ListNode l2) {
		ListNode l1Ptr = l1, l2Ptr = l2, sumHead = null,sumCurrentNode=null;
		int carray = 0;
		while (l1Ptr != null || l2Ptr != null) {
			int l1PtrValue = (l1Ptr == null) ? 0 : l1Ptr.val;
			int l2PtrValue = (l2Ptr == null) ? 0 : l2Ptr.val;
			int sum = 0;
			int sumValue = (carray = (sum = l1PtrValue + l2PtrValue + carray) / 10) == 0 ? sum : sum % 10;
			ListNode sumNode = new ListNode(sumValue);
			if(sumCurrentNode == null) {
				sumHead = sumCurrentNode = sumNode;
			}else {
				sumCurrentNode.next=sumNode;
				sumCurrentNode = sumCurrentNode.next;
			}
			l1Ptr = (l1Ptr== null)?null:l1Ptr.next;
			l2Ptr = (l2Ptr== null)?null:l2Ptr.next;
			
		}
		if(carray > 0 ) {
			sumCurrentNode.next = new ListNode(carray);
		}
		return sumHead;

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
