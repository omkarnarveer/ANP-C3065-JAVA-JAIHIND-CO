package array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];
		arr[0][0]=90;
		arr[0][1]=40;
		arr[1][0]=30;
		arr[1][1]=50;
		arr[2][0]=70;
		arr[2][1]=80;
		System.out.println(arr[2][0]);
		System.out.println("");
		int[][] arr1= {{1,2,3},{1,3,7},{1,2,8}};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j] +"\t");
			}
			System.out.println("");
		}
		System.out.println("\nEnhanced For Loop\n");
		
		for(int i[]:arr1){
			for(int j:i){
				System.out.print(j+"\t");	
			}
			System.out.println("");
		}
	}
}