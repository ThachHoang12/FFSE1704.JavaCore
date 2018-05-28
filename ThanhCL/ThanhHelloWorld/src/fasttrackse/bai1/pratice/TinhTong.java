package fasttrackse.bai1.pratice;

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		int soA, soB, tongHaiSo;
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Nhập số A:");
		soA = myInput.nextInt();
		
		System.out.print("Nhập số B:");
		soB = myInput.nextInt();
		
		tongHaiSo = soA + soB;
		
		System.out.println("Tổng hai số " + soA + " và " + soB + " là " + tongHaiSo);
	}

}
