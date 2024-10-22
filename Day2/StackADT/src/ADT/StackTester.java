package ADT;

import java.util.Scanner;



public class StackTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		stack s= new FixedStack(5);
		
	       for(int i=0;i<5;i++) {
	    	   System.out.println("Enter element to push");
	    	   int ele=sc.nextInt();
	    	   s.push(ele);
	       }
	      s.Display();
	       String ch="Y";
	       while(ch.equals("Y")) {
	    	   
	    	   
	    	    int x= s.pop();
	    	 
	    	  System.out.println(x);
	    	    System.out.println("If you dont want to delete preass N");
	   	       
	   	       ch=sc.next();
	       }
		}

	}


