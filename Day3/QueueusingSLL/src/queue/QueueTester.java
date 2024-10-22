package queue;

public class QueueTester {
   public static void main(String[] args) {
	Queue q=new QueUseList();
	q.enqueue(10);
	q.enqueue(200);
	q.enqueue(300);
	q.Display();
	int res=q.dequeue();
	System.out.println("Deleted element :"+res);
	q.Display();
}
}
