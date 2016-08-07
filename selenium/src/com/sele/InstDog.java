package com.sele;

public class InstDog {
	
	public static void main(String[] a)
	{
		Dog tommy=new Dog();
		tommy.dogColor="White";
		tommy.dogWeight=23;
		tommy.setDogName("Tommy");
		
		Dog moti=new Dog();
		
		moti.dogWeight=25;
		moti.setDogName("Moti");
		System.out.println(moti.getDogName());
		
	}

}
