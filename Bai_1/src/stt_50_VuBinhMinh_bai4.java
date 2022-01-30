import java.util.Scanner;

public class stt_50_VuBinhMinh_bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("\t======Tổ hợp chập m của n======");
			System.out.print("Nhập n:  ");
			int n;
			do {
				n = sc.nextInt();
				if(n < 1)
					System.out.println("n phải lớn hơn 1");
			}while(n < 1);
			
			System.out.print("Nhập m:  ");
			int m;
			do {
				m = sc.nextInt();
				if(m < 0 || m > n)
					System.out.println("m phải lớn hơn 0 và nhỏ hơn n (0 < m < n)");
			}while(m < 0 || m > n);
			sc.close();
			
			System.out.println("Tổ hợp chập " + m + " của " + n + " là: C(m,m) = " + Cmn(m, n));
		}
		catch (Exception e) {
			System.out.println("Hãy nhập một số nguyên dương");
		}

	}
	
	public static int factorial(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return n * factorial(n - 1);
	}
	
	public static int Cmn(int m, int n) {
		if (m == 0) return 1;
		if (m == 1) return n;
		return factorial(n) / (factorial(m)*factorial(n - m));
	}
	
}
