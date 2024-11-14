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
