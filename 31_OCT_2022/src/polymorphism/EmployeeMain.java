package polymorphism;

import java.util.Scanner;

class Employee{
	
	int employeeId;
	String employeeName;
	boolean employeeStatus;	
	float employeeSalary;

	void displayEmployeeDetails() {
		int empValue;
		empValue=1;
		System.out.println(empValue);
		System.out.println("Employee ID is: "+ employeeId);
		System.out.println("Employee Name is: "+employeeName);
		System.out.println("Is Present: " +employeeStatus);
		System.out.println("Monthly Income is $:"+employeeSalary+"/-");
	}
	
	//Overloading Polymorphism
	Employee(){
	System.out.println("Non Parameterized");
	}
	
	//Overloading Polymorphism
	Employee(int empId,String empName,boolean empStatus,float empSalary){
		System.out.println("parameterized");
		employeeId=empId;
		employeeName=empName;
		employeeStatus=empStatus;
		employeeSalary=empSalary;	
	}
	
	//Overloading Polymorphism
	Employee(int empId){
	
	}
	
	//Overloading Polymorphism
	Employee(int empId,boolean empStatus){
	
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// Method 1 Object Creation
		//TODO Auto-generated method stub
		/*Employee employee1=new Employee();
		Employee employee2=new Employee(1,"Omkar",true,70000.66f);
		employee1.displayEmployeeDetails();
		employee2.displayEmployeeDetails();*/
		
		/*Another Method 2 Object Creation
		/ Annonomous object Creation using  Enhanced array*/
		
		/*new Employee(10,"Omkar",true,50000f);
		int arr[]=new int[5];
		Employee e1=new Employee(10,"Omkar",true,50000f);
		Employee employee[]=new Employee[2];
		employee[0]=e1;
		employee[1]=new Employee(1,"Mani",true,50000f);
		for (Employee e:employee) {
			e.displayEmployeeDetails();
		}*/
		
		//Another Method 3 Object Creation
		
		Scanner scanner=new Scanner(System.in);
		Employee employee[]=new Employee[2];
		for(int i=0;i<employee.length;i++) {
			System.out.println("Enter Employee Id: ");
			int id=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Employee Name: ");
			String name=scanner.nextLine();
			//scanner.nextLine();
			System.out.println("Enter Employee Status: ");
			boolean status=scanner.nextBoolean();
			//scanner.nextLine();
			System.out.println("Enter Employee Salary: ");
			float salary=scanner.nextFloat();
			scanner.nextLine();
			Employee emp=new Employee(id,name,status,salary);
			employee[i]=emp;
			//employee[i]=new Employee(id,name,status,salary);
		}
		for (Employee e:employee) {
			e.displayEmployeeDetails();
		}
	
		}
		
}


