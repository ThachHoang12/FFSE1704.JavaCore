/**
 * code tập java
 */
package tapcode.java.test;

import java.util.Scanner;
/**
 * @author Admin
 * 
 */
public class test1 {
	public static void main(String[] args) {
		
		System.out.println("******************");
		System.out.println("***" + "Ax" + " + " + "B" + " = " + " 0 " + "***");
		System.out.println("******************");
		
		int thamSoA, thamSoB;
		double nghiemX;
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Nhập tham số A = ");
		thamSoA = myInput.nextInt();
		
		System.out.print("Nhập tham số B = ");
		thamSoB = myInput.nextInt();
		
		nghiemX = -thamSoB*1.0/thamSoA;
		System.out.print("Kết quả của bạn là: " + nghiemX);
	}
}
