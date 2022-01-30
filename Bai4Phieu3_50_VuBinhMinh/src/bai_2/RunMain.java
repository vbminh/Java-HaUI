package bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	public static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) throws Exception {
		List<KhachHang> kh = new ArrayList<KhachHang>();
		kh.add(new KHNN("KH01", "John Smith",(new NgayThang(28,9,2013)), 70.5, 1.675, "USA"));
		kh.add(new KHVN("KH02", "Lò Văn A", (new NgayThang(01,01,2019)), 100, 1.234, "Sinh hoạt"));
		kh.add(new KHNN("KH03", "Sir Alex",(new NgayThang(21,3,2021)), 50, 1.437, "England"));
		kh.add(new KHVN("KH04", "Tạ Thị B", (new NgayThang(13,9,2013)), 300, 1.234, "Sản xuất"));

		boolean flag = true;
		try {
			do {
				System.out.println("\t========Quản lý tiền điện========");
				System.out.println("1. Thêm một khách hàng \n2. Xuất danh sách khách hàng \n3. Thoát");
				System.out.print("Lựa chọn của bạn: ");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.println("\nLoại khách hàng: \n1. Khách hàng Việt Nam \n2. Khách hàng nước ngoài \n0. Quay lại");
					System.out.print("Bạn chọn: ");
					int choice1 = sc.nextInt();
					sc.nextLine();
					switch (choice1) {
					case 1:
						System.out.println("Nhập thông tin: ");
						KHVN khvn = new KHVN();
						input(khvn, kh);
						sc.nextLine();
						System.out.print("Đối tượng(Sinh hoạt,Kinh doanh,Sản xuất): ");
						khvn.setDoiTuong(sc.nextLine());
						kh.add(khvn);
						
						System.out.println("---Thêm thành công---\n");
						break;

					case 2:
						System.out.println("Nhập thông tin: ");
						KHNN khnn = new KHNN();
						input(khnn, kh);
						sc.nextLine();
						System.out.print("Quốc tịch: ");
						khnn.setQuocTich(sc.nextLine());
						kh.add(khnn);
						
						System.out.println("---Thêm thành công---\n");
						break;
						
					case 0: 
						break;
					}
					flag = true;
					break;

				case 2:
					System.out.println("\t\t=========Danh sách khách hàng=========");
					InTieuDe();
					kh.forEach(item -> System.out.println(item));
					
					int count = 0;
					double 	sum = 0;
					for(KhachHang item : kh) {
						if(item.getClass().getName().equals("bai_2.KHVN")) {
							count++;
							sum += item.TongTien();
						}
					}
					System.out.println("\nSố khách hàng VN là: " + (kh.size() - count));
					System.out.println("Số khách hàng nước ngoài là: " + count);
					
					System.out.println(String.format("Trung bình thành tiền của các khách nước ngoài là: %.2f", sum/count));
					
					System.out.println("\n\t\t=========Danh sách khách hàng trong tháng 9/2013=========");
					InTieuDe();
					for(KhachHang item : kh) {
						if(item.getNgayRaHoaDon().getThang() == 9 && item.getNgayRaHoaDon().getNam() == 2013)
							System.out.println(item);
					}
					System.out.println("Nhấn \"enter\" để tiếp tục");
					@SuppressWarnings("unused") String enter = sc.nextLine();
					flag = true;
					break;
					
				case 0:
					System.out.println("Hẹn gặp lại");
					flag = false;
					break;
				}
			}while(flag);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void input(KhachHang kh, List<KhachHang> list) throws Exception {
		int index, ngay, thang, nam;
		do {
			System.out.print("Mã KH: ");
			String makh = sc.nextLine();
			KhachHang temp = new KHVN(makh);
			index = list.indexOf(temp);
			
			if(index == -1) {
				kh.setMaKH(makh);
			}
			else
				System.out.println("Mã KH đã tồn tại. Hãy nhập lại");
		}while(index != -1);
		
		System.out.print("Họ tên: ");
		kh.setHoTen(sc.nextLine());
		System.out.println("Ngày xuất hóa đơn:");
		System.out.print("Ngày: ");
		ngay = sc.nextInt();
		System.out.print("Tháng: ");
		thang = sc.nextInt();
		System.out.print("Năm: ");
		nam = sc.nextInt();
		
		kh.setNgayRaHoaDon(new NgayThang(ngay,thang,nam));
		System.out.print("Số lượng(kWh): ");
		kh.setSoLuong(sc.nextDouble());
		System.out.print("Đơn giá: ");
		kh.setDonGia(sc.nextDouble());
	}
	
	public static void InTieuDe() {
		System.out.println(String.format("%-7s %-10s %10s %13s %15s %15s %10s %10s %15s","Mã KH","Họ tên",
				"Quốc tịch","ĐTKH","Ngày xuất HD","Số lượng(kWh)","Đơn giá","Định mức","Thành Tiền"));
		System.out.println("-------------------------------------------------------------------"
				+ "-----------------------------------------------");
	}
	
}
