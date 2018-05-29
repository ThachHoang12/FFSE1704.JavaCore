package TimSoNguyenTo;

import java.util.Scanner;

public class TimSoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner timSoNguyenTo = new Scanner(System.in);
		int n;
		System.out.println("Nhập n để kiểm tra số nguyên tố");
		n = timSoNguyenTo.nextInt();
		//for (int i=1; i <= n; i++) {
			//if(n%i==0) {
			//dem= dem+1;
			//}
		//}
		//if(dem > 2) {
			//System.out.println("Ko phải số nguyên tố");
		//}else {
			//System.out.println("Là số nguyên tố");
		//}
	while(n%2==1 && n%3==1) {
		System.out.println("Là số nguyên tố");
		return;
	}
	System.out.println("Ko phải số nguyên tố");
	}
}
