package test;

import java.util.ArrayList;
import java.util.Stack;
class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
	}
}
public class PrintList {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> list = new ArrayList<>();
		if(listNode == null){
			return list;
		}
		Stack<ListNode> stack = new Stack<>();
		while(listNode != null){
			stack.push(listNode);
			listNode = listNode.next;
		}
		while(!stack.isEmpty()){
			list.add(stack.pop().val);
		}
		return list;
	}
public static void main(String[] args) {
	    ListNode n1 = new ListNode(1);
	    ListNode n2 = new ListNode(2);
	    ListNode n3 = new ListNode(3);
	    ListNode n4 = new ListNode(4);
	    ListNode n5 = new ListNode(5);
	    n1.next = n2;
	    n2.next = n3;
	    n3.next = n4;
	    n4.next = n5;
	    ArrayList<Integer> list = new ArrayList<>();
	    PrintList pr = new PrintList();
	    list = pr.printListFromTailToHead(n1);
	    System.out.println(list);
}
}
