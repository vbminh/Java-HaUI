package bai_2;

public class KHNN extends KhachHang{
	private String QuocTich;
	
	public KHNN() {

	}
	
	public KHNN(String MaKH, String HoTen, NgayThang NgayRaHoaDon, double SoLuong, double DonGia, String QuocTich) {
		super(MaKH, HoTen, NgayRaHoaDon, SoLuong, DonGia);
		this.QuocTich = QuocTich;
	}

	public String getQuocTich() {
		return QuocTich;
	}


	public void setQuocTich(String quocTich) {
		QuocTich = quocTich;
	}

	@Override
	public double TongTien() {
		return super.getSoLuong() * super.getDonGia();
	}
	
	@Override
	public String toString() {
		return String.format("%-7s %-10s %10s %13s %15s %15.1f %10.3f %10s %15.2f",
				super.getMaKH(), super.getHoTen(), QuocTich,"-",super.getNgayRaHoaDon().toString(),
				super.getSoLuong(),super.getDonGia(),"-",TongTien());
	}
}
