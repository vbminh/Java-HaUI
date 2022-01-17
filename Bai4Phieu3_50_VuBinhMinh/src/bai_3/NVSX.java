package bai_3;

public class NVSX extends NhanVien{
	private int sanpham;
	
	public NVSX() {
		super();
	}

	public NVSX(String manv,String hoten, int namvaolam, int sanpham) {
		super(manv,hoten, namvaolam);
		this.sanpham = sanpham;
	}
	
	public int getSanpham() {
		return sanpham;
	}

	public void setSanpham(int sanpham) {
		this.sanpham = sanpham;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%15s %15s %15s",
				sanpham,TinhLuong(),super.getPhucap());}

	@Override
	public double TinhLuong() {
		return this.sanpham * 10000;
	}
}
