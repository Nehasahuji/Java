package object_and_class.wrapper_class;

public class WrapperClassDemo {

	public static void main(String args[]) {

		int intvalue = 5;
		float floatValue = 5;
		double doubleValue = 5;
		short shortValue = 5;
		char charValue = 'c';
		byte byteValue = 2;
		boolean booleanValue = true;

//		autoboxing 

		Integer intObj = intvalue;
		Float flaotObj = floatValue;
		Double doubleObj = doubleValue;
		Short shortObj = shortValue;
		Character characterObj = charValue;
		Byte byteObj = byteValue;
		Boolean booleanObj = booleanValue;

		System.out.println("---------------------autoboximg --------------------");

		System.out.println(intObj);
		System.out.println(flaotObj);
		System.out.println(doubleObj);
		System.out.println(shortObj);
		System.out.println(characterObj);
		System.out.println(byteValue);
		System.out.println(booleanObj);

//		autounbioxing

		Integer intByte = intObj;
		Float flaotByte = flaotObj;
		Double doubleByte = doubleObj;
		Short shortByte = shortObj;
		Character characterByte = characterObj;
		Byte ByteByte = byteObj;
		Boolean booleanByte = booleanObj;

		System.out.println("---------------------unboximg --------------------");
		System.out.println(intByte);
		System.out.println(flaotByte);
		System.out.println(doubleByte);
		System.out.println(shortByte);
		System.out.println(characterByte);
		System.out.println(ByteByte);
		System.out.println(booleanByte);

	}
}
