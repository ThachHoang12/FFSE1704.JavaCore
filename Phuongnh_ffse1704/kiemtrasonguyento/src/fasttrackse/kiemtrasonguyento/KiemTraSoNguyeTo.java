/**
 * 
 */
package fasttrackse.kiemtrasonguyento;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class KiemTraSoNguyeTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soA;
		Scanner myInput = new Scanner(System.in);
		System.out.println("nhập số A: ");
		soA = myInput.nextInt();
		if (soA>1) 
		if (soA % 2 == 0) {
			System.out.println("số A không phải là số nguyên tố ");
		}
		if (soA % 3 == 0) {
			System.out.println("số A không phải là số nguyên tố ");
		}

		if (soA % 5 == 0) {
			System.out.println("số A không phải là số nguyên tố ");
		}
		if (soA % 3 == 0) {
			System.out.println("số A không phải là số nguyên tố ");
		}
		
		

		else {
			System.out.println("số A là số nguyên tố ");

		}

	}
}
