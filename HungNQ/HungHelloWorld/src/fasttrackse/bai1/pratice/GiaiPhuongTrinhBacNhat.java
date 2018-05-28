/**
 * Chương trình giải PTBN 1 Ẩn a + b = 0
 * HungNQ
 * Date: 28-05-2018
 */
package fasttrackse.bai1.pratice;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		int thamSoA, thamSoB;
		double nghiemX;
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Nhập tham số a = ");
		thamSoA = myInput.nextInt();
		
		System.out.print("Nhập tham số b =");
		thamSoB = myInput.nextInt();
		
		if(thamSoA == 0) {
			if(thamSoB == 0) {
				System.out.print("Phương trình " + thamSoA + "x + " + thamSoB + " = 0" + "có nghiệm");
			} else {
				System.out.print("Phương trình " + thamSoA + "x + " + thamSoB + " = 0" + "vô nghiệm");
			}
		} else {
			nghiemX = -thamSoB * 1.0/ thamSoA;
			System.out.print("Phương trình " + thamSoA + "x + " + thamSoB + "= 0 có nghiệm x = " + nghiemX);
		}
	}
}
