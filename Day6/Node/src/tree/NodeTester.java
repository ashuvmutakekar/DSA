package tree;

import java.util.Scanner;

public class NodeTester {
    public static void PrintCountNodes() {
    	BinaryTree bt=new BinaryTree();
    	bt.CountNode();
    }
    public static void PrintCountLeafNodes() {
    	BinaryTree bt=new BinaryTree();
    	bt.CountLeafNode();
    }
    public static void PrintCountValueMatchNodes() {
    	Scanner sc=new Scanner(System.in);
    	BinaryTree bt=new BinaryTree();
    	System.out.println("Enter value of node to be matched");
    	int ele=sc.nextInt();
    	bt.CountValueMatchNode(ele);
    }
	public static void main(String[] args) {
		System.out.println("Number of nodes in tree :");
		NodeTester.PrintCountNodes();
		System.out.println("Number of Leaf nodes in tree :");
		NodeTester.PrintCountLeafNodes();
		System.out.println("Number of nodes in tree which has same value :");
		NodeTester.PrintCountValueMatchNodes();
	}

}
