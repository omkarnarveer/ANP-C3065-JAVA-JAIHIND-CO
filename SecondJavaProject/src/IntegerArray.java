
public class IntegerArray {
	void setIntegerArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Array Elements are: "+array[i]);
		}
	}
//void setInt(int a) {
//	System.out.println("Int a is "+ a);
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerArray ArrObj=new IntegerArray();
		int arr[]=new int[5];
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		//for(int i=0;i<arr.length;i++) {
			//System.out.println("Array Elements are: "+arr[i]);
		//}
		
		//ArrObj.setInt(3);	
		System.out.println("-----------------------------------");
		ArrObj.setIntegerArray(arr);	
		System.out.println("-----------------------------------");
	}
}
