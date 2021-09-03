package org.task2;

public class Constructor2  {
	public Constructor2() {
	 this(20);
	System.out.println("default ");
}

public  Constructor2(int id) {
	this("selenium");
	
	System.out.println("int "+id);
	
}

public Constructor2(String nick) {
 
	System.out.println("Strings "+nick);


}

}
