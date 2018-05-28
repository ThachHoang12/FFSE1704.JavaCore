package fasttrackSE.asignmet1;
import java.util.Scanner;
public class Asignment1 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int soA, soB, tongHaiSo ;
       Scanner myInput = new Scanner(System.in);
       
       System.out.println("nhập số A:");
       soA = myInput.nextInt();
       
       System.out.println("nhập số B:");
       soB = myInput.nextInt();
       
       tongHaiSo = soA + soB ;
       System.out.println("tổng hai số " + soA +" và " + soB + " là: " + tongHaiSo);
       
        
	}

}
