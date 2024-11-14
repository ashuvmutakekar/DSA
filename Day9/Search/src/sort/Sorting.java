package sort;

import java.util.Arrays;

import search.Search;

public class Sorting {
 public static int[] DescwithBubbleSort(int[] arr) {
	 int n=arr.length;
	
	 while(n>1) {
		 int left=0;
		 while(left<n-1){
			if(arr[left]<arr[left+1]) {
				int temp=arr[left];
				arr[left]=arr[left+1];
				arr[left+1]=temp;
			}
			left=left+1;
		 }
		 n=n-1;
	 }
	 
	return arr;
	 
 }
 public static boolean DescwithOptBubbleSort(int[] arr) {
	 int n=arr.length;
	 boolean flag=false;
	 int swapCount=0;
	 while(n>1) {
		 
		 int left=0;
		 while(left<n-1){
			if(arr[left]<arr[left+1]) {
				swapCount++;
			}
			left=left+1;
		 }
		
		 n=n-1;
	 }

	 if(swapCount==0) {
			flag= true;
	 }
	 return flag;

	 
 }
 
 public static int[] DescwithInsertionSort(int[] arr) {
	int sortedsize=1;
	int n=arr.length;
	while(sortedsize<n) {
		int insertedele=arr[sortedsize];
		int i=sortedsize-1;
		while(i>=0) {
			if(insertedele>arr[i]) {
				arr[i+1]=arr[i];				
			}
			else
				break;
			i=i-1;
		}
		arr[i+1]=insertedele;
		sortedsize=sortedsize+1;
	}
	 
	return arr;
	
	 
 }
 static void Merge(int[] arr,int start1,int end1,int start2,int end2) {
	 int[] mergedArray=new int[end2 - start1 + 1];
	 int i1=start1;
	 int i2=start2;
	 int r=0;
	 while((i1<=end1) && (i2<=end2)) {
		 if(arr[i1]>arr[i2]) {
			 mergedArray[r]=arr[i1];
			 i1++;
		 } 
		 else {
			 mergedArray[r]=arr[i2]; 
			 i2++;
		 }
		 r++;
	 }
	 while(i1<=end1 ) {
		 
			 mergedArray[r]=arr[i1];
			 i1++;
			 r++;
	 }
	 while(i2<=end2 ) {
		 
		 mergedArray[r]=arr[i2];
		 i2++;
		 r++;
 }
	
	 for (int i = 0; i < mergedArray.length; i++) {
	        arr[start1 + i] = mergedArray[i];
	    }
	 return ;
 }

	public static int[] DescwithMergeSort(int[] arr,int start,int end) {
		if((end-start+1)<=1) {
			  return null ;
		   }
		int mid= start+(end-start)/2;
		DescwithMergeSort(arr,start,mid);
		DescwithMergeSort(arr,mid+1,end);
		
		Merge(arr,start,mid,mid+1,end);
		return arr;
		
	}
	
	 static int partition(int[] arr,int start,int end)
	   {
		   int pivot=start;
		   int left=start+1;
		   int right=end;
		   while(left<=right) {
			   while((left<=right) && arr[left]>arr[pivot]) {
				   left=left+1;
			   }
			   while((left<=right) && arr[right]<arr[pivot]) {
				   right=right-1;
			   }
			   if(left<right) {
				   int temp=arr[left];
				   arr[left]=arr[right];
				   arr[right]=temp;
			   }
		   }
		   
		   int temp=arr[pivot];
		   arr[pivot]=arr[right];
		   arr[right]=temp;
		   return right;
	   }
   public static int[] DescwithQuickSort(int[] arr,int start,int end) {
	   if((end-start+1)<=1) {
		  return null;
	   }
	   int pivot=Sorting.partition(arr,start,end);
	   DescwithQuickSort(arr,start,pivot-1);
	   DescwithQuickSort(arr,pivot+1,end);
	 	
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr= {9,1,8,4,3,7,2,5};
		int[] arr1= {9,1,8,10,13,7,2,5};
		int[] arr2= {9, 8, 7, 5, 4, 3, 2, 1};
		int[] arr3= {12, 1, 7, 6, 4, 9, 10, 1};
		int[] arr4= {112, 178,347, 6, 4, 9, 10, 1};
		System.out.println("Descending Order with Bubble Sort :");
		System.out.println(Arrays.toString(DescwithBubbleSort(arr)));
		System.out.println("Descending Order with Insertion Sort :");
		System.out.println(Arrays.toString(DescwithInsertionSort(arr3)));
		if( DescwithOptBubbleSort(arr2)) {
			System.out.println("Already Sorted");
		}
		else
		{
			System.out.println("Not sorted");
		}
		System.out.println("Descending Order with Quick Sort :");
		System.out.println(Arrays.toString(DescwithQuickSort(arr4,0,arr4.length-1)));
		
		System.out.println("Descending Order with Merge Sort :");
		System.out.println(Arrays.toString(DescwithMergeSort(arr1,0,arr1.length-1)));
	}

}
