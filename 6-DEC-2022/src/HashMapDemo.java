import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap= new HashMap<Integer,String>();
		
			hashMap.put(5,"Omkar");
			hashMap.put(4,"Omkar");
			hashMap.put(3,"Omkar111");
			hashMap.put(2,"Omkar11");
			hashMap.put(1,"Omkar2311");
			
		System.out.println(hashMap);//key pair value in sorted form
	}

}
