package clients;
import student.StudentBST;

/**Pre-Configured Client Class used to demonstrate a BST search for the oldest Student in 
 * StudentBST 'students'*/
public class StudentClient {
	
	public static void main(String[] args) {
	StudentBST students = new StudentBST();
	
	students.insert(23, "Jack");
	students.insert(21, "Jeff");
	students.insert(29, "Jasmine");
	students.insert(30, "Jenny");
	students.insert(22, "Joel");
	students.insert(44, "Joeline");
	students.insert(31, "Josephine");
	students.insert(18, "Josh");
	
	students.printLargest();

	}
	
}
