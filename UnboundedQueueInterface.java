
public interface UnboundedQueueInterface<T> extends QueueInterface<T> {
	//method headings
	
	//override the enqueue method
	public void enqueue(T item);
	
	//returns true if queue is empty otherwise returns false
	public boolean isEmpty();

}
