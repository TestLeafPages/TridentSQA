package week1.day2;

public class Loops {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(i%2!=0?"ODD: "+i:"EVEN: "+i);
		/*System.out.println(i%2!=0?i:i);
			if (i % 2 != 0) {
				System.out.println(i);

			} else {
				continue;
			}*/
		}
	}
}
