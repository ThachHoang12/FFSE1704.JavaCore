package ffse.thach.bai1;

import java.util.Scanner;

public class Mang {

	public static void main(String[] args) {
		
				
					//Phần khai báo
				
				int N; //Tổng số phân tử mảng
				int [] myArray;
				int gtMax, gtMin, vtMax, vtMin;
				
				Scanner myInput = new Scanner(System.in);
				
				//phần thân
				
				//1. Nhập mảng
				
				System.out.print("mời bạn nhập tổng số phần tử mảng N = ");
				
				//Khởi tạo mảng N phần tử
				
				N = myInput.nextInt();
				
				myArray = new int[N];

				
				//Vòng lặp để nhập từng phẩn tử mảng myArray
				
				for (int i=0; i<N; i++) {
					System.out.print("giá trị phẩn tử thứ " + i +" : ");
					myArray[i] = myInput.nextInt();
				}
				
				//In mảng
				
				System.out.print("Danh sách phẩn tử mảng");
				for (int i=0;i<N;i++) {
					System.out.print(" " + myArray[i]);

				}
				
				gtMax = myArray[0];
				gtMin = myArray[0];
				vtMax = 0;
				vtMin = 0;
				
				for (int i=0;i<N;i++) {
					if(myArray[i]>gtMax) {
						gtMax = myArray[i];
						vtMax = i+1;
					}
					if(myArray[i]<gtMin) {
						gtMin = myArray[i];
						vtMin = i+1;
					}
				}
				System.out.println(" Giá trị lớn nhất là: " +gtMax+" Nằm ở vị trí thứ :" +vtMax);
				
				System.out.println(" Giá trị nhỏ nhất là: " +gtMin+" Nằm ở vị trí thứ :" +vtMin);

				
			}

		}

	
