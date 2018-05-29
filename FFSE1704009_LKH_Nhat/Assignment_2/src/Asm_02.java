/**
 * LEE KHAR HOONG NHAATJ------ASM_JAVA_02
 **/

/**
 * @author Support
 *
 */
import java.util.Scanner;

public class Asm_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n;
		Scanner N = new Scanner(System.in);

		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = N.nextInt();
		} while (n < 0);

		// khởi tạo và cấp phát bộ nhớ cho mảng
		int array[] = new int[n];

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			System.out.print("Nhập phần tử thứ " + j + ": ");
			array[i] = N.nextInt();
		}

		// Hiển thị mảng vừa nhập
		System.out.println("Mảng đã nhập: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		// tìm min max
		int max = array[0];

		int min = array[0];

		for (int i = 0; i < n; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Giá trị lớn nhất trong dãy số là: " + max);
		System.out.println("Giá trị nhỏ nhất trong dãy số là: " + min);

		int X = max;
		
		int A = 0;
		int B = n - 1;
		
		// System.out.println(B);
		// nếu A còn nhỏ hơn hoặc bằng B thì còn tiếp tục thực hiện thân vòng lặp
		
		while (A <= B) {
			int C = (A + B) / 2;

			// nếu giá trị phần tử tại vị trí C bằng số nguyên X cần tìm
			// thì thông báo tìm thấy số X tại vị trí C
			// và kết thúc vòng lặp
			if ( array[C] == X) {
				System.out.println("Giá trị lớn nhất là " + X + " tại vị trí thứ " + C + " trong mảng");
				
				break; // kết thúc vòng lặp while và bỏ qua các lệnh bên dưới
			} else {
				if ( array[C] < X) {
					// nếu phần tử tại C nhỏ hơn số nguyên X
					// thì tăng A = B + 1
					// và quay lại thực hiện vòng lặp while
					A = C + 1;
				} else {
					// nếu phần tử tại C lớn hơn số nguyên X
					// thì giảm B = C - 1
					// và quay lại thực hiện vòng lặp while
					B = C - 1;
				}
			}
		};
		int Y = min;
		int a = 0;
		int b = n - 1;
		while (a <= b) {
			int D = (a + b) / 2;
			if ( array[D] == Y) {				
				System.out.println("Giá trị nhỏ nhất là " + Y + " tại vị trí thứ " + D + " trong mảng");
				break; 
			} else {
				if ( array[D] < Y) {
					a = D + 1;
				} else {
					b = D - 1;
				}
			}
		};
	}

}
