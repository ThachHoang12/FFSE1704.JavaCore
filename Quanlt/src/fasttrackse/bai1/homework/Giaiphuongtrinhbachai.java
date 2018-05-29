package fasttrackse.bai1.homework;

import java.util.*;

public class Giaiphuongtrinhbachai {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Chương trình giải phương trình bậc 2 có dạng ax2 + bx + c = 0 (a ≠ 0)");
		System.out.println("Nhập số a: ");
		float a = sc2.nextFloat();
		System.out.println("Nhập số b: ");
		float b=sc2.nextFloat();
		System.out.println("Nhập số c: ");
		float c=sc2.nextFloat();
		float denta= b*b - 4*a*c;
		float nghiemx1;
		float nghiemx2;
		if(denta==0) {
			nghiemx1=(-b)/(2*a);
			System.out.println("Phương trình trên có nghiệm kép : x1=x2= "+nghiemx1);
			}else if(denta>0) {
				nghiemx1=(float) ((-b + Math.sqrt(denta)) / (2*a));
				nghiemx2=(float) ((-b - Math.sqrt(denta)) / (2*a));
				System.out.println("Phương trình trên có nghiệm : x1= "+nghiemx1);
				System.out.println("Phương trình trên có nghiệm : x2= "+nghiemx2);
		}else {
			System.out.println("Phương trình trên vô nghiệm ");
		}

	}
}
