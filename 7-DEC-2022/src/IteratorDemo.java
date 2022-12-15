import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>listObj=new ArrayList<>();
		
		listObj.add(23);
		listObj.add(4);
		listObj.add(18);
		listObj.add(100);
		
		//Collections.sort(listObj);
		Iterator<Integer> iteratorObj=listObj.iterator();
		
		while(iteratorObj.hasNext()) {
			
			Integer data =iteratorObj.next();
	
			System.out.println("Sorted: "+data);
		}
		/*
		listObj.iterator();
		for(Integer s:listObj)
			System.out.println(s);

	*/
	}
}
