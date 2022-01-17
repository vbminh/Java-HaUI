import java.util.Scanner;

public class stt_50_VuBinhMinh_bai7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1,5,2,8,10,12,4,7,9};
		
		try {
			System.out.print("\nNhập giá trị bạn muốn tìm kiếm: ");
			int x = sc.nextInt();
			sc.close();
			
			int count = 0;
			for(int i : arr) {
				if(i == x) {
					System.out.print("Tìm thấy giá trị của " + x + " tại vị trí " + i);
				}
				else count++;
			}
			if(count == arr.length) System.out.println("Không tìm thấy giá trị của " + x);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
