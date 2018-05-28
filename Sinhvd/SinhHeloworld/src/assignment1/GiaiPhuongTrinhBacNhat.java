package assignment1;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thamSoA, thamSoB;
		double nghiemX;
		Scanner myInput = new Scanner(System.in);
		System.out.println("nhập tham số a =");
		thamSoA = myInput.nextInt();

		System.out.println("nhập tham số b =");
		thamSoB = myInput.nextInt();

		if (thamSoA == 0) {
			if (thamSoB == 0) {
				System.out.println("phương trình" + thamSoA + "x +" + thamSoB + "=0 có 2 nghiệm");
			} else {
				System.out.println("phương trình" + thamSoA + "x +" + thamSoB + " vô nghiệm");

			}
		} else {
			nghiemX = -thamSoB * 1.0 / thamSoA;
			System.out.println("phương trình" + thamSoA + "x +" + thamSoB + "  là " + nghiemX);

		}
	}

}
