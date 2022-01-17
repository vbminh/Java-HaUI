package bai_3;

import java.time.LocalDate;

public abstract class NhanVien {
	private String manv;
	private String hoten;
	private int namvaolam;
	private final int phucap = 100000;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String manv) {
		this.manv = manv;
	}

	public NhanVien(String manv, String hoten, int namvaolam) {
		this.manv = manv;
		this.hoten = hoten;
		this.namvaolam = namvaolam;
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

	public int getNamvaolam() {
		return namvaolam;
	}

	public void setNamvaolam(int namvaolam) {
		this.namvaolam = namvaolam;
	}

	public abstract double TinhLuong(); 

	public int getPhucap() {
		int year = LocalDate.now().getYear();
		return this.phucap + (year - this.namvaolam) * 20000;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %15s", manv,hoten,namvaolam);
	}
	@Override
	public boolean equals(Object obj) {
		NhanVien nv = (NhanVien)obj;
		return this.manv.toLowerCase().equals(nv.manv.toLowerCase());
	}
}
