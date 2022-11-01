package polymorphism;

public class Addition {
	//method Overloading
	void sum(int a) {
		int c=a;
		System.out.println("Sum is: " +c);	
	}
	void sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum is: " +c);
	}
	void sum(float a,float b) {
		float c=a+b;
		System.out.println("Sum is: " +c);	
	}
	void sum(float a) {
		float c=a;
		System.out.println("Sum is: " +c);
		
	}
	void sum(int a, float b) {
		float c=a+b;
		System.out.println("Sum is: " +c);
		
	}
	void sum(float a,int b) {
		float c=a+b;
		System.out.println("Sum is: " +c);
		
	}
	void sum( long a,long b, long c) {
		long t=a+b+c;
		System.out.println("Sum is: " +t);
		
	}
	void sum(double a, double b, double c) {
		double t=a+b+c;
		System.out.println("Sum is: " +t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add=new Addition();
		add.sum(1);
		add.sum(2.3f);
		add.sum(2,3);
		add.sum(2.1f,3);
		add.sum(2,3.2f);
		add.sum(2.1f,3.1f);
		add.sum(12233,23334,34455);
		add.sum(23121.2,123121.3,131321.1);
	}

}
