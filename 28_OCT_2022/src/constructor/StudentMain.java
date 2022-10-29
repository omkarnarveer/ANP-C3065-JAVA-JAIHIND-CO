package constructor;
class Student{
	
	int studentId;
	String studentName;
	
	Student(int sId,String sName){
		studentId=sId;
		studentName=sName;
	}
	/*Student(){
		System.out.println("Student Constructor");
	}
	
	void StudentMain() {
		System.out.println("Student Method");
		
	}*/
	void displayStudentInfo() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name:"+studentName);	
	}
}
public class StudentMain{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student studentObj1=new Student(1,"Omkar Narveer");//reference variable/object
			Student studentObj2=new Student(2,"Narveer");//reference variable/object
			//Student studentObj3; //reference variable
			studentObj1.displayStudentInfo();
			studentObj2.displayStudentInfo();
		}
}
