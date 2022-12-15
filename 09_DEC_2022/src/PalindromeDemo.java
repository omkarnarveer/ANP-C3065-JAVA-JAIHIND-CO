import java.util.Scanner;
public class PalindromeDemo {

	   public static void main(String args[]){
		   
	      String str, rev = "";
	      try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a string to check if it is a palindrome");
			  str = in.nextLine();
		}

	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- ) {
	         rev = rev + str.charAt(i);
	      }
	      
	      if (str.equals(rev)) {
	    	  
	         System.out.println("Entered string is a palindrome.");
	      }
	      else {
	    	  
	         System.out.println("Entered string is not a palindrome.");
	      }
	 }   
}
	


