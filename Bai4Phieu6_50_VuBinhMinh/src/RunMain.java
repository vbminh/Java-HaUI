import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<HangHoa> list = new ArrayList<HangHoa>();
		list.add(new HangDienMay("H01", "Tivi", 5, 3.500, 12, 170));
		list.add(new HangDienMay("H05", "Tu lanh", 1, 2.350, 6, 220));
		list.add(new HangSanhSu("H02", "Bat su", 60, 40, "Bat Trang", new NgayThang(10, 1, 2022)));
		list.add(new HangSanhSu("H04", "Lo hoa", 80, 75, "Bat Trang", new NgayThang(1, 1, 2022)));
		list.add(new HangSanhSu("H07", "Dia su", 30, 50, "Bat Trang", new NgayThang(12, 6, 2021)));
		list.add(new HangThucPham("H03", "Xuc xich", 6, 10, "Nutifood", new NgayThang(15, 11, 2021), new NgayThang(26, 6, 2022)));
		list.add(new HangThucPham("H03", "Thit ga", 6, 25, "Nutifood", new NgayThang(20, 1, 2022), new NgayThang(17, 1, 2022)));
	
		boolean flag = true;
		try {
			do {
				System.out.println("\t\t======Menu========");
				System.out.println("1. Them mot hang moi \n2. Hien thi danh sach hang \n0. Thoat");
				System.out.print("Lua chon cua ban: ");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("\nHay chon mot loai hang:");
					System.out.println("1. Hang dien may \n2. Hang sanh su \n3. Hang thuc pham \n0. Quay lai");
					System.out.print("Ban chon: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Nhap thong tin hang dien may: ");
						HangDienMay hdm = new HangDienMay();
						sc.nextLine();
						checkID(hdm, list);
						hdm.input();
						list.add(hdm);
						System.out.println("---Them thanh cong---");
						break;

					case 2:
						System.out.println("Nhap thong tin hang sanh su: ");
						HangSanhSu hss = new HangSanhSu();
						sc.nextLine();
						checkID(hss, list);
						hss.input();
						list.add(hss);
						System.out.println("---Them thanh cong---");
						break;
						
					case 3:
						System.out.println("Nhap thong tin hang thuc pham: ");
						HangThucPham htp = new HangThucPham();
						sc.nextLine();
						checkID(htp, list);
						htp.input();
						list.add(htp);
						System.out.println("---Them thanh cong---");
						break;
						
					case 0:
						break;
					}
					System.out.println();
					flag = true;
					break;
				
				case 2:
					System.out.println("\n\t\t=======Danh sach hang hoa=======");
					System.out.println("Hang dien may:");
					InTieuDeHDM();
					for(HangHoa item : list) {
						if(item instanceof HangDienMay)
							System.out.println(item);
					}
					
					System.out.println("\nHang sanh su:");
					InTieuDeHSS();
					for(HangHoa item : list) {
						if(item instanceof HangSanhSu)
							System.out.println(item);
					}
					
					System.out.println("\nHang thuc pham:");
					InTieuDeHTP();
					for(HangHoa item : list) {
						if(item instanceof HangThucPham)
							System.out.println(item);
					}
					
					System.out.println("Nhan \"enter\" de tiep tuc");
					sc.nextLine();
					@SuppressWarnings("unused") String enter = sc.nextLine();
					flag = true;
					break;

				case 0:
					System.out.println("Hen gap lai");
					flag = false;
					break;
				}
			}while(flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void checkID(HangHoa hang, List<HangHoa> list) {
		int index = 0;
		String id;
		while(index != -1) {
			do {
				System.out.print("Ma hang: ");
				id = sc.nextLine();
				if(id.replaceAll(" ", "").isEmpty())
					System.out.println("Ma hang khong duoc bo trong. Hay nhap lai");
			}while(id.replaceAll(" ", "").isEmpty());
			HangHoa temp = new HangDienMay(id);
			index = list.indexOf(temp);
			if(index == -1)
				hang.setMahang(id);
			else
				System.out.println("Ma hang da ton tai. Hay nhap lai");
		}
	}
	
	public static void InTieuDeHDM() {
		System.out.printf("%-10s %-10s %15s %10s %15s %15s %15s%n","Ma hang","Ten hang","So luong ton","Don gia","Bao hanh","Cong suat","Danh gia");
	}
	
	public static void InTieuDeHSS() {
		System.out.printf("%-10s %-10s %15s %10s %15s %15s %15s%n","Ma hang","Ten hang","So luong ton","Don gia","Nha san xuat","Ngay nhap","Danh gia");
	}
	
	public static void InTieuDeHTP() {
		System.out.printf("%-10s %-10s %15s %10s %15s %15s %15s %15s%n","Ma hang","Ten hang","So luong ton","Don gia","Nha cung cap","Ngay san xuat","Han su dung","Danh gia");
	}
}
