package Ch2_b12; 

public class Gtln{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số dòng của Ma trận: ");
		a=sc.nextInt();
		System.out,println("Nhập vào số cột của Ma trận: ");
		b=sc.nextINt();
		int A[][]= new int[a][b];
		System.out.println("Nhập vào các phần tử của Ma trận: ");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.println("A["+i+"]["+j+"]= ");
				A[i][j]=sc.nextInt();
			}
		}
		int max=A[0][0];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++){
				if(max<A[i][j]) {
					max=A[i][j];
				}
			}
		}System.out.println("Giá trị lơn nhất có trong ma trận là: "+max);
	}
}