
public class Square extends Shape {
int side;
Square(){
	
}
Square(int noOfSides,int side)
{
	super.noOfSide=noOfSides;
	this.side=side;
}
void calculateArea() {
	area=side*side;
}
}