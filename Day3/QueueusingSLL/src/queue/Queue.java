package queue;

public interface Queue {
  void enqueue(int ele);
    int dequeue();
   boolean isFull();
  boolean isEmpty();
  void Display();
}
