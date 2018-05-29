package giaiphuongtrinh;

import java.util.Scanner;

public class giaphuongtrinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khai báo tham số A, B và biến X
		int thamSoA, thamSoB;
		double nghiemX;
		
		@SuppressWarnings("resource")
		// Khai báo biến Scanner nhập dữ liệu từ bàn phím
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("-----------------------------------");
		System.out.println("|  CHƯƠNG TRÌNH GPTBN ax + b = 0  |");
		System.out.println("-----------------------------------");

		// Nhập giá trị tham số A, B từ bàn phím
		System.out.print("Nhập tham số a = ");
		thamSoA = myInput.nextInt();
		
		System.out.print("Nhập tham số b = ");
		thamSoB = myInput.nextInt();
		
		if (thamSoA == 0) {
			if (thamSoB == 0) {
				// A = 0 & B = 0: Phương trình vô số nghiệm
				System.out.print("Phương trình " + thamSoA + "x + " + thamSoB + " = 0 có VÔ SỐ NGHIỆM");
			} else {
				// A = 0 & B != 0: Phương trình vô nghiệm
				System.out.print("Phương trình " + thamSoA + "x + " + thamSoB + " = 0 VÔ NGHIỆM");
			}
		} else {
			// A != 0: Phương trình có 1 nghiệm: x = -b/a
			nghiemX = -thamSoB * 1.0/ thamSoA;
			System.out.print("Phương trình " + thamSoA + "x + " + thamSoB + " = 0 CÓ NGHIỆM x = " + nghiemX);
		}
	}

}