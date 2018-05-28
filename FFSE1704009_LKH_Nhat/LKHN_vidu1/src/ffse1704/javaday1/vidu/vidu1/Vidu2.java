package ffse1704.javaday1.vidu.vidu1;
import java.util.Scanner;
public class Vidu2 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		
		System.out.print("Nhập số a");
		int A = myInput.nextInt();

		System.out.print("Nhập số b");
		int B = myInput.nextInt();
		
		int tong= A+B;
		
		System.out.println("Tổng: "+ A + "+" + B +"="+tong);
	}

}
