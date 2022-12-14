import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;

public class StudentDemo {
	
	private int studentID;  
	private String studentName;
		
	StudentDemo(int studentID,String studentName){ 
		
		this.studentID=studentID;
		this.studentName=studentName;
			
	}
		
	// we are overriding method 
	// we are using toString method because without this method we will get output as HASH CODE
		
	@Override
	public String toString(){ 
		return "[id="+studentID+" name="+studentName+"]";			
	}

	public static void main(String[] args) {
			
		StudentDemo student1=new StudentDemo(1,"Omkar");
		StudentDemo student2=new StudentDemo(2,"Abhi");
		StudentDemo student3=new StudentDemo(3,"Rohit");
		StudentDemo student4=new StudentDemo(4,"Mohit");
		StudentDemo student5=new StudentDemo(2,"Abhi");
			
			
		HashSet<StudentDemo>studentHashSet=new HashSet<StudentDemo>();
			
			studentHashSet.add(student1);
			studentHashSet.add(student2);
			studentHashSet.add(student3);
			studentHashSet.add(student4);
			studentHashSet.add(student5);
			
			System.out.println("*****HashSetDemo******");
			System.out.println(studentHashSet);
			System.out.println("**********************");
			
		LinkedList<StudentDemo> studentLinkedList= new LinkedList<StudentDemo>();
			
			studentLinkedList.add(student1);
			studentLinkedList.add(student2);
			studentLinkedList.add(student3);
			studentLinkedList.add(student4);
			studentLinkedList.add(student5);
			
			System.out.println("*****LinkedListDemo******");
			System.out.println(studentLinkedList);
			System.out.println("**********************");
			
		ArrayList<StudentDemo> studentArrayList= new ArrayList<StudentDemo>();
			
			studentArrayList.add(student1);
			studentArrayList.add(student2);
			studentArrayList.add(student3);
			studentArrayList.add(student4);
			studentArrayList.add(student5);
			
			System.out.println("*****ArrayListDemo******");
			System.out.println(studentArrayList);
			System.out.println("**********************");			
	}	
}
