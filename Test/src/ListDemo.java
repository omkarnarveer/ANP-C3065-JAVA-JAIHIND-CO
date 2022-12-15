import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ListDemo {
	
	public static void onlyOddNumbers(List<Integer>list) {
		for(int i: list) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(5); 
		onlyOddNumbers(list);
		Collections.sort(list);
		System.out.println(list);
	}
}


