package org.task2;

import task.Constructor1;

public class Constructor extends Constructor1  {
	public Constructor() {
		
		 
		System.out.println("parameter 1");
	}

	public Constructor(int id) {
		this("hello");
		
		System.out.println("byte ");
		
	}

	public Constructor(String nick) {

		System.out.println("kumar"+ nick);


	}
	public static void main(String[] args) {
		Constructor n = new Constructor();
	}
	}
