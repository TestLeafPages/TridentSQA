package week1.day2;

public class Car {
	public static void main(String[] args) {
		//classname obj = new constructor();
		Car myCar = new Car();
		myCar.airconditioner();
		String cmd = myCar.applyBreak();
		System.out.println(cmd);
		
		
	}
	
	public String applyBreak() {
		return "Slow";
	}

	public void accelrator() {
		System.out.println("GO fast");
	}

	private void airconditioner() {
		System.out.println("AC");
	}

	void window() {
		System.out.println("Up & Down");
	}

}
