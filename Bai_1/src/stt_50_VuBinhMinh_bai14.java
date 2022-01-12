import java.util.Scanner;

public class stt_50_VuBinhMinh_bai14 {

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
			
			int dem = 0;
			for(int i = 0; i < count.length; i++) {
				if(count[i] == 1) dem++;
			}
			System.out.print("Số lượng kí tự khác nhau trong \"" + str + "\" là: " + dem);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
