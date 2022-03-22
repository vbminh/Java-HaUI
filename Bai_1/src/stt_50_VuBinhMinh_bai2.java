import java.util.Scanner;

public class stt_50_VuBinhMinh_bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("\t======Phương trình bậc 2======");
			System.out.println("Nhập vào các hệ số:");
			System.out.print("a = ");
			int a = sc.nextInt();	
			System.out.print("b = ");
			int b = sc.nextInt();
			System.out.print("c = ");
			int c = sc.nextInt();
			sc.close();
			
			float delta = (float) (Math.pow(b, 2) - 4*a*c);
			
			if(delta > 0) {
				System.out.println("\nPhương trình bậc 2: " + a + "x^2 + " + b + "x + " + c + " = 0 có 2 nghiệm phân biệt::");
				System.out.print("x1 = " + (-b + Math.sqrt(delta))/(2*a) + "\tx2 = " + (-b - Math.sqrt(delta))/(2*a));
			}
			else if(delta == 0) {
				System.out.println("\nPhương trình bậc 2: " + a + "x^2 + " + b + "x + " + c + " = 0 có nghiệm kép:");
				System.out.print("x1 = x2 = " + (-b)/(2*a));
			}
			else {
				System.out.println("\nPhương trình bậc 2: " + a + "x^2 + " + b + "x + " + c + " = 0 có 2 nghiệm phức:");
				System.out.print("x1 = " + (-b)/(2*a) + " + " + Math.sqrt(Math.abs(delta))/(2*a) + "i" + "\tx2 = " + (-b)/(2*a) + " + " + (-Math.sqrt(Math.abs(delta))/(2*a)) + "i");
			}
		}
		catch (Exception e) {
			System.out.println("Hãy nhập vào một số");
			e.printStackTrace();
		}

	}

}
