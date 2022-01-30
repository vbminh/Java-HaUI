import java.time.LocalDate;

public class HangThucPham extends HangHoa{
	private NgayThang ngaysx = new NgayThang();
	private NgayThang hansd = new NgayThang();
	private String nhacc;
	
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HangThucPham(String mahang, String tenhang, int slton, double dongia, String nhacc, NgayThang ngaysx, NgayThang hansd) {
		super(mahang, tenhang, slton, dongia);
		this.nhacc = nhacc;
		this.ngaysx = ngaysx;
		this.hansd = hansd;
	}

	public void input() {
		super.input();
		sc.nextLine();
		System.out.print("Nha cung cap: ");
		nhacc = sc.nextLine();
		System.out.print("Ngay san xuat: ");
		ngaysx.input();
		System.out.print("Han su dung: ");
		do {
			hansd.input();
			if(!checkHSD(ngaysx, hansd))
				System.out.println("HSD phai sau hoac là NSX. Hay nhap lai");
		}while(!checkHSD(ngaysx, hansd));
	}
	
	public boolean checkHSD(NgayThang ng1, NgayThang ng2) {
		if(ng1.getNam() == ng2.getNam()) {
			if(ng1.getThang() == ng2.getThang()) {
				if(ng1.getNgay() <= ng2.getNgay())
					return true;
				else
					return false;
			}
			else if(ng1.getThang() <= ng2.getThang())
				return true;
			else
				return false;
		}
		if(ng1.getNam() <= ng2.getNam())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%15s %15s %15s %15s", nhacc,ngaysx,hansd,DanhGia());
	}

	@Override
	public double VAT() {
		return super.getDongia()*0.05;
	}

	@Override
	public String DanhGia() {
		LocalDate now = LocalDate.now();
		NgayThang today = new NgayThang(now.getDayOfMonth(),now.getMonthValue(),now.getYear());;
		if(super.getSlton() > 0 && !checkHSD(hansd, today))
			return "Kho ban";
		return "";
	}
}
