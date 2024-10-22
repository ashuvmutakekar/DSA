package queue;

import java.util.Arrays;

import Except.QueueEmptyException;
import Except.QueueFullException;

public class FixedQueue<T> implements Queue<T>{

	T[] queue;
	int rear;
	int front;

	public FixedQueue(int n) {
		 queue = (T[]) new Object[n];
		rear=-1;
		front=-1;
	}

	@Override
	public void enqueue(T ele) {
		if(isFull()) {
		System.out.println("Full");
		}
		else
		{
			 rear = (rear + 1) % queue.length;
		     queue[rear]=ele;
		  
		}
	}

	@Override
	public T dequeue() {
		T x=null;
		if(isEmpty()) {
			System.out.println("Empty");
			}
		else
			{
			 front = (front + 1) % queue.length; 
			 x=queue[front];
		
			
			return x;
			}
		return x;
		
		
	}

	@Override
	public boolean isFull() {
		try {
			if(rear==queue.length-1)
				
			{
				throw new QueueFullException("Queue is full");
			}
			
		}catch(QueueFullException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		try {
			if(rear==front)
				
			{
				throw new QueueEmptyException("Queue is empty");
			}
			
		}catch(QueueEmptyException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public void Display() {
		System.out.println(Arrays.toString(queue));
		
	}

}
