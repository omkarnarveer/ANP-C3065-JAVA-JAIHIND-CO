
public class Student {
int id;
String name;
Gender gender;
Student(int id,String name,Gender gender){
	this.id=id;
	this.name=name;
	this.gender=gender;
}
public String toString() {
	String text= id+" "+name+" "+gender;
	return text;
}
}
