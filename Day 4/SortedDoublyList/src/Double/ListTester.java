package Double;

import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		Dlist list1 = new DoubleLL();
		list1.AddAtFront(5);
		list1.AddAtFront(10);
		list1.ForwardPrint();
		list1.AddAtEnd(11);
		list1.ForwardPrint();
		list1.BackwardPrint();
		int x=list1.DeleteAtFront();
		System.out.println("Deleted element: "+x);
		list1.ForwardPrint();

	}

}
