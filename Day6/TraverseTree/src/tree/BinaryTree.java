package tree;

public class BinaryTree {
	class BTNode{
	 int data;
	 BTNode left;
	 BTNode right;	 
	}
	private BTNode root;
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
		 n1.data=5;
		 n1.left=n2;
		 n1.right=n3;
		 
		 n2.data=10;
		 n2.left=n4;
		 n2.right=null;
		 
		 n3.data=6;
		 n3.left=null;
		 n3.right=null;
		 
		 n4.data=8;
		 n4.left=null;
		 n4.right=null;
		 
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
	 public void PreOrder(BTNode r)
	 {
		 if (r == null) {
		        return;
		    }
		 System.out.println(r.data);
		    PreOrder(r.left) ;
		   
		    PreOrder(r.right);
		
	 }
	 public void PreOrder()
	 {
		 PreOrder(root);
		 System.out.println(" ");
	 }
	 public void PostOrder(BTNode r)
	 {
		 if (r == null) {
		        return;
		    }
		
		    PostOrder(r.left) ;
		    PostOrder(r.right);
		    System.out.println(r.data);
	 }
	 public void PostOrder()
	 {
		 PostOrder(root);
		 System.out.println(" ");
	 }
	 
 
}
