package ffse.khoa.bai2;

import java.util.Scanner;

public class Phuongtrinhbac1 {
	public static void main(String[] args) {
        // TODO code application logic here
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap a : ");
        a = sc.nextInt();
        System.out.println("Ban hay nhap b : ");
        b = sc.nextInt();
        if ( a == 0){
            if ( b == 0) {
                System.out.println("Phuong trinh vo so nghiem");             
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
    } else {
            float x = (float) - b/a;
            System.out.println("Phuong trinh co nghiem duy nhat : "+ x);
        }
    
}


	

}
