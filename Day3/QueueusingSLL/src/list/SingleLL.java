package list;



public class SingleLL implements  list{
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	public SingleLL() {
		head=null;
		tail=null;
	}

	@Override
	public void AddAtFront(int ele) {
		Node newnode=new Node();
		newnode.data=ele;
		newnode.next=head;
		head=newnode;
		if(tail==null) {
		   tail=head;  
		}
		
	}

	@Override
	public void AddAtEnd(int ele) {
		Node newnode=new Node();
		newnode.data=ele;
		newnode.next=null;
		if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
		tail.next=newnode;
		tail=newnode;
		
		
	}

	@Override
	public int DeleteAtFront() {
		if(head==null) {
			return -1;
		}
	Node temp=head;
	head=head.next;
	if(head==null) {
		tail=head;	
	}
	
		return temp.data;
	}

	@Override
	public void Print() {
		Node current=head;
		while(current!=null) {
			System.out.println(" "+current.data+" ");
			current=current.next;
		}
		System.out.println();
	}


}
