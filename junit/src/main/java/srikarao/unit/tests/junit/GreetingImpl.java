package srikarao.unit.tests.junit;

public class GreetingImpl implements Greeting {

	public String greet(String name) {
		if(name == null || name.trim().length() == 0) {
			throw new IllegalArgumentException("Name is null or empty");
		}
		
		return "Hello "+name;
	}
	
//	public static void main(String args[]) {
//		new GreetingImpl().greet("Srikanth");
//	}

}
