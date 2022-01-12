import java.util.Scanner;

public class stt_50_VuBinhMinh_bai15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Nhập vào một chuỗi: ");
			String str = sc.nextLine();
			sc.close();
			
			String s = "";
			for(int i = 0; i < str.length(); i++) {
				if(!s.contains(String.valueOf(str.charAt(i)))) s += String.valueOf(str.charAt(i));
			}

			char[] ch1 = str.replace(" ", "").toCharArray();
			char[] ch2 = s.replace(" ", "").toCharArray();
			int[] count = new int[ch2.length];
			
			for(int i = 0; i < ch2.length; i++) {
				for(int j = 0; j < ch1.length; j++) {
					if(ch2[i] == ch1[j]) count[i]++;
				}	
			}
			
			int max = count[0];
			for(int i : count) {
				if(i > max) max = i;
			}
			
			System.out.print("Những kí tự có tần suất xuất hiện nhiều nhất trong \"" + str + "\" là: ");
			for(int i = 0; i < count.length; i++) {
				if(count[i] == max) System.out.print(ch2[i] + " ");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
