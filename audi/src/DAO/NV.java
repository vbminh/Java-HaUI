package DAO;

public class NV {
	private String manv, hoten, gtinh, ngsinh, diachi, sdt, email;
	private String ngayvaolam, chucdanh, chucvu, ghichu;
	private double luongcoban;
	
	public NV() {
		super();
	}

	public NV(String manv, String hoten, String gtinh, String ngsinh, String diachi, String sdt, String email,
			String ngayvaolam, String chucdanh, String chucvu, String ghichu, double luongcoban) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.gtinh = gtinh;
		this.ngsinh = ngsinh;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.ngayvaolam = ngayvaolam;
		this.chucdanh = chucdanh;
		this.chucvu = chucvu;
		this.ghichu = ghichu;
		this.luongcoban = luongcoban;
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getGtinh() {
		return gtinh;
	}

	public void setGtinh(String gtinh) {
		this.gtinh = gtinh;
	}

	public String getNgsinh() {
		return ngsinh;
	}

	public void setNgsinh(String ngsinh) {
		this.ngsinh = ngsinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNgayvaolam() {
		return ngayvaolam;
	}

	public void setNgayvaolam(String ngayvaolam) {
		this.ngayvaolam = ngayvaolam;
	}

	public String getChucdanh() {
		return chucdanh;
	}

	public void setChucdanh(String chucdanh) {
		this.chucdanh = chucdanh;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public double getLuongcoban() {
		return luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
	
	
	
}
