import java.util.Scanner;
public class stt_50_VuBinhMinh_bai5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("\t======UCLN======");
			System.out.print("Nhập vào số thứ nhất:  ");
			int n;
			do {
				n = sc.nextInt();
				if(n < 0)
					System.out.println("Bạn phải nhập một số nguyên dương. Hãy nhập lại");
			}while(n < 0);
			
			System.out.print("Nhập vào số thứ hai:  ");
			int m;
			do {
				m = sc.nextInt();
				if(m < 0)
					System.out.println("Bạn phải nhập một số nguyên dương. Hãy nhập lại");
			}while(m < 0);
			sc.close();
			
			System.out.println("UCLN của " + m + " và " + n + " là: " + UCLN(m, n));
		}
		catch (Exception e) {
			System.out.println("Hãy nhập một số nguyên dương");
		}
	}
	
	public static int UCLN(int m, int n) {
		while(m != n) {
			if(m > n) m = m - n;
			else n = n - m;
		}
		return n;
	}
}
