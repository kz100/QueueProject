
public class ArrayBasedQueue<T> implements QueueInterface<T> {
	//instance variables
	private int front;
	private int rear;
	private int numberOfItems;
	private T[] queue; //reference to an array 
	
	//default constructor
	public ArrayBasedQueue() {
		front = 0;
		rear = 0;
		numberOfItems = 0;
		queue = (T[])new Object[5];
	}
	
	//overloaded constructor
	public ArrayBasedQueue(int size) {
		front = 0;
		rear = 0;
		numberOfItems = 0;
		if(size > 0) {
			queue = (T[])new Object[size];
		}
		else {
			queue = (T[])new Object[5];
		}
	}
	
	@Override
	public void enqueue(T item) throws QueueFullException {
		// TODO Auto-generated method stub
		if(numberOfItems < queue.length) {
			queue[rear] = item;
			if(rear == queue.length-1)
				rear = 0;
			else
				rear++;
			
			numberOfItems++;
		}
		else {
			throw new QueueFullException("Enqueue attempted on an full queue!");
		}
	}
	
	@Override
	public T dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(numberOfItems > 0) {
			T frontItem = queue[front];
			queue[front] = null; // remote the item at the front
			if(front == queue.length-1)
				front = 0;
			else
				front++;
			numberOfItems--;
			return frontItem;
		}
		else {
			throw new QueueEmptyException("Dequeue attempted on an empty queue!");
		}
		//return null;
	}
	
	@Override
	public String look() {
		// TODO Auto-generated method stub
		String frontItem;
		if(numberOfItems > 0) {
			frontItem = queue[front].toString();
		}
		else {
			frontItem = "Queue is Empty!";
		}
		return frontItem;
	}
	
}
