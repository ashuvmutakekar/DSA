package sortedDLLtester;



public class SortedDoubleLL implements  SortedDList{
	class Node{
		public int data;
		public Node next;
		public Node previous;
	}
	private Node head;
	private Node tail;
	public SortedDoubleLL() {
		head=null;
		tail=null;
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


	@Override
	public void Insert(int ele) {
		Node newNode=new Node();
		newNode.data=ele;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			tail=head;
			return;
		}
	
		Node current=head;
		while(current!=null) {
			if(current.data>ele) {
				break;
			}
			
			
			current=current.next;
		}
		
		if(current==head) {
			newNode.next=head;
			newNode.previous=null;
			head.previous=newNode;
		    head=newNode;
		    return;
			
		}
		if(current==null) {
			
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			newNode.next=null;
		}
		else {
		newNode.previous=current.previous;
		newNode.next=current;
	
		current.previous.next=newNode;
		current.previous=newNode;
	}
	}

	@Override
	public void delete(int ele) {
		
		boolean found=false;
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		while(current!=null) {
			if(current.data==ele) {
				found=true;
				break;
			}
			
			current=current.next;
			
		}
		
		if(current==head && current.next==null) {
			
			current=null;
			head=null;
		}
		if(current==head) {
			
			head=current.next;
			head.previous=null;
			
		}
		if(current==tail) {
			
			tail=current.previous;
			tail.next=null;
		}
		if(current==null) {
			return ;
		}
		else {
			current.next.previous=current.previous;
			
		}
		
	}
		
		
	


	@Override
	public void deleteAll(int ele) {
		Node current=head;
		while(current!=null)
		{
			if(current.data==ele) {
				delete(ele);
			
			}
			current=current.next;
		}
		
	}


	@Override
	public boolean search(int ele) {
	
		boolean found=false;
		Node current=head;
		if(head==null) {
			return found;
		}
		
		while(current!=null) {
			if(current.data==ele) {
				found=true;
			}
			else {
				found=false;
			}
			current=current.next;
		}
		return found;
	}
	


}
