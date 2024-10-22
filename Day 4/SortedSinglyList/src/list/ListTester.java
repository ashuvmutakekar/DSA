package list;



public class ListTester {

	public static void main(String[] args) {
		SortedList list1 = new SortedSingleLL();
		
		list1.Insert(30);
		list1.Insert(13);
		list1.Insert(20);
		list1.Insert(50);
		list1.Insert(20);
		list1.Print();
		//
		list1.delete(13);
		list1.Print();
	//
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
		list1.Print();
	}

}
