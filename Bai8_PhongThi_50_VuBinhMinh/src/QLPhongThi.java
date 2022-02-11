import java.util.Collections;
import java.util.Scanner;

public class QLPhongThi {
	private static PhongThi phongthi = null;
	static String fileName="thiSinh.txt";
	private static DBEngine db = new DBEngine();
	
	public static void main(String[] args) {
		System.out.println("*****QUẢN LÝ PHÒNG THI*****");
		 //==================================
		System.out.println("\n");
		phongthi=new PhongThi("pt01SE","Phòng 502, A9",20);
		//==================================
		Scanner sc=new Scanner(System.in);
		do {
		menu();
		int tl=sc.nextInt();
		switch(tl) {
			case 1: themTS();break;
			case 2: suaTTTS();break;
			case 3: xoaTS();break;
			case 4: layTTTS_soBD();break;
			case 5: layTTTS_chiso();break;
			case 6: inDanhsachTS(); break;
			case 7: luuFile(); break;
			case 8: docFile(); break;
			case 9: System.out.println("BYE"); System.exit(1);
		}
		}while(true);
	}
	
	static void menu(){
		System.out.println("================================");
		System.out.println("1. Thêm Thí sinh mới");
		System.out.println("2. Hiệu chỉnh thông tin thí sinh");
		System.out.println("3. Xóa thí sinh khỏi phòng thi");
		System.out.println("4. Lấy thông tin Thí sinh khi biết số báo danh.");
		System.out.println("5. Lấy thông tin Thí sinh khi biết số thứ tự.");
		System.out.println("6. In danh sách thí sinh");
		System.out.println("7. Lưu phòng thi xuống file");
		System.out.println("8. Đọc thông tin phòng từ từ file");
		System.out.println("9. Thoát");
		System.out.println("******************");
		System.out.print("\t**Chọn lựa của bạn? <1->9>:");
	}

	static void themTS() {
		ThiSinh ts=new ThiSinh();
		ts.nhap();
		if(phongthi.themThiSinh(ts))
			System.out.println("Thêm thành công");
		else
			System.out.println("Không thêm được.");
	}
	
	static void xoaTS() {
		Scanner input=new Scanner(System.in);
		System.out.print("\tNhập số báo danh cần xóa:");
		String soBD=input.nextLine();
		input.nextLine();
		if(phongthi.xoaThisinh(soBD))
			System.out.println("Xóa thành công");
		else
			System.out.println("Không xóa được!");
	}
	
	static void suaTTTS() {
		Scanner input=new Scanner(System.in);
		System.out.print("\tNhập số báo danh cần sửa:");
		String soBD=input.nextLine();
		ThiSinh newTS=new ThiSinh();
		newTS.nhap();
		if(phongthi.suaThongtinTS(soBD, newTS))
			System.out.println("Sửa thành công");
		else
			System.out.println("Không sửa được!");
	}
	
	static void layTTTS_chiso() {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhập số thứ tự cần lấy thông tin:");
		int stt=input.nextInt();
		ThiSinh ts= phongthi.layThongtinTS(stt);
		if(ts==null)
			System.out.println("không có");
		else
			System.out.println(ts);
	}
	
	static void layTTTS_soBD() {
		Scanner input=new Scanner(System.in);
		System.out.print("\tNhập số báo danh cần lấy thông tin:");
		String soBD=input.nextLine();
		ThiSinh ts=phongthi.layThongtinTS(soBD);
		System.out.println("~~~~~~~~~~Kết quả~~~~~~~~~~~~~~");
		if(ts==null)
			System.out.println("Không có");
		else
			System.out.println(ts);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	static void inDanhsachTS() {
		System.out.println("==========DANH SÁCH THÍ SINH=========");
		System.out.println("Số BD \tHọ tên \tĐiểm toán \tĐiểm Lý \tĐiểm Hóa");
		for (int i = 0; i < phongthi.soThisinh(); i++) {
			ThiSinh ts=phongthi.layThongtinTS(i);
			System.out.println(ts);
		}
		System.out.println("=====================================");
	}

	public static void luuFile(){
		try {
			
			db.LuuFile(fileName, phongthi);
			System.out.println("Lưu file thành công");
		} 
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	public static void docFile(){
		try {
			phongthi=(PhongThi) db.docFile(fileName);
		} catch (Exception ex) {
			System.out.println("không đọc được file");
		}
	}

}
