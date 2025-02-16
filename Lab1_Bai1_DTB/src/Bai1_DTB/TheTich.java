/**
 * 
 */
package Bai1_DTB;
import java.util.Scanner;
/**
 * 
 */
public class TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Nhập cạnh của khối lập phương: ");
	     double canh = scanner.nextDouble();
	     double theTich = canh*canh*canh;
	     System.out.println("Thể tích của khối lập phương: " + theTich);

	     scanner.close();
	}

}
