package nhom4_thongtinsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vũ Bình Minh
 *	Trần Văn Thái
 *	Đặng Thanh Tùng
 *	Trần Nhật Hoàng
 *	Lê Văn Trung
 */

public class XuatSinhVien {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		List<SinhVien> sv = new ArrayList<SinhVien>();
		sv.add(new SinhVien("Vũ", "Minh", new DiaChi("HBT", "BD", "HN", 29), new DiaChi("PDP", "BD", "HN", 29), 9,8, 8, "Nguyễn A"));
		sv.add(new SinhVien("Trần", "Thái", new DiaChi("HAV", "ND", "HD", 45), new DiaChi("NHM", "ND", "HD", 45), 9, 8, 9, "Phạm C"));
		sv.add(new SinhVien("Trần", "Hoàng", new DiaChi("YUN", "TD", "TN", 22), new DiaChi("AVC", "TD", "TN", 22), 8 ,7, 10, "Hoàng B"));
		sv.add(new SinhVien("Đặng", "Tùng", new DiaChi("TRT", "DD", "BN", 31), new DiaChi("GFD", "DD", "BN", 31), 9, 9, 9, "Nguyễn D"));
		sv.add(new SinhVien("Lê", "Trung", new DiaChi("RRT", "AV", "FN", 9), new DiaChi("KJH", "ND", "GN", 96), 9, 9, 9, "A B C D"));

		int choice;
		boolean flag = true;
		try {
			do {
				System.out.println("\t\t====Thông tin sinh viên====");
				System.out.println("1. Thêm sinh viên \n2. Hiển thị danh sách sinh viên"
						+ "\n3. Hiển thị sinh viên có điểm trung bình cao nhất \n0. Thoát");
				
				do {
					System.out.print("Lựa chọn của bạn: ");
					choice = sc.nextInt();
					if(choice < 0 || choice > 3)
						System.out.println("Không có lựa chọn này. Hãy chọn lại");
				}while(choice < 0 || choice > 3);
				
				@SuppressWarnings("unused")
				String enter;
				sc.nextLine();
				
				switch (choice) {
				case 1:
					System.out.println("Nhập thông tin sinh viên: ");
					SinhVien newSV = new SinhVien();
					input(newSV);
					sv.add(newSV);
					
					System.out.println("\nNhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
					
				case 2:
					System.out.println("\t\t======Danh sách sinh viên======");
					InTieuDe();
					sv.forEach(item -> System.out.println(item +""));
					
					System.out.println("\nNhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
					
				case 3:
					System.out.println("\t======Sinh viên có điểm trung bình cao nhất======");
					double max = Double.MIN_VALUE;
					for(SinhVien item : sv) {
						if(item.DiemTB(item.getCotDiem("Diem01"), item.getCotDiem("Diem02"), item.getCotDiem("Diem03")) > max)
							max = item.DiemTB(item.getCotDiem("Diem01"), item.getCotDiem("Diem02"), item.getCotDiem("Diem03"));
					}
					
					InTieuDe();
					for(SinhVien item : sv) {
						if(item.DiemTB(item.getCotDiem("Diem01"), item.getCotDiem("Diem02"), item.getCotDiem("Diem03")) == max)
							System.out.println(item +"");
					}
					System.out.println("\nNhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
					
				case 0:
					System.out.print("Hẹn gặp lại");
					flag = false;
					break;
				}
			}while(flag);
			sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void input(SinhVien newSV) throws Exception {
		System.out.print("Họ: ");
		newSV.setHo(sc.nextLine());
		
		System.out.print("Tên: ");
		newSV.setTen(sc.nextLine());
		
		System.out.println("Địa chỉ nhà: ");
		System.out.print("- Đường: ");
		String Duong = sc.nextLine();
		System.out.print("- Quận: ");
		String Quan = sc.nextLine();
		System.out.print("- Thành phố: ");
		String ThanhPho = sc.nextLine();
		System.out.print("- Mã vùng: ");
		long MaVung = sc.nextLong();
		
		newSV.setDiaChiNha(new DiaChi(Duong, Quan, ThanhPho, MaVung));
		
		sc.nextLine();
		System.out.println("Địa chỉ trường: ");
		System.out.print("- Đường: ");
		Duong = sc.nextLine();
		System.out.print("- Quận: ");
		Quan = sc.nextLine();
		System.out.print("- Thành phố: ");
		ThanhPho = sc.nextLine();
		System.out.print("- Mã vùng: ");
		MaVung = sc.nextLong();
		
		newSV.setDiaChiTruong(new DiaChi(Duong, Quan, ThanhPho, MaVung));
		
		System.out.print("Điểm 1:");
		newSV.setCotDiem("Diem01", sc.nextDouble());
		System.out.print("Điểm 2:");
		newSV.setCotDiem("Diem02", sc.nextDouble());;
		System.out.print("Điểm 3:");
		newSV.setCotDiem("Diem03", sc.nextDouble());
		
		sc.nextLine();
		System.out.print("GVCN: ");
		newSV.setTenCN(sc.nextLine());
	}

	public static void InTieuDe() {
		System.out.println(String.format("%5s %7s %13s %15s %7s %7s %7s %7s %10s", 
				"Họ","Tên","Địa chỉ nhà","Địa chỉ trường","Điểm 1","Điểm 2", "Điểm 3", "Điểm TB", "GVCN"));
		System.out.println("\s-------------------------------------------------------------------------------------");
	}
}
