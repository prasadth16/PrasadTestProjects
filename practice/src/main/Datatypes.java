package main;

public class Datatypes {
	public static void main(String[]a)
	{
		//int afi=0b1001;
		//int asi=0b1001;
		int afi=0xFF;
		int asi=0x1;
		float g=1233443.1845628f;
		double d=1234233.432234423432428;
		int add=afi+asi;
		
		char c='\u00A5';
		String s="63A5";
		int value=Integer.parseInt(s, 16);
		System.out.println((char)value);		
		char cd=9;
		Character ch=new Character(c);
		byte b=ch.DECIMAL_DIGIT_NUMBER;
		Byte bt=new Byte(b);
		int bv=bt.intValue();
		System.out.println(d);
		
	}

}
