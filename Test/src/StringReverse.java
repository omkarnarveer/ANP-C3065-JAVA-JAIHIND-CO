
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ANUDIP";
		String rev="";
		char ch;
		
		for (int i=0; i<str.length(); i++){
		ch= str.charAt(i); 
			rev= ch+rev; 
		}
		
		System.out.println("String: "+ str);
		System.out.println("Reversed String: "+ rev);	
	}
}
