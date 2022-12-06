import java.util.Scanner;

public class WordGame {
	static String cityName[]={"Chennai","Mumbai","Delhi","Hyderbad","Pune"};
	static String cityNameWithBlanks[]=new String[5];
	int randomNumberArr[]=new int[10];

void displayCityNameWithBlanks() {
	
	for(int i=0;i<cityName.length;i++) {
		
		int length =cityName[i].length();
		char cityNameCharArr[]=new char[length];
		generateRandomNumber(length);
		for(int j=0;j<length;j++) {
			cityNameCharArr[j]=cityName[i].charAt(j);
			for(int k=0;k<randomNumberArr.length;k++) {	
				if(j==randomNumberArr[k])
				cityNameCharArr[j]='-';		
			}
		
		}
		String newCityName=new String(cityNameCharArr);
		cityNameWithBlanks[i]=newCityName;
		System.out.println(cityNameWithBlanks[i]);
	}
}
void generateRandomNumber(int count) {
	int minimum=0;
	int maximum=count;
	for(int k=0;k<=count/2;k++) {
			int randomNumber=minimum + (int)(Math.random() * maximum);
			randomNumberArr[k]=randomNumber;
			//System.out.println(randomNumber);
			
	}
		 	
	
}
public static void main(String[] args) {
	WordGame wordGameObj=new WordGame();
	wordGameObj.displayCityNameWithBlanks();
	
}
}