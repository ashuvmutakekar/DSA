package queue;

import java.util.Scanner;

public class QueueGenericTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       Queue<Integer> q=new FixedQueue(5);
       for(int i=0;i<5;i++) {
    	   System.out.println("Enter element to push");
    	   int ele=sc.nextInt();
    	   q.enqueue(ele);
       }
      q.Display();
       String ch="Y";
       while(ch.equals("Y")) {
    	   
    	   
    	    int x= q.dequeue();
    	 
    	  System.out.println(x);
    	    System.out.println("If you dont want to delete preass N");
   	       
   	       ch=sc.next();
       }
	}

}
