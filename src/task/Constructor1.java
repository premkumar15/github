package task;

public  class Constructor1 extends Class3 {
	public Constructor1() {
		this( 300);
		System.out.println("default");
	}

	public Constructor1(int id) {
		this("hi");
		System.out.println("int"+id);
		
	}

	public Constructor1(String name) {
System.out.println("String"+ name);	}

	@Override
	public void beverage() {
System.out.println("appi");		
	}

	@Override
	public void cocola() {
System.out.println("coke");		
	}

	@Override
	public void drink() {
System.out.println("kinley");		
	}

	@Override
	public void company2() {
System.out.println("pepsi");		
	}

	@Override
	public void name2() {
System.out.println("sravan");		
	}

	@Override
	public void id2() {
System.out.println("134455");		
	}

	@Override
	public void company1() {
System.out.println("thiruvaNTAPURAM");		
	}

	@Override
	public void name1() {
System.out.println("abhi");		
	}

	@Override
	public void id1() {
System.out.println("5678");		
	}
	

}
