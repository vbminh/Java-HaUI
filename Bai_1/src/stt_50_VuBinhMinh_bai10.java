import java.util.Arrays;

public class stt_50_VuBinhMinh_bai10 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,7,2,6,5,0,9,8};
		System.out.print("Cho mảng: ");
		for(int i : arr) System.out.print(i + " ");
		
		String snt = "";
		String sn = "";
		for(int i : arr) {
			if(SoNguyenTo(i)) snt += String.valueOf(i);
			else sn = String.valueOf(i);
		}
		System.out.print(snt + " " + sn);
		
		Arrays.sort(snt.toCharArray());
		Arrays.sort(sn.toCharArray());
		
		char[] arr1 = new char[snt.length() + sn.length()];
		System.arraycopy(snt.toCharArray(), 0, arr1, 0, snt.length());
		System.arraycopy(sn.toCharArray(), 0, arr1, snt.length(), sn.length());
		
		System.out.println("Mảng sau khi sắp xếp: ");
		for(int i : arr1) System.out.print(i + " ");
	}
	public static boolean SoNguyenTo(int n) {
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
