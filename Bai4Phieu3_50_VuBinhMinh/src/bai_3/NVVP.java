package bai_3;

public class NVVP extends NhanVien{
	private int ngaynghi;
	private double luongcoban;
	
	public NVVP() {
		super();
	}
	
	public NVVP(String manv) {
		super(manv);
	}

	public NVVP(String manv,String hoten, int namvaolam, double luongcoban, int ngaynghi) {
		super(manv,hoten,namvaolam);
		this.ngaynghi = ngaynghi;
		this.luongcoban = luongcoban;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%15s %15s %15s",
				ngaynghi,TinhLuong(),super.getPhucap());
	}

	public int getNgaynghi() {
		return ngaynghi;
	}

	public void setNgaynghi(int ngaynghi) {
		this.ngaynghi = ngaynghi;
	}

	public double getLuongcoban() {
		return luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}

	@Override
	public double TinhLuong() {
		return this.luongcoban - this.ngaynghi*10000;
	}
}
