package search;

public class Search {
   public static boolean findUsingLinearSearch(int[] arr, int element) {
	   boolean found=false;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==element) {
			   found= true;
		   }
	   }
	   
	  return found; 
	   
   }
   public static boolean findUsingBinarySearch(int[] arr, int element) {
	   boolean found=false;
	   int  low=0;
	   int  high=arr.length-1;
	   while(low<high) {
	   int mid= low+(high-low)/2;
	   if(element==arr[mid]) {
		   found=true;
		   break;
	   }
	   if(element<arr[mid]) {
		   high=mid-1;
	   }
	   else {
		   low=mid+1;
	   }
	 }
	  
	  return found; 
	   
   }
   
   public static void main(String[] args) {
	int[] arr= {1,3,5,7,2,5};
	
//		if(findUsingLinearSearch(arr, 3)) {
//			System.out.println("Element found");
//		}
//		else {
//			System.out.println("Element not found");
//		}
//		if(findUsingLinearSearch(arr, 4)) {
//			System.out.println("Element found");
//		}
//		else {
//			System.out.println("Element not found");
//		}
	if(findUsingBinarySearch(arr, 1)) {
		System.out.println("Element found");
	}
	else {
		System.out.println("Element not found");
	}
	if(findUsingBinarySearch(arr, 4)) {
		System.out.println("Element found");
	}
	else {
		System.out.println("Element not found");
	}
} 
}
