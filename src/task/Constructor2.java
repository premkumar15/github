package task;

public class Constructor2 extends Constructor1 {
	public Constructor2() {
		this( 250);
		System.out.println("parameterized");
	}

	public Constructor2(int id) {
		this("hello");
		
		System.out.println("int"+id);
		
	}

	public Constructor2(String name) {

		System.out.println("String1"+ name);	}
	


}
