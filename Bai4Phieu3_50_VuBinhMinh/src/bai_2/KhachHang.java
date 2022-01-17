package bai_2;

public abstract class KhachHang {
	private String MaKH;
	private String HoTen;
	private NgayThang NgayRaHoaDon;
	private double SoLuong;
	private double DonGia;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String MaKH) {
		this.MaKH = MaKH;
	}
	
	
	public KhachHang(String MaKH, String HoTen, NgayThang NgayRaHoaDon, double SoLuong, double DonGia) {
		this.MaKH = MaKH;
		this.HoTen = HoTen;
		this.NgayRaHoaDon = NgayRaHoaDon;
		this.SoLuong = SoLuong;
		this.DonGia = DonGia;
	}
	
	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public NgayThang getNgayRaHoaDon() {
		return NgayRaHoaDon;
	}

	public void setNgayRaHoaDon(NgayThang ngayRaHoaDon) {
		NgayRaHoaDon = ngayRaHoaDon;
	}

	public double getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(double soLuong) {
		SoLuong = soLuong;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public abstract double TongTien();
	
	@Override
	public boolean equals(Object obj) {
		KhachHang kh = (KhachHang)obj;
		return this.MaKH.toLowerCase().equals(kh.MaKH.toLowerCase());
	}
}
