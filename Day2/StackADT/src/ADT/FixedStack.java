package ADT;

import java.util.Arrays;

import Except.StackEmptyException;
import Except.StackFullException;

public class FixedStack implements stack {
	 int[] stack;
	 int top;

	public FixedStack(int n) {
		stack=new int[n];
		top=-1;
	}

	@Override
	public void push(int ele) {
		try {
			if(isFull()) {
				throw new StackFullException("Stack full");
			}
			else
			{
				++top;
				stack[top]=ele;
			}
		}catch(StackFullException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public int pop() {
		int x=0;
		try {
			if(isEmpty()) {
				throw new StackEmptyException("Stack Empty");
			}
			else
			{
				x=stack[top];
				--top;
				
			}
		}catch(StackEmptyException e) {
			System.out.println(e.getMessage());
		}
		return x;
	}

	@Override
	public boolean isFull() {
		if(top==stack.length-1) {
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(top==-1)
		{
			return true;
		}
		else
		return false;
	}

	@Override
	public void Display() {
		System.out.println(Arrays.toString(stack));
		
	}

	
}
