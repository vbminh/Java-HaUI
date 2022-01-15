package bai_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<QuanLyXe> qlx = new ArrayList<QuanLyXe>();
		qlx.add(new QuanLyXe("Nguyễn Thu Loan","Future Neo",100,35000000));
		qlx.add(new QuanLyXe("Lê Minh Tính","Ford Ranger",3500,250000000));
		qlx.add(new QuanLyXe("Nguyễn Minh Triết","Landscape",1500,1000000000));
		
		boolean flag = true;
		try {
			do {
				System.out.println("\t============Quản lý xe===========");
				System.out.println("1. Thêm \n2. Xuất bản kê khai \n0. Thoát");
				System.out.print("Lựa chọn của bạn: ");
				int choice = sc.nextInt();
				sc.nextLine();
				@SuppressWarnings("unused")
				String enter;
				
				switch (choice) {
				case 1:
					System.out.println("Nhập thông tin:");
					QuanLyXe xe = new QuanLyXe();
					input(xe);
					qlx.add(xe);
					
					sc.nextLine();
					System.out.println("\nNhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;

				case 2:
					System.out.println("\t\t==========Danh sánh xe=========");
					InTieuDe();
					qlx.forEach(item -> System.out.println(item + ""));
					
					System.out.println("\nNhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				
				case 0:
					System.out.println("Hẹn gặp lại");
					flag= false;
					break;
				}
				
			}while(flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void InTieuDe() {
		System.out.println(String.format("%20s %15s %15s %15s %15s","Tên chủ xe","Loại xe","Dung tích","Trị giá","Thuế phải nộp"));
		System.out.println("\s--------------------------------------------------------------------------------------");
	}
	
	public static void input(QuanLyXe xe) {
		System.out.print("Tên chủ xe: ");
		xe.setTenChuXe(sc.nextLine());
		System.out.print("Loại xe: ");
		xe.setLoaiXe(sc.nextLine());
		System.out.print("Dung tích: ");
		xe.setDungTich(sc.nextInt());
		System.out.print("Trị giá: ");
		xe.setTriGia(sc.nextDouble());
	}

}
