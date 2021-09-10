
public class QueueDemo {
	public static void main(String[] args) {
		QueueInterface<String> waitList = new ArrayBasedQueue<String>();
		try {
			waitList.enqueue("Jack");
			waitList.enqueue("Jill");
			waitList.enqueue("Frank");
			waitList.enqueue("Mary");
			waitList.enqueue("Bruce");
			//waitList.enqueue("Anne");
			
			System.out.println(waitList.dequeue());
			//waitList.enqueue("Anne");
			System.out.println(waitList.dequeue());
			System.out.println(waitList.dequeue());
			System.out.println(waitList.dequeue());
			System.out.println(waitList.dequeue());
			//System.out.println(waitList.dequeue());
			
			//System.out.println(waitList.look());
		}
		catch(QueueFullException | QueueEmptyException e) {
			System.out.println(e.getMessage());
		}
	}

}
