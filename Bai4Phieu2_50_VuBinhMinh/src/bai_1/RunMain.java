package bai_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		List<NhanVien> nv = new ArrayList<NhanVien>();
		nv.add(new NhanVien("Vũ Bình","Minh",(new NgayThang(15,3,2001)),(new NgayThang(21,12,2020))));
		nv.add(new NhanVien("Nguyễn Hà","Trang",(new NgayThang(20,12,2000)),(new NgayThang(12,6,2019))));
		nv.add(new NhanVien("Chu Thị","Linh Chi",(new NgayThang(01,04,2001)),(new NgayThang(20,5,2021))));
		
		boolean flag = true;
		try {
			do {
				System.out.println("\t=======Nhân viên========");
				System.out.println("1. Thêm một nhân viên mới \n2. Hiển thị danh sách \n0. Thoát");
				System.out.print("Lựa chọn của bạn: ");
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1:
					System.out.println("Nhập thông tin: ");
					NhanVien newnv = new NhanVien();
					input(newnv);
					nv.add(newnv);
					
					sc.nextLine();
					System.out.println("Nhấn \"enter\" để tiếp tục");
					@SuppressWarnings("unused") String enter = sc.nextLine();
					flag = true;
					break;

				case 2:
					System.out.println("\t=======Danh sách nhân viên========");
					InTieuDe();
					nv.forEach(item -> System.out.println(item));
					
					sc.nextLine();
					System.out.println("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				
				case 0:
					System.out.println("Goodbye!!!");
					flag = false;
					break;
				}
			}while(flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void input(NhanVien nv) throws Exception {
		System.out.print("Họ đệm: ");
		nv.setHoDem(sc.nextLine());
		
		System.out.print("Tên: ");
		nv.setTen(sc.nextLine());
		
		System.out.println("Ngày sinh: ");
		System.out.print("- Ngày: ");
		int ngay = sc.nextInt();
		System.out.print("- Tháng: ");
		int thang = sc.nextInt();
		System.out.print("- Năm: ");
		int nam = sc.nextInt();
		
		nv.setNgaySinh(new NgayThang(ngay,thang,nam));
		
		System.out.println("Ngày vào làm: ");
		System.out.print("- Ngày: ");
		ngay = sc.nextInt();
		System.out.print("- Tháng: ");
		thang = sc.nextInt();
		System.out.print("- Năm: ");
		nam = sc.nextInt();
		
		nv.setNgayVaoLam(new NgayThang(ngay,thang,nam));
	}

	public static void InTieuDe() {
		System.out.println(String.format("%-15s %-10s %15s %15s", "Họ đệm", "Tên", "Ngày Sinh", "Ngày vào làm"));
		System.out.println("----------------------------------------------------------");
	}
}
