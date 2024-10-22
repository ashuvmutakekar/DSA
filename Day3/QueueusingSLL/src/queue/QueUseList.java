package queue;

import list.SingleLL;
import list.list;

public class QueUseList implements Queue {

 private list list2;
 public QueUseList() {
	 list2=new SingleLL();
 }

	@Override
	public void enqueue(int ele) {
		list2.AddAtEnd(ele);
		
	}

	@Override
	public int dequeue() {
		int delete=list2.DeleteAtFront();
		return delete;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void Display() {
	list2.Print();
	}

}
