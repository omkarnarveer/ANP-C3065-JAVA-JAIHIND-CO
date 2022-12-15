
public enum TrafficSignal {
	RED(60, "Red"),GREEN(30, "Green"),ORANGE(5, "Orange");
	
int seconds;
String colour;
TrafficSignal(int seconds, String colour){
	this.seconds=seconds;
	this.colour=colour;
}
int getSeconds(){
 
	return 0;
}
}