package array;

public class IntegerArray {
	void setIntegerArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Array Elements at index: "+i+ " is: "+array[i]);
		}
	}
//void setInt(int a) {
//	System.out.println("Int a is "+ a);
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerArray ArrObj=new IntegerArray();
		int arr[]=new int[10];
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		arr[5]=15;
		arr[6]=15;
		arr[7]=15;
		arr[8]=15;
		arr[9]=15;
		//for(int i=0;i<arr.length;i++) {
			//System.out.println("Array Elements are: "+arr[i]);
		//}
		
		//ArrObj.setInt(3);	
		/*int arr1[]= {10,15,14,17,13};
		System.out.println("-----------------------------------------");
		System.out.println("Element of Array1 at index 0 is: "+arr1[0]);
		System.out.println("Element of Array1 at index 1 is: "+arr1[1]);
		System.out.println("Element of Array1 at index 2 is: "+arr1[2]);
		System.out.println("Element of Array1 at index 3 is: "+arr1[3]);
		System.out.println("Element of Array1 at index 4 is: "+arr1[4]);
		*/
		System.out.println("-----------------------------------------");
		ArrObj.setIntegerArray(arr);	
		System.out.println("-----------------------------------------");
	}
}
