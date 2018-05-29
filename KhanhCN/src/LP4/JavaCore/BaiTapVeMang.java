/***********************
  Bài tập Assignment 3
 Prog : BÀI TẬP VỀ MẢNG 
 Outhor : CAO NGỌC KH�?NH
 Date : 29-May-2018
 
************************/
package LP4.JavaCore;

import java.util.Scanner;

public class BaiTapVeMang {

	public static void main(String[] args) {
		// Phần khai báo
		int n;
		float mang[] = new float[10];
		Scanner nhap = new Scanner(System.in);

		// Thân chương trình
		System.out.println("              *******BÀI LÀM*********");
		System.out.println("          1/       -----------------");
		System.out.print("        + Xin nhập số lượng phần tử của mảng : ");

		n = nhap.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("             - Nhập phần tử thứ " + i + " của mảng :");
			mang[i] = nhap.nextFloat();

		}
		float max = mang[0];
		float min = mang[0];
		int vitriMax = 0;
		int vitriMin = 0;

		// Vòng lặp tính tim Min Max và vị trí của chúng trong mảng

		for (int i = 0; i < n; i++) {

			if (mang[i] > max) {
				max = mang[i];
				vitriMax = i;

			}
			if (mang[i] < min) {
				min = mang[i];
				vitriMin = i ; 
			}

		}

		
		
		System.out.println("           2/     ******************");
		System.out.println("        + Mang N có  giá trị lớn nhất là :" + max);
		System.out.println("                ******************");
		System.out.println("        + Mảng N có giá trị nh�? nhất là : " + min);
		System.out.println("           3/      ******************");
		System.out.println("        + Phần tử " + max + " ở vị trí thứ " + vitriMax );
		System.out.println("                ******************");
		System.out.println("        + Phần tử "+ min + " ở vị trí thứ "+ vitriMin );
	}

}
