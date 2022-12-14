import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet= new TreeSet<String>();
		
			treeSet.add("Omkar");
			treeSet.add("Omkar");
			treeSet.add("Omkar111");
			treeSet.add("Omkar11");
			treeSet.add("Omkar2311");
			
		System.out.println(treeSet);//It follows alphabetical order and no duplicates are allowed.
	}

}
