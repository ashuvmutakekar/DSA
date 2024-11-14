package hash;



public class HashTester {
public static void main(String[] args) {
	Hash h=new hashTable();
	int[ ] insertKey = {12,3,56,7,12,45,68,34,89,23};
	for(int i:insertKey) {
		h.insert(i);
	}
	int[ ] searchKey = {12,25,100,insertKey[5]};
	for(int i:searchKey) {
		if(h.search(i)) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
	}
} 

}
