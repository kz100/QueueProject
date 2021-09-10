
public class QueueFullException extends Exception {
	//instance variables
	//none
	
	//default constructor
	public QueueFullException() {
		super(); //calls the default constructor of the parent class (Exception)
	}
	
	//overloaded constructor
	public QueueFullException(String message) {
		super(message); //calls the overloaded constructor of the parent class (Exception)
	}
	
	//non-static methods
	//none
}
