package first.project;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		int thamsoa, thamsob, x;
		double nghiemX;
		Scanner myInput = new Scanner(System.in);

		System.out.println("nhập vào số a:");
		thamsoa = myInput.nextInt();
		System.out.println("nhập vào số b:");
		thamsob = myInput.nextInt();
		if (thamsoa == 0) {
			if (thamsob == 0) {
				System.out.println("phương trình " + thamsoa + "x + " + thamsob + " = 0 vô số nghiệm");
			} else {
				System.out.println("phương trình " + thamsoa + "x + " + thamsob + " = 0 vô nghiệm");
			}
		} else {
			x = -thamsob / thamsoa;
			System.out.println("phươn trình có nghiệm " + "x = " + -thamsob + "/" + thamsoa + "=" + x);
		}

	}
}
