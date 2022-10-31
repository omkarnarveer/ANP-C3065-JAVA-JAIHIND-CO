package question2;
import java.util.Scanner;
public class GameMenu {
	
	void startGame() {
		System.out.println(" Start the Game");
	}
	
	void displayGameInstruction() {
		System.out.println(" Display game instruction");
	}
	
	void exitGame() {
		System.out.println(" Exit the Game");
	}
	
	/*void menuChoice(int m){
	switch(m){ 
		case 1:
			//System.out.println("1.Start the Game");
			startGame();
			break;
		case 2:
			//System.out.println("2.Display game instruction");
			displayGameInstruction();
			break;
		case 3:
			//System.out.println("3. Exit the Game");
			exitGame();
			break;
			default :
			System.out.println("Invalid Choice!!!");
	}		
}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		GameMenu obj=new GameMenu();
		//int menuChoice=3;
		Scanner scannerObj= new Scanner(System.in);
		while(true) {
			System.out.println("\n--------MENU----------");
			System.out.println(" 1. Start the Game");
			System.out.println(" 2. Dispay game instruction");
			System.out.println(" 3. Exit the Game");
			System.out.println(" 4. Type 4 to Terminate Program");
			System.out.println("-----------------------------");
			System.out.println(" Enter Your Choice:");
			int menuChoice= scannerObj.nextInt();
			
			switch(menuChoice) {
			case 1:
				//System.out.println("1.Start the Game");
				obj.startGame();
				break;
			
			case 2:
				//System.out.println("2.Display game instruction");
				obj.displayGameInstruction();
				break;
			case 3:
				//System.out.println("3. Exit the Game");
				obj.exitGame();
				break;
				
			case 4:
				//System.out.println("3. Exit the Game");
				System.out.println("Program Terminated By User!!!!!!!!");
				System.exit(0);
				break;
			
			default :
				System.out.println("Invalid Choice, Try Again!!!");
			
			}
		}
		/*obj.menuChoice(1);
		  obj.menuChoice(2);
		  obj.menuChoice(3);
		  obj.menuChoice(4);
		*/
		}
}