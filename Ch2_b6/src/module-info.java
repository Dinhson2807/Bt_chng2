package Ch2_b6;

import java.util.Scanner;
	public class Bai_6 {
		public static void main(String[] args) {
			int x;
		Scanner sc=new Scanner(System.in);
		do
		 {
			System.out.println("Nhap 1 so ngyuen duong : ");
			x = nextInt();
		 }while(x<=0);
		if(x==1)
			{System.out.println("Giai thua cua so tren la: 1");}
		else
		{	
			long giaithua=1;
			for(int i=1;i<=x;i++)
				giaithua=giaithua*i;
		}	
			System.out.println("Giai thua cua so tren la:"+ giaithua);
		
		}	
		}