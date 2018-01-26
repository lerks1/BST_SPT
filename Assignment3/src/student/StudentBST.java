package student;

/**Class to hold Student objects - Binary Search Tree structure - Modelled on BST Tree by Dionysios Athanasopoulos*/
public class StudentBST {
	
	private Student root;
	
	/**Returns Root node of BST*/
	public Student getRoot(){return root;}
	
	/**Sets Root of BST
	 * @param rootIn - Student object to set as Root of BST*/
	public void setRoot(Student rootIn){root = rootIn;}
	
	/**Finds the Student object with the Largest age within the BST and prints their details*/
	public void printLargest()
	{
		if (root == null){System.out.println("No Students");}
		else
		{
			Student examined = root;
			while (examined.getRightChild() != null)
			{
				examined = examined.getRightChild();
			}
			System.out.println("Oldest Student is " + examined.getName() + " at age " + examined.getAge());
		}
	}
	
	/**Calls parameterized printInOrder method - Utilises this.root*/
	public void printInOrder()
	{
		printInOrder(this.root);
	}
	
	/**Recursively searches through BST to print Student details in order of Age.
	 * @param in - Root to begin from.*/
	private void printInOrder(Student in)
	{
		if (in == null){}
		else
		{
			printInOrder(in.getLeftChild());
			System.out.println(in.getAge());
			printInOrder(in.getRightChild());
		}
	}
	
	/**Creates and Inserts a new Student into an appropriate location within the BST.
	 * 'insert' is overloaded and this version calls another private version.
	 * @param age - Age of new Student to insert
	 * @param name - Name of new Student to add*/
	public void insert(int age, String name)
	{
		insert(new Student(age, name), root);
	}
	
	/**Inserts new Student into an appropriate location within the BST
	 * @param newStudent - New Student to Add
	 * @param currentStudent - root Student (starting point)*/
	private void insert(Student newStudent, Student currentStudent){
		if(root == null)
		{
			root = newStudent;
		}
		else
		{
			if(currentStudent.getAge() < newStudent.getAge())
			{
				if (currentStudent.getRightChild() != null) insert(newStudent, currentStudent.getRightChild());
				else
				{
					currentStudent.setRightChild(newStudent);
				}
			}
			else
			{
				if (currentStudent.getLeftChild() != null) insert(newStudent, currentStudent.getLeftChild());
				else
				{
					currentStudent.setLeftChild(newStudent);
				}
			}
		}
	}

}
