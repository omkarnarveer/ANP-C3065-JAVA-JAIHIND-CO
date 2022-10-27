
public class Demo {//Class Demo
		// method without return type and without parameter
		void display() {
			System.out.println("--------------------------------------------");
			System.out.println("Without return type and without parameter");
			System.out.println("Dislay Method");
			System.out.println("--------------------------------------------");
	}
		// method without return type and with one parameter
		void displayMessage(String message) {
			System.out.println("Without return type and with one parameter");
			System.out.println("This is message "+message);	
			System.out.println("--------------------------------------------");
	}
		// method without return type and with two parameter
		void displayTwoMessage(String message1,String message2) {
			System.out.println("Without return type and with one parameter");
			System.out.println("This  messages are "+message1+ " and "+message2);	
			System.out.println("--------------------------------------------");
	}	
		// method with return type and without parameter
		boolean getStatus() {
			System.out.println("With return type and without parameter");
			return true;	
	}		
		// method with return type and with parameter
		int sum(int num1,int num2) {
			System.out.println("--------------------------------------------");
			System.out.println("Method sum called with return type and with parameter");
			int result=num1+num2;
			return result;		
	}
		// method without return type and with two parameter
		void swap(int n1,int n2) {
			n1=n1+n2;
		    n2=n1-n2;
		    n1=n1-n2;
		    System.out.println("n1= "+n1);
		    System.out.println("n1= "+n2);
		}
		void Vote(int age) {
			
			if (age>=18) {
				System.out.println("Eligible to Vote");
			}
			else {System.out.println("Not Eligible to Vote");
			}
			System.out.println("End of If Statement");
		}
		int FindLargeNo(int num1,int num2, int num3){
			int num=0;
		     if (num1 == num2 && num1 == num3) {
		       //System.out.println ("all are equal");
		     	num=num1;
		     }
		     else if (num1 >=num2 && num1>=num3) {
		         //System.out.println (num1 + " is greater");
		    	  num=num1;
		     }
		     else if (num2 >=num1 && num2>=num3) {
		         //System.out.println (num2 + " is greater");
		    	 num= num2;
		     }
		     else if (num3 >=num1 && num3>=num2) {
		         //System.out.println (num3 + " is greater");
		     	num = num3;
		     }
		     return num;
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
			demoObj.swap(10,5);	//swap method is called
			System.out.println("--------------------------------------------");
			demoObj.Vote(12);   //Vote method is called
			System.out.println("--------------------------------------------");
			demoObj.Vote(21);   //Vote method is called
			System.out.println("--------------------------------------------");
			int num1=demoObj.FindLargeNo(100,150,300); //FindLargeNo method is called
			System.out.println("Number Equal is: "+ num1);
			int num2=demoObj.FindLargeNo(100,200,350);//FindLargeNo method is called
			System.out.println("Number Larger is: "+ num2);
			int num3=demoObj.FindLargeNo(100,150,300);//FindLargeNo method is called
			System.out.println("Number Larger is: "+ num3);
			System.out.println("--------------------------------------------");
	}		
}