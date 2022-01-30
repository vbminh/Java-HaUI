
public class HangDienMay extends HangHoa{
	private int baohanh;
	private double congsuat;
	
	public HangDienMay() {
		super();
	}

	public HangDienMay(String mahang) {
		super(mahang);
	}
	
	public HangDienMay(String mahang, String tenhang, int slton, double dongia, int baohanh, int congsuat) {
		super(mahang, tenhang, slton, dongia);
		this.baohanh = baohanh;
		this.congsuat = congsuat;
	}

	public void input() {
		super.input();
		do {
			System.out.print("Thoi gian bao hanh: ");
			baohanh = sc.nextInt();
			if(baohanh < 0)
				System.out.println("Thoi gian bao hanh phai lon hon hoac bang 0. Hay nhap lai");
		}while(baohanh < 0);
		
		do {
			System.out.print("Cong suat: ");
			congsuat = sc.nextDouble();
			if(baohanh < 0)
				System.out.println("Cong suat phai lon hon 0. Hay nhap lai");
		}while(congsuat <= 0);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%15s %15s %15s", congsuat,baohanh,DanhGia());
	}

	@Override
	public String DanhGia() {
		if(super.getSlton() < 3)
			return "Ban duoc";
		return "";
	}

	@Override
	public double VAT() {
		return super.getDongia() * 0.05;
	}
	
}
