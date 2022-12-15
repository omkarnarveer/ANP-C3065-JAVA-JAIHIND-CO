
import java.util.Scanner;

public class FactorialDemo {
	
    public int factorial(int num)
    {
        if (num == 0)
            return 1;
        else
            return (num * factorial(num - 1));
    }

    public static void main(String[] args) {
    	 
    	FactorialDemo obj=new FactorialDemo();
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number:"); 
			int num = sc.nextInt();
			long factorial = 1;
			for(int i = 1; i <= num; i++){
			    factorial *= i;
			}
			System.out.println("Factorial of "+num+" is: "+factorial);
  
			System.out.println("Enter the number:");
			int num1 = sc.nextInt();
			int calculate = obj.factorial(num1);
			System.out.println("Factorial of " + num1 + " is: " + calculate);
		}
    }
}