package bst;



public class BinaryTree {
	class BTNode{
	 int data;
	 BTNode left;
	 BTNode right;	 
	}
	private BTNode root;
	private int height=0;
	public BinaryTree()
	{
		root=null;
		createNode();
	}
	 public void createNode() {
		 BTNode n1=new BTNode();
		 BTNode n2=new BTNode();
		 BTNode n3=new BTNode();
		 BTNode n4=new BTNode();
		 BTNode n5=new BTNode();
		 BTNode n6=new BTNode();
		 BTNode n7=new BTNode();
		 n1.data=4;
		 n1.left=n2;
		 n1.right=n3;
		 
		 n2.data=2;
		 n2.left=n4;
		 n2.right=n5;
		 
		 n3.data=6;
		 n3.left=n6;
		 n3.right=n7;
		 
		 n4.data=1;
		 n4.left=null;
		 n4.right=null;
		
		 n5.data=3;
		 n5.left=null;
		 n5.right=null;
		 
		 n6.data=5;
		 n6.left=null;
		 n6.right=null;
		 
		 n7.data=7;
		 n7.left=null;
		 n7.right=null;
		 root=n1;	 
	 }
	 private void InOrder(BTNode r) {
		    if (r == null) {
		        return;
		    }
		    InOrder(r.left) ;
		    System.out.println(r.data);
		    InOrder(r.right);
		}

	 public void InOrder()
	 {
		 InOrder(root);
		 System.out.println(" ");
	 }
	 private int findHeight(BTNode r) {
	        if (r == null) {
	            return -1;
	        }
	        
	       
	        int leftHeight = findHeight(r.left);
	        int rightHeight = findHeight(r.right);
	        
	        
	        return Math.max(leftHeight, rightHeight) + 1;
	    }

	    public void printHeight() {
	        int height = findHeight(root);
	        System.out.println(height);
	    }


private int findSmallest(BTNode r) {
    if (r == null) {
        return 0;
    }
    BTNode ios=r.left;
    BTNode iosp=null;
    while(ios!=null) {
    	iosp=ios;
    	ios=ios.left;
    }
   
   
    
    return iosp.data;
}

public void printSmallest() {
    int small =  findSmallest(root);
    System.out.println(small);
}

private int findGreatest(BTNode r) {
    if (r == null) {
        return 0;
    }
    BTNode ios=r.right;
    BTNode iosp=null;
    while(ios!=null) {
    	iosp=ios;
    	ios=ios.right;
    }
   
   
    
    return iosp.data;
}

public void printGreatest() {
    int big =  findGreatest(root);
    System.out.println(big);
}


public void Delete(int val) {
	BTNode parent=null;
	BTNode current=root;
	while(current!=null) {
		if(val==current.data) {
			System.out.println("found");
			break;
		}
		parent=current;
		if(val<current.data)
		{
			current=current.left;
		}
		else {
			current=current.right;
		}
	}
	if(current==null) {
		System.out.println("Not found");
		return ;
	}
	
	if(current.left==null && current.right==null) {
		if(current==root) {
			root=null;
			return;
		}
		if(current==parent.left) {
			parent.left=null;
		}
		else {
			parent.right=null;
		}
		return;
	}
	
	BTNode child=null;
	if(current.left==null) {
		child=current.right;
	}
	if(current.right==null) {
		child=current.left;
	}
	if(child!=null) {
		if(current==parent.left) {
			parent.left=child;
		}
		else {
			parent.right=child;
		}
		return;
	}
	
	BTNode iopp=current;
	BTNode iop=current.left;
	while(iop.right!=null) {
		iopp=iop;
		iop=iop.right;
	}
	int temp=current.data;
	current.data=iop.data;
	iop.data=temp;
	if(iop==iopp.right) {
		iopp.right=iop.left;
	}
	else {
		iopp.left=iop.right;
	}
	
}






















}