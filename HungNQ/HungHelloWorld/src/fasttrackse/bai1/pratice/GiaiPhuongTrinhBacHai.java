/**
 * GiaiPhuongTrinhBacHai
 * Name:Nguyen Quoc Hung
 * Date:28-05-2018
 */
package fasttrackse.bai1.pratice;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class GiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		int thamSoA, thamSoB, thamSoC;
		double nghiemX;
		double nghiemX1;
		double nghiemX2;
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Nhập tham số a = ");
		thamSoA = myInput.nextInt();

		System.out.print("Nhập tham số b = ");
		thamSoB = myInput.nextInt();
		
		System.out.print("Nhập tham số c = ");
		thamSoC = myInput.nextInt();
		
		if(thamSoA == 0) {
			nghiemX = -thamSoC *1.0 / thamSoB;
			System.out.print("Phương trình có một nghiệm duy nhất x = " + nghiemX);
		} else {
			nghiemX1 = -thamSoB *1.0 / thamSoA;
			nghiemX2 = thamSoC *1.0 / 2*thamSoA;
			System.out.print("Phương trình có hai nghiệm phân biệt x1 = " + nghiemX1 + " và x2 = " + nghiemX2);
		}
	}
}
