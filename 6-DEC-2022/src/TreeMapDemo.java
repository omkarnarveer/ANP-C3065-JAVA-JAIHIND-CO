import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> treeMap= new TreeMap<Integer,String>();
		
			treeMap.put(5,"Omkar");
			treeMap.put(4,"Omkar");
			treeMap.put(3,"Omkar111");
			treeMap.put(2,"Omkar11");
			treeMap.put(1,"Omkar2311");
			
		System.out.println(treeMap);// it follows key pair values pair
	}
}
