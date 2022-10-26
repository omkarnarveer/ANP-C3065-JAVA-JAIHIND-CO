
public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(initialization;condition;increment/decrement)
		for(int i=0;i<=5;i++) {
			if(i==2) 
			continue;
			System.out.println("Welcome "+i+" Iteration");
		}
		int j=0;
		System.out.println("--------------------------------------");
		for(;j<=5;) {
			if(j==5)
			break;
			System.out.println("Hello "+j+" Iteration");
			j++;
		}
	}
}