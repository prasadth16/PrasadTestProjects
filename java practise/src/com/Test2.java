package com;

public class Test2 {
	
	public String sub1;
	public String sub2;
	public static String sub3="always failed";

	public static void main(String[] a)
	{
	Test2 t1=new Test2();
	t1.sub1="Passed";
	t1.sub2="failed";
	
	Test2 t2=new Test2();
	t2.sub1="Passed";
	t2.sub2="Passed";
	t2.sub3="always passed";
	System.out.println(t1.sub2 + "--"+ t2.sub2);
	System.out.println(t2.sub3);
	System.out.println(t1.sub3);
	}
		
}
