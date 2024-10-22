package list;

import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		list list1 = new SingleLL();
		list1.AddAtFront(5);
		list1.AddAtFront(10);
		list1.AddAtEnd(20);
		list1.AddAtEnd(30);
		list1.Print();
		int x=list1.DeleteAtFront();
		System.out.println("Deleted element "+x);
	
		list1.Print();

	}

}
