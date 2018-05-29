/**
 * 
 */
package fasttrackse.bai1.pratice;

import java.util.Scanner;

/**
 * 	Giải phương trình 1 ẩn ax + b = 0
 * 	@author: Phan Phạm Quang Dai
 *	Date: 28/05/2018
 */
public class PhuongTrinhBac1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int a, b;
		double x;
		@SuppressWarnings("resource")
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Nhập tham số a: ");
		a = myInput.nextInt();
		
		System.out.print("Nhập tham số b: ");
		b = myInput.nextInt();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			x = -b / a;
			System.out.println("Phương trình có nghiệm: " + x);
		}
	}

}
