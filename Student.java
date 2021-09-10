
public class Student {
	//name
	//studentId
	private String name;
	private int studentId;
	
	//default constructor
	public Student() {
		super();
		name = "";
		studentId = 0;
	}
	//overloaded constructor taking name and studentId
	public Student(String newName, int newStudentId) {
		super();
		setName(newName);
		setStudentId(newStudentId);
	}
	
	//setName
	public void setName(String newName) {
		name = newName;
	}
	
	//getName
	public String getName() {
		return name;
	}
	
	//setStudentId (studentId > 0)
	public void setStudentId(int newStudentId) {
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
	}
	
	//getStudentId
	public int getStudentId() {
		return studentId;
	}
	
	//toString
	public String toString() {
		return "Name: " + name + " Student Id: " + studentId;
	}
}
