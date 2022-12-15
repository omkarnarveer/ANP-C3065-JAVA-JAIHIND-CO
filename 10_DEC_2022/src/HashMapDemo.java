import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	
	private static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();	
	
    public static HashMap<Integer, String> getHashMap(){
    	
        return hashMap;
    }
    
    public void addObjectToMap(Integer key, String value){
        
        hashMap.put(key, value);
    }
    
    public HashMap<Integer, String> searchByKey(Integer key){
    	
    	 HashMap<Integer,String>searchMap= new HashMap<>(); 
    	 Set<Integer>set=hashMap.keySet();
  		 Iterator<Integer> iterator=set.iterator();
  		 
  		while(iterator.hasNext()) {
  			
  			Integer i=iterator.next();
  			if(i==key) {
  				String s=hashMap.get(i);
  				searchMap.put(i,s);
  			break;
  			}
  		}
    return searchMap;
    }
    
public static void main(String[] args) {
		
	HashMapDemo obj =new HashMapDemo();
		
	obj.addObjectToMap(1, "Omkar");
	obj.addObjectToMap(2, "Abhi");
	obj.addObjectToMap(3, "Rohit");
	    
	HashMap<Integer, String> result = obj.searchByKey(1);
	System.out.println(result);
	}
}
