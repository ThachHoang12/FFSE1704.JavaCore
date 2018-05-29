/**
 * 
 */

/**
 * @author Support
 *
 */
import java.util.Scanner;
public class Vidu5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		  Scanner myInput = new Scanner(System.in);
		  System.out.println("Nhập số cần kiểm tra: ");
		   n = myInput.nextInt();
		  while (n<1)
		  {
		      System.out.println("n phải lớn hơn hoặc bằng 1: ");
		      n = myInput.nextInt();
		  }
		  
		   int dem = 0;
		   for (int i = 1; i<=n; i++)
		   {
		    if (n%i == 0)
		     dem++;
		   }
		   if (dem ==2)
		      System.out.println("Số "+n+" là số nguyên tố");
		   else
		    System.out.println("Số "+n+" không phải số nguyên tố"); 
		  }
		 }

