
public class QueueEmptyException extends Exception {
	//instance variables
	//none
	
	//default constructor
	public QueueEmptyException() {
		super(); //calls the default constructor of the parent class (Exception)
	}
	
	//overloaded constructor
	public QueueEmptyException(String message) {
		super(message); //calls the overloaded constructor of the parent class (Exception)
	}
	
	//non-static methods
	//none
}
