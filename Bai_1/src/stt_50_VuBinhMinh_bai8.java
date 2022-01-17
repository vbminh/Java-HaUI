import java.util.Arrays;
import java.util.Scanner;

public class stt_50_VuBinhMinh_bai8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,3,5,7,10,15,21};
		
		try {
			System.out.println("Mảng ban đầu: ");
			for(int i : arr) System.out.print(i + " ");
			
			System.out.print("\nNhập số bạn muốn thêm: ");
			int n = sc.nextInt();
			sc.close();
			
			int[] arr1 = new int[arr.length  + 1];
			System.arraycopy(arr, 0, arr1, 0, arr.length);
			
			arr1[arr.length] = n;
			Arrays.sort(arr1);
			System.out.println("Mảng sau khi thêm: ");
			for(int i : arr1) System.out.print(i + " ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
