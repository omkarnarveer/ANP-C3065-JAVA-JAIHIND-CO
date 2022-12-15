
public interface Displayable {
String text="Hello Everybody";
public static final int number=67;
void diaplay();
static void greet() {
	System.out.println("static greet method");
}
static void greet1() {
	System.out.println("static greet method");
}
default void show(String text) {
	System.out.println(text);
}
default void show1(String text) {
	System.out.println(text);
}
}