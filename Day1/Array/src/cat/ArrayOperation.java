package cat;

import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Physical size for array");
		int size=sc.nextInt();
		
		int[] a=new int[size];
		int count;
		for(count=0;count<size;++count)
		{
			System.out.println("Enter element");
			a[count]=sc.nextInt();
		}
		ArrayOperation.PrintArray(a);
	
		ArrayOperation.DeleteArrayEleAtEnd(a,--count);
		a=ArrayOperation.deleteFromPosition(a,2);
		ArrayOperation.PrintArray(a);
		System.out.println("Enter element to add at pertricular position");
		int x=sc.nextInt();
		a=ArrayOperation.InsertAtPosition(a, 2, x);
		ArrayOperation.PrintArray(a);
	}
	
	public static void PrintArray(int[] a)
	{
		System.out.println(" elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}
	public static void DeleteArrayEleAtEnd(int[] a,int c)
	{     
		System.out.println(" elements are delete");
		for(int i=0;i<c;i++)
		{
			System.out.println(a[i]);
			
		}
	}
	public static int[] deleteFromPosition(int[] a,int pos)
	{     
		System.out.println(" elements are delete from perticular position");
		int[] arr=new int[a.length-1];
		for(int i=0;i<a.length;i++)
		{
			if(i==pos) {
				arr[i]=a[i+1];
				i++;
			}
			else {
				arr[i]=a[i];
			}	

		}
		return arr;
	
		
	}
	public static int[] InsertAtPosition(int[] a,int pos,int ele)
	{     
		System.out.println(" elements are insert at perticular position");
		int[] arr=new int[a.length+1];
		for(int i=0;i<arr.length;i++)
		{
			if(i>=pos)
			{
				if(i==pos) {
				arr[i]=ele;
				}
				else
				{
					arr[i]=a[i-1];
				}
			}
			else {
				arr[i]=a[i];
			}

		}
		return arr;
	
		
	}
	

}
