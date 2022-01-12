import java.util.Scanner;

public class stt_50_VuBinhMinh_bai9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] arr = {1,2,3,4,5,6,7,8,9,0};
			int[] arr1 = {1,3,5,7,9,11,13,15};
			int[] arr2 = {2,4,6,8,10,12,14,16};
			int[] arr3 = {3,7,5,9,2,1,5};
			
			System.out.print("Nhập vào một giá trị bất kì: ");
			int n = sc.nextInt();
			sc.close();
			
			if(Sum(arr) == n)
				System.out.println("Mảng arr có tổng giá trị các phần tử bằng " + n);
			else if(Sum(arr1) == n)
				System.out.println("Mảng arr1 có tổng giá trị các phần tử bằng " + n);
			else if(Sum(arr2) == n)
				System.out.println("Mảng arr2 có tổng giá trị các phần tử bằng " + n);
			else if(Sum(arr3) == n)
				System.out.println("Mảng arr3 có tổng giá trị các phần tử bằng " + n);
			else
				System.out.println("Không có mảng số nguyên nào có giá trị bằng " + n);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int Sum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum; 
	}

}
