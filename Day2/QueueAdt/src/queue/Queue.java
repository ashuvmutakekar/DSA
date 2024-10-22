package queue;

public interface Queue<T> {
  void enqueue(T ele);
    T dequeue();
    boolean isFull();
  boolean isEmpty();
  void Display();
}
