package org.task2;

import task.Constructor1;

public class Construcor1 extends Constructor2 {
	public Construcor1() {
		this(34);
		System.out.println("default constructor");
	}

	public Construcor1(int id) {
		this("String");
		
		System.out.println("int "+id);
		
	}

	public Construcor1(String nick) {

		System.out.println("String2 "+ nick);


}
	}
