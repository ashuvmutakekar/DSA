package tree;

public class TreeTester {

	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
		System.out.println("Traversing tree in InOrder");
		bt.InOrder();
		System.out.println("Traversing tree in PreOrder");
		bt.PreOrder();
		System.out.println("Traversing tree in PostOrder");
		bt.PostOrder();
	}

}
