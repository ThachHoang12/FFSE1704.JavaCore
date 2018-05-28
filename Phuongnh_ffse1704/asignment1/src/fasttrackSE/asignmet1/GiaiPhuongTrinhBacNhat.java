/**
 * 
 */
package fasttrackSE.asignmet1;

import java.util.Scanner;

/**
 * @author PC
 *
 */
public class GiaiPhuongTrinhBacNhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int thamsoA, thamsoB ;
      double nghiemX;
      Scanner myInput =new Scanner(System.in);
       
      System.out.println("------------------------------------");
      System.out.println("|   CHƯƠNG TRÌNH GPTBN AX + B =0   |");
      System.out.println("------------------------------------");
       
      System.out.println("nhập tham số A:");
      thamsoA = myInput.nextInt();
      
      System.out.println("nhập tham số B:");
      thamsoB = myInput.nextInt();
      if (thamsoA==0){
    	  if (thamsoB==0) {
    		  System.out.println("Phương trình " + thamsoA + "X" + thamsoB + "CÓ VÔ SỐ NGHIỆM");
    	  }
    	  else {
    		  System.out.println("Phương trình " + thamsoA + "X" + thamsoB + "VÔ NGHIỆM");
    	  } 
      }
	
      	 else{
    	  nghiemX = -thamsoB *1.0 / thamsoA ;
    	  System.out.println("Phương trình " + thamsoA + "X" + thamsoB + "CÓ Nghiệm là: " + nghiemX );
    	  
      }
      }
}
