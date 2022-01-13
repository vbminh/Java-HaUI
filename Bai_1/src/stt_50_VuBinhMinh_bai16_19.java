import java.util.Scanner;

public class stt_50_VuBinhMinh_bai16_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Nhập vào một chuỗi: ");
			String str = sc.nextLine();
			//bài 16
			String[] str1 = str.split(" ");
			System.out.println("Chuỗi vừa nhập có: " + str1.length + " từ");
			//bài 17
			for(int i = 0; i < str1.length; i++) {
				char[] ch = str1[i].toCharArray();
				ch[0] = Character.toUpperCase(ch[0]);
				str1[i] = new String(ch);
			}
			str = String.join(" ", str1);
			System.out.println("Chuỗi sau khi viết hoa các chữ cái đầu tiên của mỗi từ: " + str);
			//bài 19
			System.out.print("Nhập vị trí bạn muốn cắt chuỗi: ");
			int index = sc.nextInt();
			while(index > str.length() -1) {
				if(index > str.length() -1)
					System.out.println("Vị trí không hợp lệ");
				System.out.print("Nhập vị trí bạn muốn cắt chuỗi: ");
				index = sc.nextInt();
			}
			
			System.out.print("Nhập số lượng kí tự bạn muốn cắt: ");
			int len = sc.nextInt();
			while(len > str.length()) {
				if(len > str.length())
					System.out.println("Số lượng không hợp lệ");
				System.out.print("Nhập số lượng kí tự bạn muốn cắt: ");
				len = sc.nextInt();
			}
			sc.close();
			
			String str2 = str.substring(index, index+len);
			System.out.println("Chuỗi con sau khi cắt: " + str2);
			//bài17
			if(str.equals(str2))
				System.out.println("Hai chuỗi \"" + str + "\" và \"" + str2 + "\" bằng nhau");
			else
				System.out.println("Hai chuỗi \"" + str + "\" và \"" + str2 + "\" không bằng nhau");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
