package bai_4;

public class QuanLyXe {
	private String TenChuXe;
	private String LoaiXe;
	private int DungTich;
	private double TriGia;
	
	public QuanLyXe() {
		
	}

	public QuanLyXe(String TenChuXe, String LoaiXe, int DungTich, double TriGia) {
		this.TenChuXe = TenChuXe;
		this.LoaiXe = LoaiXe;
		this.DungTich = DungTich;
		this.TriGia = TriGia;
	}

	public String getTenChuXe() {
		return TenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		TenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return LoaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		LoaiXe = loaiXe;
	}

	public int getDungTich() {
		return DungTich;
	}

	public void setDungTich(int dungTich) {
		DungTich = dungTich;
	}

	public double getTriGia() {
		return TriGia;
	}

	public void setTriGia(double triGia) {
		TriGia = triGia;
	}
	
	public double Thue() {
		if(DungTich < 100) return TriGia*0.01;
		else if(DungTich < 200) return TriGia*0.03;
		else return TriGia*0.05;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%20s %15s %15s %15.2f %15.2f",TenChuXe,LoaiXe,DungTich,TriGia,Thue());
	}

}
