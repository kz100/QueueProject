
public interface QueueInterface<T> {
	//method headings
	
	//adds an item to the rear of the queue if it is not full
	//otherwise throws QueueFullException
	public void enqueue(T item) throws QueueFullException;
	
	//removes the item at the front of the queue if there is one and returns it
	//otherwise throws QueueEmptyException
	public T dequeue() throws QueueEmptyException;

	//returns the front of the queue as a String if there is one
	//otherwise returns a String that has "Queue is Empty"
	public String look();
}
