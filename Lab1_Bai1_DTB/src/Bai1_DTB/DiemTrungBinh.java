/**
 * 
 */
package Bai1_DTB;

import java.util.Scanner;
/**
 * 
 */
public class DiemTrungBinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ và tên:");
		String hoTen = scanner.nextLine();
		System.out.print("Nhập điểm trung bình:");
		double diemTB = scanner.nextDouble();
		System.out.println("Họ và tên:" + hoTen);
		System.out.println("Điểm trung bình:" + diemTB);
		scanner.close();
		
	}

}
