package ffse1702040.bai1.practice;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHaiMotAn {

	public static void main(String[] args) {
		int a, b, c;
		double x;
		Scanner myInput = new Scanner(System.in);
		System.out.print("Nhập số a = ");
		a = myInput.nextInt();
		System.out.print("Nhập số b = ");
		b = myInput.nextInt();
		System.out.print("Nhập số c = ");
		c = myInput.nextInt();

		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình vô nghiệm");
			} else {
				System.out.print("Phương trình có 1 nghiệm: " + "x = " + (-c / b));
			}
			return;
		}

		double dt = b * b - 4 * a * c;
		double x1;
		double x2;

		if (dt > 0) {
			x1 = ((-b + Math.sqrt(dt)) / (2 * a));
			x2 = ((-b - Math.sqrt(dt)) / (2 * a));
			System.out.print("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (dt == 0) {
			x1 = (-b / (2 * a));
			System.out.print("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			System.out.print("Phương trình vô nghiệm!");

		}
	}

}
