package ffse1702040.bai1.practice;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {

	public static void main(String[] args) {
		int thamsoA, thamsoB;
		double nghiemX;
		Scanner myInput = new Scanner(System.in);
		System.out.print("Nhập tham số a =");
		thamsoA = myInput.nextInt();
		System.out.print("Nhập tham số b =");
		thamsoB = myInput.nextInt();

		if (thamsoA == 0) {
			if (thamsoB == 0) {
				System.out.print("Phuong trinh vo so nghiem");
			} else {
				System.out.print("Phuong trinh vo nghiem");
			}
		} else {
			nghiemX = -thamsoB * 1.0 / thamsoA;
			System.out.print("Phuong trinh co nghiem duy nhat : " + nghiemX);
		}

	}

}
