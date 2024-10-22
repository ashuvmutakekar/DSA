package list;



public class SortedSingleLL implements  SortedList{
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	public SortedSingleLL() {
		head=null;
		tail=null;
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
		Node previous=null;
		Node current=head;
		while(current!=null) {
			if(current.data>ele) {
				break;
			}
			
			previous=current;
			current=current.next;
		}
		
		if(current==head) {
			newNode.next=head;
		    head=newNode;
		    return;
			
		}
		if(current==null) {
			
			previous.next=newNode;
			newNode.next=null;
		}
		newNode.next=current;
		previous.next=newNode;
	}


	@Override
	public void delete(int ele) {
		Node previous=null;
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
			previous=current;
			current=current.next;
			
		}
		
		if(current==head && current.next==null) {
			
			current=null;
			head=null;
		}
		if(current==head) {
			
			head=current.next;
			
		}
		else
		previous.next=current.next;
		
		
		
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
		Node previous=null;
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
