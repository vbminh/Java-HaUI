package nhom4_thongtinsv;

public class DiaChi {
	private String Duong;
	private String Quan;
	private String ThanhPho;
	private long MaVung;
	
	public String getDuong() {
		return Duong;
	}
	public void setDuong(String duong) {
		Duong = duong;
	}
	public String getQuan() {
		return Quan;
	}
	public void setQuan(String quan) {
		Quan = quan;
	}
	public String getThanhPho() {
		return ThanhPho;
	}
	public void setThanhPho(String thanhPho) {
		ThanhPho = thanhPho;
	}
	public long getMaVung() {
		return MaVung;
	}
	public void setMaVung(long maVung) {
		MaVung = maVung;
	}
	
	public DiaChi(String Duong, String Quan, String ThanhPho, long MaVung) {
		this.Duong = Duong;
		this.Quan = Quan;
		this.ThanhPho = ThanhPho;
		this.MaVung = MaVung;
	}
	@Override
	public String toString() {
		return String.format("%s-%s-%s:%s ",Duong,Quan,ThanhPho,MaVung);
	}
}
