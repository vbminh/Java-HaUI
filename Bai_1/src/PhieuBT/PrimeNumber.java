package PhieuBT;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào số cần kiểm tra:  ");
		int n = sc.nextInt();
		
		if(Source.isPrime(n))
			System.out.println(n + " là số nguyên tố");
		else 
			System.out.println(n + " không là số nguyên tố");
		sc.close();
	}

}
