import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList= new ArrayList<String>();
		
			arrayList.add("Omkar");
			arrayList.add("Omkar");
			arrayList.add("Omkar111");
			arrayList.add("Omkar11");
			arrayList.add("Omkar2311");
			
		System.out.println(arrayList);//duplicate allowed and follows insertion order
	}

}
