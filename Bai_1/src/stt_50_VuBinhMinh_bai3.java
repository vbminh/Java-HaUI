import java.util.Scanner;

public class stt_50_VuBinhMinh_bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("\t======Giai thừa======");
			System.out.print("Nhập vào số cần tính:  ");
			int n;
			do {
				n = sc.nextInt();
				if(n < 0)
					System.out.println("Bạn phải nhập một số nguyên dương. Hãy nhập lại");
			}while(n < 0);
			sc.close();
			
			System.out.println("Giai thừa của " + n + " là: " + factorial(n));
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
}
