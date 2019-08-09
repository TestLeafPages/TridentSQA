package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int a=-1,b=1;
	int[] c = new int[10];
	for(int i=0;i<10;i++) {
		c[i]=a+b;
		a=b;
		b=c[i];
	}
	
	for (int eachint : c) {
		System.out.println(eachint);
	}
	
	
	
	
	/*for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}*/
}
}
