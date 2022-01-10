package PhieuBT;

public class Source {
	//Kiểm tra là số nguyên tố: true; ngược lại false
	public static boolean isPrime(int n) {
		if(n < 0)
			return false;
		else if(n < 2)
			return false;
		for(int i = 2; i < (int)Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
