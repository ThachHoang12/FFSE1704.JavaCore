package first.project;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Giải phương trình bậc hai một ẩn");
		Scanner myInput = new Scanner(System.in);
		System.out.println("nhập vào số a:");
		a = myInput.nextInt();
		System.out.println("nhập vào số b:");
		b = myInput.nextInt();
		System.out.println("nhập vào số c:");
		c = myInput.nextInt();
		System.out.println("phương trình có dạng " + a + "x*x + " + b + "x " + " + " + c + " = 0 ");
		int delta=b*b-4*a*c;
		System.out.println("delta = b*b-4*a*c" + " = " + (b*b-4*a*c));
		if(delta>0) {
			System.out.println("phương trình có hai nghiệm phân biệt ");
			System.out.println("X1= " + (-b+Math.sqrt(delta))/(2*a));
			System.out.println("X2= " + (-b-Math.sqrt(delta))/(2*a));
		}
		if(delta==0) {
			System.out.println("phương trình có nghiệm kép X1 = X2 = "+ (-b/(2*a)));
		}
		if(delta<0) {
			System.out.println("phương trình vô nghiệm");
		}

	}

}
