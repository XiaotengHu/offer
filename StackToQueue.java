package test;

import java.util.Stack;

public class StackToQueue {
	Stack<Integer> stackOne = new Stack<Integer>();
	Stack<Integer> stackTwo = new Stack<Integer>();
	public void push(int node){
		stackOne.push(node);
	}
	public int pop(){
		if(stackOne.isEmpty() && stackTwo.isEmpty()){
			System.out.println("null");
		}
		if(stackTwo.isEmpty()){
			while(!stackOne.isEmpty()){
				stackTwo.push(stackOne.pop());
			}
		}
		return stackTwo.pop();
	}
}
