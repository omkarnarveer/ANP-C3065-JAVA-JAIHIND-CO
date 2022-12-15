
public class TrafficSignalTest {
	TrafficSignal trafficSignal;
	 int Seconds;

	TrafficSignalTest(TrafficSignal trafficSignal){

		this.trafficSignal=trafficSignal;
	}
	void selectColour() {
		switch(trafficSignal){
		case RED:{
			System.out.println("Timer is: "+"");
			break;
			}
		case GREEN:{
			System.out.println(""+"");
			break;
			}
		case ORANGE:{
			System.out.println(""+"");
			break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
