package Ch2b1; 

import java.text.DecimalFormat;

import java.util.Scanner;
	public class Bai1
	{
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Nhap so thu 1:");
			int a= sc.nextInt();
			System.out.println("Nhap so thu :");
			int b= sc.nextInt();
			System.out.println("Tong hai so do la:"+(a+b));
			System.out.println("Hieu hai so do la:"+(a-b));
			System.out.println("Tich hai so do la:"+(a/b));
			System.out.println("Chia lay phan du:"+(a%b));
			if(a>b) 
			{System.out.println("So thu1 lon hon so thu2");}
			else if (b>a)
			{System.out.println("So thu2 lon hon so th1");}
			else (a==b)
			{System.out.println("Hai so bang nhau");}
		}
	}

