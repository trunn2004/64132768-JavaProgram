/**
 * 
 */
package Bai1_DTB;
import java.util.Scanner;
/**
 * 
 */
public class PTbac2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Nhập hệ số a: ");
	     double a = scanner.nextDouble();
	     System.out.print("Nhập hệ số b: ");
	     double b = scanner.nextDouble();
	     System.out.print("Nhập hệ số c: ");
	     double c = scanner.nextDouble();

	     double delta = Math.pow(b, 2) - 4 * a * c;
	     double canDelta = Math.sqrt(delta);

	     System.out.println("Delta: " + delta);
	     System.out.println("Căn delta: " + canDelta);

	     scanner.close();
	}

}
