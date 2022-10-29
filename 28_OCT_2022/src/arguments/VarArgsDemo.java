package arguments;

public class VarArgsDemo {
	void setArray(int a[]) {
		
	}
	void setVarArgs1(int ...paramVar) {
		System.out.println("setVarArgs");
		for(int a:paramVar) {
			System.out.println(a);
		}
	}

	void setVarArgs2(int ...paramVar) {
		System.out.println("setVarArgs");
		for( int a:paramVar) {
			System.out.println(a);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	VarArgsDemo varArgsDemoObj=new VarArgsDemo();
	varArgsDemoObj.setVarArgs1();
	varArgsDemoObj.setVarArgs1(1);
	varArgsDemoObj.setVarArgs1(1,2);
	varArgsDemoObj.setVarArgs1(3,2,1);
	
	}

}