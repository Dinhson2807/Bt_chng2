package Ch2_b11;

public class SapXep {
	public static void main(String[] args) {
		int n,tam;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Nhập vào số phần tử của mảng: ");
			n=sc.nextInt();
		}while(n<0);
		int A[] = new int[n];
		System.out.println("Nhập vào các phần tử có trong mảng: ");
		for(int i=0;i<n;i++) {
			System.out.println("Nhâp vào phần tử thứ "+i+": ");
			A[i]=sc.newInt();
		}
		System.out.println("\nMảng ban đầu: ");
	    for (int i = 0; i < n; i++) {
	        System.out.print(A[i] + "\t");
	}
	    for(int i=0;i<n-1;i++) {
	    	for(int j=0;j<n-i-1;j++) {
	    		if(A[j]>A[j+1]) {
	    			tam=A[j];
	    			A[j]=A[j+1];
	    			A[j+1]=tam;
	    		}
	    	}
	    }
	    System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
	    	
}
}