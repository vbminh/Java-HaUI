package nhom4_thongtinsv;

public class SinhVien {
	private String Ho;
	private String Ten;
	private DiaChi DiaChiNha;
	private DiaChi DiaChiTruong;
	private double Diem01;
	private double Diem02;
	private double Diem03;
	private String TenCN;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String ho, String ten, DiaChi diaChiNha, DiaChi diaChiTruong, double diem01, double diem02,
			double diem03, String tenCN) {
		Ho = ho;
		Ten = ten;
		DiaChiNha = diaChiNha;
		DiaChiTruong = diaChiTruong;
		Diem01 = diem01;
		Diem02 = diem02;
		Diem03 = diem03;
		TenCN = tenCN;
	}
	
	public String getHo() {
		return Ho;
	}

	public void setHo(String ho) {
		Ho = ho;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public DiaChi getDiaChiNha() {
		return DiaChiNha;
	}

	public void setDiaChiNha(DiaChi diaChiNha) {
		DiaChiNha = diaChiNha;
	}

	public DiaChi getDiaChiTruong() {
		return DiaChiTruong;
	}

	public void setDiaChiTruong(DiaChi diaChiTruong) {
		DiaChiTruong = diaChiTruong;
	}

	public String getTenCN() {
		return TenCN;
	}

	public void setTenCN(String tenCN) {
		TenCN = tenCN;
	}

	@Override
	public String toString() {
		return String.format("%5s %7s %15s %13s %7.1f %7.1f %7.1f %7.2f %10s",Ho,Ten,DiaChiNha.toString(),DiaChiTruong.toString(),Diem01,Diem02,Diem03,DiemTB(Diem01, Diem02, Diem03),TenCN);
	}
	
	public void setCotDiem(String LoaiDiem, double value) throws Exception {
		if(value >= 0 && value <= 10) {
			if(LoaiDiem.toLowerCase().equals("diem01"))
				this.Diem01 = value;
			else if(LoaiDiem.toLowerCase().equals("diem02"))
				this.Diem02 = value;
			else if(LoaiDiem.toLowerCase().equals("diem03"))
				this.Diem03 = value;
			else
				throw new Exception("Không có loại điểm này");
		}
		else
			throw new Exception("Điểm phải lớn hơn 0 và nhỏ hơn 10");
	}
	
	public double getCotDiem(String LoaiDiem) {
		if(LoaiDiem.toLowerCase().equals("diem01"))
			return this.Diem01;
		else if(LoaiDiem.toLowerCase().equals("diem02"))
			return this.Diem02;
		else 
			return this.Diem03;
	}
	
	public double DiemTB(double Diem01, double Diem02, double Diem03) {
		return (Diem01 + Diem02 + Diem03) /3;
	}

}
