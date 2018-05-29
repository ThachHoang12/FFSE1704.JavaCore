package first.project;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("nhập vào số a:");
		float a = n.nextFloat();
		System.out.println("nhập vào số b:");
		float b = n.nextFloat();
		float c;
		c = a + b;
		// System.out.println("Tổng của a + b ="+c);
		System.out.println("Tổng của a + b =");
		System.out.println(c);

	}

}
