import java.util.Scanner;

public class stt_50_VuBinhMinh_bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("\t======Số nguyên tố======");
			System.out.print("Nhập vào số cần kiểm tra:  ");
			int n = sc.nextInt();
			sc.close();
			
			if(SoNguyenTo(n))
				System.out.println(n + " là số nguyên tố");
			else 
				System.out.println(String.format("%s không là số nguyên tố", n));
		}
		catch (Exception e) {
			System.out.print("Hãy nhập vào một số");
		}

	}
	
	public static boolean SoNguyenTo(int n) {
		if(n < 0)
			return false;
		else if(n < 2)
			return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
