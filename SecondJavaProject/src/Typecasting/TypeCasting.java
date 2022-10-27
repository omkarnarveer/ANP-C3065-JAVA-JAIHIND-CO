package Typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		byte b1=-127; //8 Bits = 1 Byte -range: -128 to +127
		int i1=178; //32 Bits = 4 Byte
		float f1=88.66f; //32 Bits = 4 Byte
		byte b2=(byte)i1; // Type Casting Int to Byte
		int i2=(int)b1;		//Type Casting -Byte to Int
		int i3=(int)f1;// Type Casting -Float to Int
		float f2=(float)i1;//Type Casting -Float to Int
		System.out.println("-------------------------------------------");
		System.out.println("Type Casting -Int to Float: "+i1+" to "+f2);
		System.out.println("Type Casting -Float to Int: "+f1+" to "+i3);
		System.out.println("Type Casting -Byte to Int: "+i2+" to "+b1);
		System.out.println("Type Casting -Int to Byte: "+i1+" to "+b2);
		System.out.println("-------------------------------------------");
	}

}
