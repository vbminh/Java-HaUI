import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLPhongThi {
	private static List<PhongThi> phongthi = new ArrayList<PhongThi>();
	static String fileName="thiSinh.txt";
	private static DBEngine db = new DBEngine();
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("*****QUẢN LÝ PHÒNG THI*****");
		 //==================================
		
		System.out.println("\n");
		do {
			menu();
			int t=sc.nextInt();
			sc.nextLine();
			switch(t) {
				case 1: themphongthi();break;
				case 2: phongthiController();break;
				case 3: phongthi.forEach(item -> inDanhsachTS(item)); break;
				default: System.out.println("Lựa chọn không hợp lệ"); System.exit(1);
			}
		}while(true);
	}
	
	static void themphongthi() {
		System.out.print("Mã số phòng thi: ");
		String id = sc.nextLine();
		System.out.print("Địa chỉ phòng thi: ");
		String address = sc.nextLine();
		System.out.print("Số lượng thí sinh: ");
		int number = sc.nextInt();
		sc.nextLine();
		phongthi.add(new PhongThi(id, address, number));
	}
	
	static void phongthiController() {
		//Hiển thị danh sách phòng thi
		for(int i = 0; i < phongthi.size(); i++)
			System.out.println((i+1) + ": " + phongthi.get(i).getMsPT());
		//Chọn 1 phòng thi để thao tác
		System.out.print("Chọn phòng thi số: ");
		int num; 
		while(true) {
			num = sc.nextInt();
			if(num > 0 && num <= phongthi.size()) break;
			System.out.print("Phòng thi không hợp lệ. Hãy chọn lại: ");
		}
		//Các chức năng thao tác với 1 phòng thi
		boolean flag = true;
		do {
			submenu();
			int tl=sc.nextInt();
			switch(tl) {
				case 1: themTS(phongthi.get(num-1));break;
				case 2: suaTTTS(phongthi.get(num-1));break;
				case 3: xoaTS(phongthi.get(num-1));break;
				case 4: layTTTS_soBD(phongthi.get(num-1));break;
				case 5: layTTTS_chiso(phongthi.get(num-1));break;
				case 6: inDanhsachTS(phongthi.get(num-1)); break;
				case 7: luuFile(phongthi.get(num-1)); break;
				case 8: docFile(phongthi.get(num-1)); break;
				case 9: sapxep(phongthi.get(num-1)); break;
				case 0: flag = false; break;
			}
			}while(flag);
	}
	
	static void menu() {
		System.out.println("================================");
		System.out.println("1. Thêm phòng thi mới");
		System.out.println("2. Danh sách phòng thi");
		System.out.println("3. In danh sách phòng thi");
		System.out.println("******************");
		System.out.print("\t**Chọn lựa của bạn? <1->3>:");
	}
	
	static void submenu(){
		System.out.println("================================");
		System.out.println("1. Thêm thí sinh mới");
		System.out.println("2. Hiệu chỉnh thông tin thí sinh");
		System.out.println("3. Xóa thí sinh khỏi phòng thi");
		System.out.println("4. Lấy thông tin Thí sinh khi biết số báo danh.");
		System.out.println("5. Lấy thông tin Thí sinh khi biết số thứ tự.");
		System.out.println("6. In danh sách thí sinh");
		System.out.println("7. Lưu phòng thi xuống file");
		System.out.println("8. Đọc thông tin phòng từ file");
		System.out.println("9. Sắp xếp thí sinh theo số báo danh");
		System.out.println("0. Thoát");
		System.out.println("******************");
		System.out.print("\t**Chọn lựa của bạn? <0->9>:");
	}

	static void themTS(PhongThi phongthi) {
		ThiSinh ts=new ThiSinh();
		ts.nhap();
		if(phongthi.themThiSinh(ts))
			System.out.println("Thêm thành công");
		else
			System.out.println("Không thêm được.");
	}
	
	static void xoaTS(PhongThi phongthi) {
		Scanner input=new Scanner(System.in);
		System.out.print("\tNhập số báo danh cần xóa:");
		String soBD=input.nextLine();
		input.nextLine();
		if(phongthi.xoaThisinh(soBD))
			System.out.println("Xóa thành công");
		else
			System.out.println("Không xóa được!");
	}
	
	static void suaTTTS(PhongThi phongthi) {
		Scanner input=new Scanner(System.in);
		System.out.print("\tNhập số báo danh cần sửa:");
		String soBD=input.nextLine();
		ThiSinh newTS=new ThiSinh();
		newTS.nhap();
		if(phongthi.suaThongtinTS(soBD, newTS))
			System.out.println("Sua thanh cong");
		else
			System.out.println("Khong sua duoc!");
	}
	
	static void layTTTS_chiso(PhongThi phongthi) {
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap so thu tu can lay thong tin:");
		int stt=input.nextInt();
		ThiSinh ts= phongthi.layThongtinTS(stt);
		if(ts==null)
			System.out.println("khong co");
		else
			System.out.println(ts);
	}
	
	static void layTTTS_soBD(PhongThi phongthi) {
		Scanner input=new Scanner(System.in);
		System.out.print("\tNhap so bao danh can lay thong tin:");
		String soBD=input.nextLine();
		ThiSinh ts=phongthi.layThongtinTS(soBD);
		System.out.println("~~~~~~~~~~Ket qua~~~~~~~~~~~~~~");
		if(ts==null)
			System.out.println("Khong co");
		else
			System.out.println(ts);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	static void inDanhsachTS(PhongThi phongthi) {
		System.out.println(phongthi);
		System.out.println("\t==========DANH SÁCH THÍ SINH=========");
		for (int i = 0; i < phongthi.soThisinh(); i++) {
			ThiSinh ts=phongthi.layThongtinTS(i);
			System.out.println(ts);
		}
		System.out.println("=====================================");
	}

	public static void luuFile(PhongThi phongthi){
		try {
			db.LuuFile(fileName, phongthi);
		} 
		catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	public static void docFile(PhongThi phongthi){
		try {
			phongthi=(PhongThi) db.docFile(fileName);
			System.out.println(phongthi);
			for (int i = 0; i < phongthi.soThisinh(); i++) {
				ThiSinh ts=phongthi.layThongtinTS(i);
				System.out.println(ts);
			}
		} catch (Exception ex) {
			System.out.println("không đọc được file");
		}
	}
	
	static void sapxep(PhongThi phongthi) { 
		phongthi.sapxep();
		inDanhsachTS(phongthi);
	}
}
