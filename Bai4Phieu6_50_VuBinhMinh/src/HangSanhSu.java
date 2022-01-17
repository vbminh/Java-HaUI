
public class HangSanhSu extends HangHoa{
	private String nhasx;
	private NgayThang ngaynhap;
	
	public void input() {
		super.input();
		sc.nextLine();
		do {
			System.out.print("Nhà sản xuất: ");
			nhasx = sc.nextLine();
			if(nhasx.replaceAll(" ", "").isEmpty())
				System.out.println("Tên nhà sx không được bỏ trống. Hãy nhập lại");
		}while(nhasx.replaceAll(" ", "").isEmpty());
		
		System.out.print("Ngày nhập kho: ");
		ngaynhap.input();
	}

	@Override
	public double VAT() {
		return super.getDongia() * 0.1;
	}

	@Override
	public String DanhGia() {
		return null;
	}

}
