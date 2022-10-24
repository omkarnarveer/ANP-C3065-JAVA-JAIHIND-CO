
public class Demo {//Class Demo
		// method without return type and without parameter
		void display() {
			System.out.println("--------------------------------------------");
			System.out.println("without return type and without parameter");
			System.out.println("Dislay Method");
			System.out.println("--------------------------------------------");
	}
		// method without return type and with one parameter
		void displayMessage(String message) {
			System.out.println("without return type and with one parameter");
			System.out.println("This is message "+message);	
			System.out.println("--------------------------------------------");
	}
		// method without return type and with two parameter
		void displayTwoMessage(String message1,String message2) {
			System.out.println("without return type and with one parameter");
			System.out.println("This  messages are "+message1+ " and "+message2);	
			System.out.println("--------------------------------------------");
	}	
		// method with return type and without parameter
		boolean getStatus() {
			System.out.println("with return type and without parameter");
			return true;	
	}		
		// method with return type and with parameter
		int sum(int num1,int num2) {
			System.out.println("--------------------------------------------");
			System.out.println(" method sum called with return type and with parameter");
			int result=num1+num2;
			return result;		
	}
		// main method
		public static void main(String args[]) {
			Demo demoObj=new Demo(); // object created class_name object_name= new Demo() constructor
			demoObj.display();		//display method is called
			demoObj.displayMessage("Hello Omkar"); //displayMessage method is called
			demoObj.displayTwoMessage("Hello Omkar","Have a nice Day!!!"); //displayTwoMessage method is called
			boolean statuVal=demoObj.getStatus(); //getStatus method is called
			System.out.println(statuVal);	
			int sumVal=demoObj.sum(10,10);	//sum method is called
			System.out.println("The Sum is "+sumVal);
			System.out.println("--------------------------------------------");
	}
}