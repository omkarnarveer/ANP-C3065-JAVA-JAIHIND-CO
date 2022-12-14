import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
			
		LinkedList<String> linkedList= new LinkedList<String>();
		
			linkedList.add("Omkar");
			linkedList.add("Omkar");
			linkedList.add("Omkar111");
			linkedList.add("Omkar11");
			linkedList.add("Omkar2311");
			
		System.out.println(linkedList);//it follows insertion order and duplicates are allowed.
		}
	}

