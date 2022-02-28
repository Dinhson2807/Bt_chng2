package Ch2_b8 ;

class TongnSo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập vào số phần tử của Mảng : ");
			 n= sc.nextInt();					
		}while(n<0);
		int A[] = new int[n];
		System.out.println("Nhập vào các phần tử của mảng : ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhập phần tử thứ "+i +": ");
			A[i]=sc.nextInt();
		}
		double Tong=0;
		for (int i=0;i<n;i++) {
			Tong+=A[i];
		}
		System.out.println("Trung bình cộng của dãy vừa nhập là: "+(Tong/n));
	}
	
}
