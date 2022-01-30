package stt_50_VuBinhMinh;

import java.util.Scanner;

public class Hang {
	private String tenhang;
	private double dongia;
	private int soluong;
	
	public Hang() {
		
	}
	
	public Hang(String tenhang, double dongia, int soluong) {
		this.tenhang = tenhang;
		this.dongia = dongia;
		this.soluong = soluong;
	}
	
	public int getSoluong() {
		return soluong;
	}
	
	public String getTenhang() {
		return tenhang;
	}

	public double ThanhTien() {
		return dongia * soluong;
	}

	public Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.print("Ten hang: ");
		tenhang = sc.nextLine();
		System.out.print("Don gia: ");
		dongia = sc.nextDouble();
		System.out.print("So luong: ");
		soluong = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15.1f %-15s %-15.1f", tenhang,dongia,soluong,ThanhTien());
	}
	
	@Override
	public boolean equals(Object obj) {
		Hang h = (Hang)obj;
		return this.tenhang.toLowerCase().equals(h.tenhang.toLowerCase());
	}
}
