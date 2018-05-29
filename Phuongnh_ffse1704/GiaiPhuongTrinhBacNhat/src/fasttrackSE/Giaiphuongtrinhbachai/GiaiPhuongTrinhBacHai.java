/***********************
 * GiaiPhuongTrinhBacHai
 **********************/
package fasttrackSE.Giaiphuongtrinhbachai;

import java.util.Scanner;
/**
 * @author PC
 *
 */
public class GiaiPhuongTrinhBacHai {

	public static void main(String[] args) {
		int A, B, C;
		double nghiemX1,nghiemX2, delta;
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("__________________________");
		System.out.println("GIAT PHUONG TRINH BAC HAI");
		System.out.println("..........................");
		 
		System.out.println("nhap tham so A:");
		A = myInput.nextInt();
		
		System.out.println("nhap tham so B:");
		B = myInput.nextInt();
		
		System.out.println("nhap tham so C:");
		C =myInput.nextInt();
		 delta = (B*B)-4*A*C;
		 
		 if (delta < 0) {
			 System.out.println("Phương trình"+ A + "X2 +  "+ B + "X + " + C + "=0: "+ "Vô Nghiệm");
		 }
		 if (delta ==0) {
			 System.out.println("Phương trình"+ A + "X2 + "+ B + "X + " + C + "=0: "+  "Có một nghiệm là" + -B/2*A);
		 }
		 if (delta >0) {
			 System.out.println("Phương trình"+ A + "X2 + " + B + "X + " + C + "=0: "+  "Có hai nghiệm là" + "X1: "+ (-B + sqlr(A))/2*A +" và "+ "X2: "+ (-B - sqlr(A))/2*A);
		 }
		
		 
	}

	private static int sqlr(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
}

