package hash;

import list.SingleLL;

public class hashTable implements Hash{
	public int size;
	public SingleLL[] buckets;
	
	public hashTable() {
		size = 10;
		buckets = new SingleLL[size];
		for (int i = 0; i < 10; ++i) {
			buckets[i] = new SingleLL();
		}
	}
	private int modN(int key) {
		return key % size;
	}
	
	@Override
	public void insert(int key) {
		int bucketId = modN(key);
		
		System.out.println("Storing key " + key + " in bucket #" + bucketId );
		buckets[bucketId].Insert(bucketId);
	}

	@Override
	public boolean search(int key) {
		int bucketId = modN(key);
		
		return buckets[bucketId].search(key);
	}

}