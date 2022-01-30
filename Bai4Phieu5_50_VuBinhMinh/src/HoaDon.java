import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HoaDon {
	private String mahd, ngayhd;
	private KhachHang kh = new KhachHang();
	private List<Hang> hang = new ArrayList<Hang>();
	private double tongtien;
	
	public HoaDon() {
	}
	
	public HoaDon(String mahd, String ngayhd, KhachHang kh, List<Hang> hang) {
		this.mahd = mahd;
		this.ngayhd = ngayhd;
		this.kh = kh;
		this.hang = hang;
	}
	
	public Scanner sc = new Scanner(System.in);

	public void inputHD(HoaDon hd) {
		System.out.print("Ma hoa don: ");
		mahd = sc.nextLine();
		System.out.print("Ngay ban: ");
		ngayhd = sc.nextLine();
		kh.input();
		System.out.print("Nhap so luong hang: ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			System.out.println("Nhap thong tin hang thu " + (i + 1));
			Hang temp = new Hang();
			temp.input();
			hang.add(temp);
		}
	}
	
	public void outputHD() {
		System.out.printf("\t%-30s %-30s%n","Ma HD: " + mahd,"Ngay ban: " + ngayhd);
		System.out.println(kh);
		InTieuDe();
		double tien = 0;
		int slg = 0;
		for(Hang item : hang) {
			System.out.println(item);
			tien += item.ThanhTien();
			slg += item.getSoluong();
		}
		System.out.printf("%-15s %-15s %-15s %-15.1f%n","Tong tien","",slg,tien);
	}
	
	public void Sapxep() {
		Collections.sort(hang, (Hang o1,Hang o2) -> {
			if(o1.equals(o2))
				return o1.ThanhTien() > o2.ThanhTien()? 1 : -1;
			return o1.getTenhang().compareTo(o2.getTenhang()) > 1? 1 : -1;
		});
		
		outputHD();
	}

	public void InTieuDe() {
		System.out.printf("%-15s %-15s %-15s %-15s%n","Ten hang","Don gia","So luong","Thanh tien");
		System.out.println("----------------------------------------------------------");
	}
	
	public double TongTien() {
		for(Hang item : hang) {
			tongtien += item.ThanhTien();
		}
		return tongtien;
	}
}
