
public class stt_50_VuBinhMinh_bai11_12_13 {

	public static void main(String[] args) {
		int[][] arr = {{1,3,7,9},{2,4,6,8},{1,2,3,4}} ;
		
		System.out.println("Cho mảng 2 chiều: ");
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//Tìm phần tử lớn nhất;
		int max = 0;
		for(int[] i : arr) {
			for(int j : i) {
				if(j > max) max = j;
			}
		}
		System.out.println("Phần tử lớn nhất trong mảng là: " + max);
		//Tạo arr1 là bản sao của arr
		int[][] arr1 = arr.clone();
		System.out.println("Bản sao của arr: ");
		for(int[] i : arr1) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		//Nhân 2 mảng
		int[][] arr2 = new int[3][4];
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr2[i][j] = 0;
				for(int k = 0; k < 3; k++)
				{
					arr2[i][j] = arr[i][k] * arr1[k][j];
				}
			}
		}
		System.out.println("\nTích 2 mảng trên là: ");
		for(int[] i : arr2) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
