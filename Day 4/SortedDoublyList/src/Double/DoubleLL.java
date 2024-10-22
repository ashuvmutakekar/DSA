package Double;



public class DoubleLL implements  Dlist{
	class Node{
		int data;
		Node next;
		Node previous;
	}
	private Node head;
	private Node tail;
	public DoubleLL() {
		head=null;
		tail=null;
	}

	@Override
	public void AddAtFront(int ele) {
		Node newnode=new Node();
		newnode.data=ele;
	
		newnode.previous=null;
	
		if(tail==null) {
		   tail=newnode;  
		}
		else
		{
			head.previous=newnode;
		}
		newnode.next=head;
		head=newnode;
	}

	@Override
	public void AddAtEnd(int ele) {
		Node newnode=new Node();
		if(head==null) {
			head=newnode;
			tail=newnode;
			return;
		}
		else {
		
		tail.next=newnode;
		newnode.previous=tail;
		}
		
		newnode.data=ele;
		newnode.next=null;
		
		
		
		tail=newnode;
		
		
	}

	@Override
	public int DeleteAtFront() {
		if(head==null) {
			return -1;
		}
	Node temp=head;
	head=head.next;
	head.previous=null;
	if(head==null) {
		tail=head;	
	}
	
		return temp.data;
	}

	@Override
	public void ForwardPrint() {
		Node current=head;
		while(current!=null) {
			System.out.println(" "+current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	@Override
	public void BackwardPrint() {
		Node current=tail;
		while(current!=null) {
			System.out.println(" "+current.data+" ");
			current=current.previous;
		}
		System.out.println();
	}

}
