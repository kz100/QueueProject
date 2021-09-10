
public class NodeDemo {
	public static void main(String[] args) {
		Node<Student> firstNode = new Node<Student>(new Student("Peter",1));
		Node<Student> secondNode = new Node<Student>(new Student("Mary",2));
		
		firstNode.setLink(secondNode);
		
		Node<Student> thirdNode = new Node<Student>(new Student("Paul",3));
		
		secondNode.setLink(thirdNode);

		//loop through the chain of nodes starting with the firstNode
		//printing out the information stored in each Node
		//at the end of the loop print the total number of nodes in the chain
		//do not use a for loop or an integer variable to accomplish this task
		Node<Student> currentNode = firstNode;
		int count = 0;
		while(current)Node !=null) {
			System.out.println(currentNode.getData(),toString());
			currentNode = currentNode.getLink();
			count++;
		}
		
		System.out.println("Total number of Node in the chain " + count);l
	}

}
