package sortedDLLtester;

public interface SortedDList {
   void Insert(int ele);
   
   void delete(int ele);
   void deleteAll(int ele);
   boolean search(int ele);
   void ForwardPrint();
   void BackwardPrint();
}
