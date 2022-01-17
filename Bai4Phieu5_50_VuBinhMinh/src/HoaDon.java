import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HoaDon {
	private String mahd, ngayhd;
	private KhachHang kh = new KhachHang();
	//private Hang[] hang;
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
		System.out.print("Mã hóa đơn: ");
		mahd = sc.nextLine();
		System.out.print("Ngày bán: ");
		ngayhd = sc.nextLine();
		kh.input();
		System.out.print("Nhập số lượng hàng: ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			System.out.println("Nhập thông tin hàng thứ " + (i + 1));
			Hang temp = new Hang();
			temp.input();
			hang.add(temp);
		}
		/*hang = new Hang[num];
		for(int i = 0; i < num; i++) {
			System.out.println("Nhập thông tin hàng thứ " + (i + 1));
			hang[i] = new Hang();
			hang[i].input();
		}*/
	}
	
	public void outputHD() {
		System.out.printf("\t%-30s %-30s%n","Mã HD: " + mahd,"Ngày bán: " + ngayhd);
		System.out.println(kh);
		InTieuDe();
		//hang.forEach(item -> System.out.println(item));
		for(Hang item : hang) {
			System.out.println(item);
		}
	}
	
	public void Sapxep() {
		Collections.sort(hang, (Hang o1,Hang o2) -> {
			if(o1.equals(o2))
				return o1.ThanhTien() > o2.ThanhTien()? 1 : -1;
			return o1.getTenhang().compareTo(o2.getTenhang()) > 1? 1 : -1;
		});
		/*for(int i = 0; i < hang.length; i++) {
			for(int j = i + 1; j < hang.length; j++) {
				if(hang[i].getTenhang().compareTo(hang[j].getTenhang()) == 0) {
					if(hang[i].ThanhTien() > hang[j].ThanhTien()) {
						Hang temp = hang[i];
						hang[i] = hang[j];
						hang[j] = temp;
					}
				}
				if(hang[i].getTenhang().compareTo(hang[j].getTenhang()) > 0) {
					Hang temp = hang[i];
					hang[i] = hang[j];
					hang[j] = temp;
				}
			}
		}*/
		outputHD();
	}

	public void InTieuDe() {
		System.out.printf("%-15s %-15s %-15s %-15s%n","Tên hàng","Đơn giá","Số lượng","Thành tiền");
	}
	
	public double TongTien() {
		for(Hang item : hang) {
			tongtien += item.ThanhTien();
		}
		return tongtien;
	}
}
