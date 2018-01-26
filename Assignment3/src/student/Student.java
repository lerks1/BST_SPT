package student;

/**Class to represent Students - Each Student Object has an Age, name and Left and Right Children (Student Objects)
 * Designed for Storage in a Binary tree*/
public class Student {
	
	private int age;
	private String name;
	private Student leftChild, rightChild;
	
	/**Constructor - Creates Student objects
	 * @param age - Age of Student
	 * @param name - Name of Student*/
	public Student(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	/**Returns age of Student*/
	public int getAge(){return age;}
	
	/**Returns name of Student*/
	public String getName(){return name;};
	
	/**Returns Left Child of Student*/
	public Student getLeftChild(){return leftChild;}
	
	/**Returns Right Child of Student*/
	public Student getRightChild(){return rightChild;}
	
	/**Sets age of Student
	 * @param in - Age to set as Student Age*/
	public void setAge(int in){age = in;}
	
	/**Sets name of Student
	 * @param in - New name to give Student*/
	public void setName(String in){name = in;};
	
	/**Sets Left Child of Student
	 * @param s - Student to set as Left Child*/
	public void setLeftChild(Student s){leftChild = s;}
	
	/**Sets Right Child of Student
	 * @param s - Student to set as Right Child*/
	public void setRightChild(Student s){rightChild = s;}

}
