package bai_1;

public class NhanVien {
	private String HoDem;
	private String Ten;
	private NgayThang NgaySinh;
	private NgayThang NgayVaoLam;
	
	public NhanVien() {
	}

	public NhanVien(String hoDem, String ten, NgayThang ngaySinh, NgayThang ngayVaoLam) {
		HoDem = hoDem;
		Ten = ten;
		NgaySinh = ngaySinh;
		NgayVaoLam = ngayVaoLam;
	}

	public String getHoDem() {
		return HoDem;
	}

	public void setHoDem(String hoDem) {
		HoDem = hoDem;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public NgayThang getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(NgayThang ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public NgayThang getNgayVaoLam() {
		return NgayVaoLam;
	}

	public void setNgayVaoLam(NgayThang ngayVaoLam) {
		NgayVaoLam = ngayVaoLam;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-15s %-10s %15s %15s",HoDem,Ten,NgaySinh.toString(),NgayVaoLam.toString());
	}
}
