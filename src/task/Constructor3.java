package task;

public  class Constructor3 extends Constructor2 {
	public Constructor3() {
		
		 this(150);
		System.out.println("parameter");
	}

	public Constructor3(int id) {
		this("hello");
		
		System.out.println("int"+id);
		
	}

	public Constructor3(String nick) {

		System.out.println("String1"+ nick);
		}
	public static void main(String[] args) {
		Constructor3 obj=new Constructor3();
		obj.Ashok();
		obj.beverage();
		obj.cocola();
		obj.company();
		obj.company1();
		obj.company2();
		obj.drink();
		obj.fruits1();
		obj.fruits2();
		obj.fruits3();
		obj.id1();
		obj.id2();
		obj.leyland();
		obj.machine();
		obj.Motor();
		obj.name1();
		obj.name2();
		obj.toyota();
		obj.vegan1();
		obj.vegan2();
		obj.vegan3();
		obj.vegetables1();
		obj.vegetables2();
		obj.vegetables3();
		obj.vehicle();
		obj.Venue();
	
	
		
		
	}


}
