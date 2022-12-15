import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;

class A{
	int a;
	
	A(int a){
		
		this.a=a;
	}
	@Override
	public String toString() {
		
		return "A [a=" + a + "]";
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(a);
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return a == other.a;
	}	
}
class B{
	
	String name;
	B(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		
		return "B [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		return Objects.equals(name, other.name);
	}
}
public class HashMapIterationDemo {
	
	public static void main(String[] args) {
		
		HashMap<A,B> hashMap=new HashMap<>();
			hashMap.put(new A(3),new B("AAA"));
			hashMap.put(new A(1),new B("CCC"));
			hashMap.put(new A(2),new B("BBB"));
		System.out.println(hashMap);

		HashMap<Integer,String> hash =new HashMap<>();
			hash.put(1,"CCC");
			hash.put(2,"BBB");
			hash.put(1,"AAA");
		System.out.println(hash);
		
		Set<Integer>set=hash.keySet();
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			Integer i=iterator.next();
			String s=hash.get(i);
			System.out.println(i+" "+s);			
		}
	}
}