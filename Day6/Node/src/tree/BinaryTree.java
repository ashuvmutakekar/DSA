package tree;



public class BinaryTree {
	class BTNode{
	 int data;
	 BTNode left;
	 BTNode right;	 
	}
	private BTNode root;
	private int count=0;
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
		 n1.data=8;
		 n1.left=n2;
		 n1.right=n3;
		 
		 n2.data=10;
		 n2.left=n4;
		 n2.right=null;
		 
		 n3.data=8;
		 n3.left=null;
		 n3.right=null;
		 
		 n4.data=8;
		 n4.left=null;
		 n4.right=n5;
		
		 n5.data=7;
		 n5.left=null;
		 n5.right=null;
		 root=n1;	 
	 }
	 
	public int CountNode (BTNode r) {
		
		if(r==null) {
			return 0;
		}
		
		if(r.left!=null) {
			count++;
			CountNode (r.left);
		}
		if(r.right!=null) {
			count++;
			CountNode (r.right);
		}
		
		return count;
	}

      public void CountNode () {
		
	 int count=CountNode (root);
	 System.out.println(count+1);
	}

	 
      public int CountLeafNode (BTNode r) {
  		
  		if(r==null) {
  			return  0;
  		}
  		
  		if(r.left==null && r.right==null) {
  			count++;
  		}
  		else
  		{
  			CountLeafNode(r.left);
  			
  			CountLeafNode(r.right);
  		}
  		
  		
  		return count;
  	}

        public void CountLeafNode () {
  		
  	 int count=CountLeafNode (root);
  	 System.out.println(count);
  	}
        
        public int CountValueMatchNode (BTNode r,int ele) {
    		
    		if(r==null) {
    			return 0;
    		}
   		
    		else
    		
		   {
   			if(r.data==ele) {
   			  count++;
   			}
   			CountValueMatchNode (r.left,ele);
   			CountValueMatchNode (r.right,ele);
   		}
		
    		return count;
    	}

          public void CountValueMatchNode (int ele) {
    		
    	 int count=CountValueMatchNode (root,ele);
    	 System.out.println("Count :" +count);
    	}

        

}