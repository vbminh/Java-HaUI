package stt_50_VuBinhMinh;

import java.util.Scanner;

public class KhachHang {
	private String tenkh, diachi;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String tenkh, String diachi) {
		this.tenkh = tenkh;
		this.diachi = diachi;
	}
	
	public Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.print("Ten khach hang: ");
		tenkh = sc.nextLine();
		System.out.print("Dia chi: ");
		diachi = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return String.format("\t%-30s %-30s","Khach hang: " + tenkh,"Dia chi: " + diachi);
	}
	
}
