
public class HangDienMay extends HangHoa{
	private int baohanh;
	private double congsuat;
	
	public void input() {
		super.input();
		do {
			System.out.print("Thời gian bảo hành: ");
			baohanh = sc.nextInt();
			if(baohanh < 0)
				System.out.println("Thời gian bảo hành phải lớn hơn hoặc bằng 0. Hãy nhập lại");
		}while(baohanh < 0);
		
		do {
			System.out.print("Công suất: ");
			congsuat = sc.nextDouble();
			if(baohanh < 0)
				System.out.println("Công suất phải lớn hơn 0. Hãy nhập lại");
		}while(congsuat <= 0);
		
	}

	@Override
	public String DanhGia() {
		if(super.getSlton() < 0)
			return "Bán được";
		return null;
	}

	@Override
	public double VAT() {
		return super.getDongia() * 0.05;
	}
	
}
