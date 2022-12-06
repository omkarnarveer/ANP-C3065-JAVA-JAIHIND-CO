class Base{
	
}
class Child extends Base{
	
}
public class InstanceOfOperatorDemo {

	public static void main(String[] args) {
		InstanceOfOperatorDemo ioodObj1=new InstanceOfOperatorDemo();
		Base base1=new Base();
		Child child1=new Child();
		
		boolean result= base1 instanceof Child;
		System.out.println(result);
		
		boolean result1= base1 instanceof Base;
		System.out.println(result);
		
		boolean result2= child1 instanceof Child;
		System.out.println(result);
		
		boolean result3= base1 instanceof Base;
		System.out.println(result);
		
		boolean result4= base1 instanceof Child;
		System.out.println(result);
		
		boolean result5= child1 instanceof Base;
		System.out.println(result);
	}
	
}
