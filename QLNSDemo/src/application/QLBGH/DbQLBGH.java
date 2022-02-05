package application.QLBGH;

public class DbQLBGH {
	private String manv, hoten, gioitinh, ngaysinh, diachi;
	private String dienthoai, email, ngayvaolam, chucdanh, chucvu, ghichu;
	private double luongcoban;
	
	public DbQLBGH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DbQLBGH(String manv, String hoten, String gioitinh, String ngaysinh, String diachi, String dienthoai,
			String email, String ngayvaolam, String chucdanh, String chucvu, String ghichu, double luongcoban) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.dienthoai = dienthoai;
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

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
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
