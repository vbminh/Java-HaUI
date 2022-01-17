package bai_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<NhanVien> list = new ArrayList<NhanVien>();
		list.add(new NVVP("NV01","Parkse", 2010, 3500000, 3));
		list.add(new NVSX("NV02","Namu", 2015, 300));
		list.add(new NVVP("NV03","Kisun", 2018, 5000000, 0));
		list.add(new NVSX("NV04","Moina", 2011, 250));
		list.add(new NVVP("NV05","Pean", 2021, 4200000, 5));
		
		boolean flag = true;
		try {
			do {
				System.out.println("\t========Quản lý nhân viên========");
				System.out.println("1. Thêm một nhân viên mới \n2. Hiển thị danh sách nhân viên \n3. Lương cao nhất của từng loại nv \n0. Thoát");
				System.out.print("Lựa chọn của bạn: ");
				int choice = sc.nextInt();
				sc.nextLine();
				
				switch (choice) {
				case 1:
					System.out.println("Loại nhân viên: \n1. Nhân viên sản xuất \n2. Nhân viên văn phòng \n0. Quay lại");
					System.out.print("Bạn chọn: ");
					switch (sc.nextInt()) {
					case 1:
						sc.nextLine();
						System.out.println("Nhập thông tin: ");
						NVSX nvsx = new NVSX();
						input(nvsx, list);
						int sp;
						do {
							System.out.print("Nhập số lượng sản phẩm: ");
							sp = sc.nextInt();
							if(sp <= 0)
								System.out.println("Số lượng sản phẩm phải lớn hơn 0. Hãy nhập lại");
							else
								nvsx.setSanpham(sp);
						}while(sp <= 0);
						
						list.add(nvsx);
						System.out.println("--Thêm thành công--");
						break;

					case 2:
						sc.nextLine();
						System.out.println("Nhập thông tin: ");
						NVVP nvvp = new NVVP();
						input(nvvp, list);
						int luongcb;
						do {
							System.out.print("Nhập lương cơ bản: ");
							luongcb = sc.nextInt();
							if(luongcb < 0)
								System.out.println("Lương cơ bản phải lớn hơn 0. Hãy nhập lại");
							else
								nvvp.setLuongcoban(luongcb);
						}while(luongcb < 0);
						
						int nn;
						do {
							System.out.print("Nhập số ngày nghỉ: ");
							nn = sc.nextInt();
							if(nn < 0 || nn > 5)
								System.out.println("Ngày nghỉ phải lớn hơn 0 và nhỏ hơn 5. Hãy nhập lại");
							else
								nvvp.setNgaynghi(nn);
						}while(nn < 0 || nn > 5);
						
						list.add(nvvp);
						System.out.println("--Thêm thành công--");
						break;
						
					case 0:
						break;
					}
					flag = true;
					break;

				case 2:
					System.out.println("\t\t=====Danh sách nhân viên======");
					System.out.println("Nhân viên sản xuất: ");
					InTieuDeNVSX();
					for(NhanVien item : list) {
						if(item instanceof NVSX)
							System.out.println(item);
					}
					System.out.println("Nhân viên văn phòng: ");
					InTieuDeNVVP();
					for(NhanVien item : list) {
						if(item instanceof NVVP)
							System.out.println(item);
					}
					
					System.out.println("Nhấn \"enter\" để tiếp tục");
					@SuppressWarnings("unused") String enter = sc.nextLine();
					flag = true;
					break;
					
				case 3:
					double maxNVSX = Double.MIN_VALUE;
					double maxNVVP = Double.MIN_VALUE;
					
					for(NhanVien item : list) {
						if(item instanceof NVSX)
							if(item.TinhLuong() > maxNVSX) maxNVSX = item.TinhLuong();
					}
					
					for(NhanVien item : list) {
						if(item instanceof NVVP)
							if(item.TinhLuong() > maxNVVP) maxNVVP = item.TinhLuong();
					}
					System.out.println("Lương cao nhất của NVSX là: ");
					InTieuDeNVSX();
					for(NhanVien item : list) {
						if(item instanceof NVSX)
							if(item.TinhLuong() == maxNVSX) 
								System.out.println(item);
					}
					System.out.println("Lương cao nhất của NVSX là: ");
					InTieuDeNVSX();
					for(NhanVien item : list) {
						if(item instanceof NVVP)
							if(item.TinhLuong() == maxNVVP) 
								System.out.println(item);
					}
					
					System.out.println("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
					
				case 0:
					System.out.println("Hẹn gặp lại.");
					flag = false;
					break;
				default:
					break;
				}
			}while(flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void input(NhanVien nv, List<NhanVien> list) {
		int index;
		do {
			System.out.print("Mã nv: ");
			String manv = sc.nextLine();
			NVVP newnv = new NVVP(manv);
			index = list.indexOf(newnv);
			
			if(index == -1)
				nv.setManv(manv);
			else
				System.out.println("Mã nv này đã tồn tại. Hãy nhập lại");
		}while(index != -1);
		
		System.out.print("Họ tên: ");
		nv.setHoten(sc.nextLine());
		
		int year;
		int now = LocalDate.now().getYear();
		do {
			System.out.print("Năm vào làm: ");
			year = sc.nextInt();
			if(year > 0 && year <= now)
				nv.setNamvaolam(now);
			else
				System.out.println("Năm vào làm không hợp lệ. Hãy nhập lại");
		}while(year < 0 || year > now);
	}
	
	public static void InTieuDeNVSX() {
		System.out.printf("%-10s %-10s %15s %15s %15s %15s%n","Mã nv","Họ tên","Năm vào làm","Số sản phẩm","Lương","Phụ cấp");
	}

	public static void InTieuDeNVVP() {
		System.out.printf("%-10s %-10s %15s %15s %15s %15s%n","Mã nv","Họ tên","Năm vào làm","Số ngày nghỉ","Lương","Phụ cấp");
	}
}
