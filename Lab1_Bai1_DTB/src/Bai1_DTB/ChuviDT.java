/**
 * 
 */
package Bai1_DTB;
import java.util.Scanner;
/**
 * 
 */
public class ChuviDT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        
        double chieuRong = scanner.nextDouble();
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;
        double canhNho = Math.min(chieuDai, chieuRong); //Math.min dùng để tìm giá trị nhỏ nhất trong hai số đó
        
        System.out.println("Chu vi của hình chữ nhật: " + chuVi);
        System.out.println("Diện tích của hình chữ nhật: " + dienTich);
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + canhNho);
	}

}
