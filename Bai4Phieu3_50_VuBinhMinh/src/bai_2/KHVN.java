package bai_2;

public class KHVN extends KhachHang {
	private String DoiTuong;
	private int DinhMuc;
	
	public KHVN() {
	}
	
	public KHVN(String MaKH) {
		super(MaKH);
	}

	public KHVN(String MaKH, String HoTen, NgayThang NgayRaHoaDon, double SoLuong, double DonGia, String DoiTuong) {
		super(MaKH,HoTen,NgayRaHoaDon,SoLuong,DonGia);
		this.DoiTuong = DoiTuong;
	}

	public String getDoiTuong() {
		return DoiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		DoiTuong = doiTuong;
	}

	public int getDinhMuc() {
		if(DoiTuong.toLowerCase().equals("sinh hoạt"))
			return 50;
		else if(DoiTuong.toLowerCase().equals("kinh doanh"))
			return 150;
		else if(DoiTuong.toLowerCase().equals("sản xuất"))
			return 200;
		return DinhMuc;
	}

	public void setDinhMuc(int dinhMuc) throws Exception {
		if(DoiTuong.toLowerCase().equals("sinh hoạt"))
			DinhMuc = 50;
		else if(DoiTuong.toLowerCase().equals("kinh doanh"))
			DinhMuc = 150;
		else if(DoiTuong.toLowerCase().equals("sản xuất"))
			DinhMuc = 200;
		else throw new Exception("Không có đối tượng khách hàng này");
	}

	@Override
	public double TongTien() {
		if(super.getSoLuong() < DinhMuc)
			return super.getSoLuong() * super.getDonGia();
		return super.getDonGia() * DinhMuc + (super.getSoLuong() - DinhMuc) * super.getDonGia() * 2.5;
	}
	
	@Override
	public String toString() {
		return String.format("%-7s %-10s %10s %13s %15s %15.1f %10.3f %10s %15.2f",
				super.getMaKH(), super.getHoTen(), "Việt Nam",DoiTuong,super.getNgayRaHoaDon(),
				super.getSoLuong(),super.getDonGia(),getDinhMuc(),TongTien());
	}
}
