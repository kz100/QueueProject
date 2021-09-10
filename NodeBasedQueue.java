
public class NodeBasedQueue<T> implements UnboundedQueueInterface<T> {
	//instance variable
	private Node<T> front; //reference to a Node object (com
	private Node<T> rear; //
	private int numberOfItems;
	
	//default constructor
	@Override
	public Object dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String look() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
