package Ch2_b10;
import java.util.Scanner;
public class Demkytu {
	public static void main(String[] args) {
		String chuoi;
		char kytu;
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ : ");
		chuoi=sc.nextLine();
		System.out.println("Nhập vào 1 ký tự bất kỳ: ");
		kytu=sc.next();
		for (int i=0;i<chuoi.length();i++)
		{ if(chuoi.charAt(i)==kytu)
			count++;
		}
		System.out.println("Số lần xuất hiện của ký tự"+kytu+"trong chuỗi là: "+count);
	}
}