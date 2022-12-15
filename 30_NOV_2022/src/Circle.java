public class Circle extends Shape {
int radius;
Circle(){
	
}
Circle(int radius){
	this.radius=radius;
}
void calculateArea() {
	area=3.14*radius*radius;
}
}