import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
	
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("Omkar");
		hashSet.add("Omkar@111");
		hashSet.add("Omkar11");
		hashSet.add("Omkar");
		System.out.println(hashSet);
	}
}
