package main;

public class Human {
	 private float height;
	 private String firstName;
	 private String lastName;
	 private int age;
	 private String education;
	 
	 public boolean isHighQualified=false;
	 
	 public Human()
	 {
		 
	 }
	 public  Human( float height,String firstName,String lastName,int age,String education)
	 {
		 this.height=height;
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.age=age;
		 this.education=education;
		 
	 }
	 
	 
	 
	 public void workdone()
	 {
		 if (education=="GRADUATE" && age<=28)
			 isHighQualified=true;
	 }
	 
	 public static void main(String [] a)
	 {
		 Human human=new Human();
		 Human prasad=new Human(5.6f,"Prasad","Thakur",36,"Computer Engineering");
		 
	}
}
