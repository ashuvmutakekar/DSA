package bst;

import java.util.Scanner;

public class NodeTester {
   
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		System.out.println("Height");
		bt.printHeight();
		System.out.println("Smallest Element");
		bt.printSmallest() ;
		System.out.println("Greatest Element");
		bt.printGreatest() ;
		System.out.println("Element in inorder");
		bt.InOrder();
		
		bt.Delete(1);
		bt.Delete(7);
		bt.Delete(3);
		System.out.println("Element in inorder");
		bt.InOrder();
	}

}
