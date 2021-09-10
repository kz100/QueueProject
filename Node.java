
public class Node<T> {
	//instance variables
	private T data;
	private Node<T> link;
	
	//constructor
	public Node(T newData) {
		data = newData;
		link = null;
	}
	
	//non-static methods
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node<T> otherNode) {
		this.link = otherNode;
	}
	
	public Node<T> getLink() {
		return link;
	}
}
