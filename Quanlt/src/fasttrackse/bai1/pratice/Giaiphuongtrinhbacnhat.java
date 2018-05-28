package fasttrackse.bai1.pratice;

import java.util.Scanner;

public class Giaiphuongtrinhbacnhat {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	System.out.println("Nhap so a: ");
	int a=sc1.nextInt();
	System.out.println("Nhap so b:");
	int b=sc1.nextInt();
	int c;
	if(a==0) {
		if(b==0) {
			System.out.println("Phương trình "+a+"x+"+b+"=0 có vô số nghiệm");
		}else {
			System.out.println("Phương trình "+a+"x+"+b+"=0 có vô nghiệm");
		}
		
	}else {
		c=-b/a;
		System.out.println("Phương trình "+a+"x+"+b+"=0 có nghiệm "+c);
	}
}
}
