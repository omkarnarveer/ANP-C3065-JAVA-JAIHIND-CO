class Rectangle{
	public String toString() {
		return "I am a rectangle";
	}	
}

class Square{
	public String toString() {
		return "I am a square";
	}	
}

class  Circle{
	public String toString() {
		return "I am a circle";
	}
}

/*class Shape{
	Object o;
	void setShapeObject(Object obj){
		o=obj;
	}
	Object getShapeObject(){
		return o;
	}
}*/
class Shape<T>{
	T o;
	void setShapeObject(T obj){
		o=obj;
	}
	T getShapeObject(){
		return o;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
		Rectangle rectangle1= new Rectangle();
		Square square1 =new Square();
		Shape<Rectangle>obj1=new Shape<Rectangle>();
		
		obj1.setShapeObject(rectangle1);
		Object object1=obj1.getShapeObject();
		Rectangle rectangle2=(Rectangle)object1;
		
		System.out.println(rectangle2);
		//obj1.setShapeObject(square1);
		Object object2=obj1.getShapeObject();
		//Rectangle rectangle3=(Rectangle)object2;
		//System.out.println(rectangle3);
	}
}
