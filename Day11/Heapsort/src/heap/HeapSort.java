package heap;

public class HeapSort {
	private static void makeMaxHeap(int[] arr, int parent, int n) {
		int maxChildPos = parent * 2 + 1;
		int rightChildPos = parent * 2 + 2;

		if (rightChildPos < n) {
			if (arr[rightChildPos] > arr[maxChildPos])
				maxChildPos = rightChildPos;
		}

		if (arr[parent] > arr[maxChildPos])
			return;

		int t = arr[parent];
		arr[parent] = arr[maxChildPos];
		arr[maxChildPos] = t;

		// Is maxChildPos a leaf node?
		if (!((maxChildPos * 2 + 1) < n))
			return;

		makeMaxHeap(arr, maxChildPos, n);
	}

	private static void convertToMaxHeap(int[] arr, int n) {
		int lastParent = (n / 2) - 1;
		while (lastParent >= 0) {
			makeMaxHeap(arr, lastParent, n);
			--lastParent;
		}
	}

	public static void heapSort(int[] arr) {
		convertToMaxHeap(arr, arr.length);

		int lastChildPos = arr.length - 1;
		while (lastChildPos > 0) {
			// Swap root and lastChildPos values
			int t = arr[0];
			arr[0] = arr[lastChildPos];
			arr[lastChildPos] = t;

			if (lastChildPos > 1)
				makeMaxHeap(arr, 0, lastChildPos);

			--lastChildPos;
		}
	}
}
