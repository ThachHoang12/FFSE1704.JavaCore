package ffse.khoa.bai3;

import java.util.Scanner;

public class Giaiphuongtrinhbac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b , c , a1 , a2 , delta;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Ban Hay Nhap a : ");
		a = Scanner.nextInt();
		System.out.println("Ban Hay Nhap b : ");
		b = Scanner.nextInt();
		System.out.println("Ban Hay Nhap c : ");
		c = Scanner.nextInt();
		if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }
		delta = (int) (Math.pow(b, 2) - 4 * a * c);
		if (delta < 0){
			System.out.println("Phương trình vô nghiệm!");
        	
        } else if (delta == 0) {
        	a1 = a2 = -b/ (2*a);
        } else {
        	a1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            a2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm x1 = " + a1 + " và x2 = " + a2);
        }
	}

}
