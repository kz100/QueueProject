import java.util.Scanner;

public class QueueDemo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		QueceInterface<Student> csc202WaitList = new ArrayBasedQueue<Student>(3);
		int option;
		
		do {
			System.out.println("Press 1 to add a student to the waitlist");
			System.out.println("Press 2 to remove the student at the front of the waitlist");
			System.out.println("Press 3 to look at the student at the front of the waitlist");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine(); //go to the next line
			
			if(option == 1) {
				System.out.println("What is the name of the student?");
				String newName = keyboard.nextLine();
				
				System.out.println("What is the student id of the student?")
				int newStudentId = keyboard.nextInt();
				
				Student currentStudent = new Student(newName,newStudentId);
				try {
					csc202WaitList.enqueue(currentStudent);
				}
				catch(QueueFullException e) {
					System.out.println(e.getMessage());
					System.out.println("The following student was not added to the waitlist: " + currentStudent);
				}
			}
			else if(option == 2) {
				try {
					Student studentAtFrontOfWaitList = csc202WaitList.dequeue();
					System.out.println(studentAtFrontOfWaitList);
				}
				catch(QueueEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 3) {
				System.out.println(csc202WaitList.look());
			}
			else if(option == 4) {
				System.out.println("Thank you for using the program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 4);
	}

}
