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
		int n;
		@SuppressWarnings("resource")
		// Khai báo biến Scanner nhập dữ liệu từ bàn phím
		Scanner myInput = new Scanner(System.in);
		
		// Nhập số nguyên từ bàn phím
		System.out.print("Nhập số nguyên n: ");
		n = myInput.nextInt();
		
		if (n > 0) { // Số nguyên tố là số tự nhiên lớn hơn 1
			if (songuyento(n) == 1) { 
				System.out.println("Số nguyên n(" + n + ") là số nguyên tố");
			} else {
				System.out.println("Số nguyên n(" + n + ") không phải là số nguyên tố");
			}	
		} else {
			System.out.println("Yêu cầu nhập số nguyên dương");
		}

	}
	
	public static int songuyento(int n) {
		System.out.print("Số nguyên n(" + n + ") chia hết cho các số: ");
		int dem = 0;
		for (int i = 1; i <= n; i ++) {	// i chạy từ 1 đến số nguyên a
			if (n % i == 0) {	// Mổi lần a chia hết cho i thì tăng biến dem lên 1
				dem++;
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		if(dem == 2) {
			return 1;
		} else return 0;
	}
}
