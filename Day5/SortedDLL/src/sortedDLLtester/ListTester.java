package sortedDLLtester;



public class ListTester {

	public static void main(String[] args) {
		SortedDList list1 = new SortedDoubleLL();
		
		list1.Insert(30);
		list1.Insert(13);
		list1.Insert(20);
		list1.Insert(50);
		list1.Insert(20);
		list1.ForwardPrint();
		list1.BackwardPrint();

		list1.delete(13);
		list1.ForwardPrint();

		if(list1.search(50))
				{
			System.out.println("Found");
				}
		else
		{
			System.out.println("Not found");
		}
		//
		list1.deleteAll(20);
		list1.ForwardPrint();
		list1.BackwardPrint();
	}

}
