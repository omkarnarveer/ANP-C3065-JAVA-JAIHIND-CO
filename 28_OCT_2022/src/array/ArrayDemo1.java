package array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6};
		//Enhanced Forloop(variable:expression)
		for(int i:arr1) {
			System.out.println(i);			
		}
		
		double arr2[]= {1.1,1.2,1.1,1.3,1.5,1.6};
		//Enhanced Forloop(variable:expression)
		for(double d:arr2) {
			double d1=d+2;
			System.out.println("oldValue: "+d+" newValue: "+d1);
		}
		//System.out.println(arr2[2]);
	}

}