package edu.esprit.greeter;

public class Greeter {
	public String Var1;
	

	public String sayHello(String name){
		if(name.equals("MAN"))
			throw new IllegalArgumentException();
		
		
		return "Hello "+name;
	}
	
}
