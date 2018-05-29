/**
 * 
 */
package fasttrackse.bai1.pratice;

import java.util.Scanner;
/**
 * @author QuangDai
 *
 */
public class SoNguyenTo {

	/**
	 *	Nhập 1 số từ bàn phím xem số  đó có phải là số nguyên tố
	 *	@author: Phan Phạm Quang Dai
	 *	Date: 29/05/2018
	 */
	public static void main(String[] args) {
		int a;
		int dem = 0;
		@SuppressWarnings("resource")
		// Khai báo biến Scanner nhập dữ liệu từ bàn phím
		Scanner myInput = new Scanner(System.in);
		
		// Nhập số nguyên từ bàn phím
		System.out.print("Nhập số nguyên a: ");
		a = myInput.nextInt();
		
		for (int i = 1; i <= a; i ++) {	// i chạy từ 1 đến số nguyên a
			if (a % i == 0) {	// Mổi lần a chia hết cho i thì tăng biến dem lên 1
				dem = dem +1;
				System.out.println("Số nguyên a (" + a + ") chia hết cho " + i);
			}
		}
		
		if (dem > 2) { 
			System.out.println("Số nguyên a (" + a + ") không phải là số nguyên tố");
		} else {
			System.out.println("Số nguyên a (" + a + ") là số nguyên tố");
		}

	}

}
