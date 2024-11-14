package heap;

import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		int[] heapSortNums = {4, 1, 9, 7, 5, 2, 6, 3};
		System.out.println("Before sorting - " + Arrays.toString(heapSortNums));
		HeapSort.heapSort(heapSortNums);
		System.out.println("After heap sort - " + Arrays.toString(heapSortNums));
	}
}
