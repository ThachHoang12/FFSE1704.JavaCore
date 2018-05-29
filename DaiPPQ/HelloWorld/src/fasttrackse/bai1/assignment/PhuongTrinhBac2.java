/**
 * 
 */
package fasttrackse.bai1.assignment;

import java.util.Scanner;
/**
 * @author QuangDai
 *
 */
public class PhuongTrinhBac2 {

	/**
	 * 	Giải phương trình 2: ax2 + bx + c = 0
	 * 	@author: Phan Phạm Quang Dai
	 *	Date: 28/05/2018
	 */
	public static void main(String[] args) {
		// Khai báo tham số a, b, c và biến x, x1, x2
		int a, b, c;
		double x, x1, x2;
		
		@SuppressWarnings("resource")
		// Khai báo biến Scanner nhập dữ liệu từ bàn phím
		Scanner myInput = new Scanner(System.in);
		
		// Nhập giá trị tham số a, b, c từ bàn phím
		System.out.print("Nhập tham số a: ");
		a = myInput.nextInt();
		
		System.out.print("Nhập tham số b: ");
		b = myInput.nextInt();
		
		System.out.print("Nhập tham số c: ");
		c = myInput.nextInt();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					// a = 0 & b = 0 & c = 0: Phương trình vô số nghiệm
					System.out.println("Phương trình vô số nghiệm");
				} else {
					// a = 0 & b = 0 & c != 0: Phương trình vô nghiệm
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				// a = 0 & b != 0: Phương trình có nghiệm x = -c / b
				x = -c / b;
				System.out.print("Phương trình có nghiệm: x = ");
				System.out.printf("%.3f %n", x);
			}
		} else {
			// a != 0
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				// Phương trình vô nghiệm
				System.out.println("Phương trình vô nghiệm");
			} else {
				if (delta == 0) {
					// Phương trình có nghiệm kép x1 = x2 = -b/2a
					x = - b / 2 * a;
					System.out.print("Phương trình có nghiệm kép: x1 = x2 = ");
					System.out.printf("%.3f %n", x);
				} else {
					// Phương trình có 2 nghiệm x = (-b +/- căn delta)/2a
					x1 =(-b + Math.sqrt(delta)) / (2*a);
		            x2 =(-b - Math.sqrt(delta)) / (2*a);
		            System.out.println("Phương trình có 2 nghiệm là");
		            System.out.print("x1 = ");
		            System.out.printf("%.3f %n", x1);
		            System.out.print("x2 = ");
		            System.out.printf("%.3f %n", x2);
				}
			}
		}
	}

}
