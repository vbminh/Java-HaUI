
public class HangSanhSu extends HangHoa{
	private String nhasx;
	private NgayThang ngaynhap = new NgayThang();
	
	public HangSanhSu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HangSanhSu(String mahang, String tenhang, int slton, double dongia,String nhasx, NgayThang ngaynhap) {
		super(mahang, tenhang, slton, dongia);
		this.nhasx = nhasx;
		this.ngaynhap = ngaynhap;
	}

	public void input() {
		super.input();
		sc.nextLine();
		do {
			System.out.print("Nha san xuat: ");
			nhasx = sc.nextLine();
			if(nhasx.replaceAll(" ", "").isEmpty())
				System.out.println("Ten nha sx khong duoc bo trong. Hay nhap lai");
		}while(nhasx.replaceAll(" ", "").isEmpty());
		
		System.out.print("Ngay nhap kho: ");
		ngaynhap.input();
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%15s %15s %15s", nhasx,ngaynhap,DanhGia());
	}

	@Override
	public double VAT() {
		return super.getDongia() * 0.1;
	}

	@Override
	public String DanhGia() {
		if(super.getSlton() > 50 && ngaynhap.checkDate() > 10)
			return "Ban cham";
		return "";
	}

}
