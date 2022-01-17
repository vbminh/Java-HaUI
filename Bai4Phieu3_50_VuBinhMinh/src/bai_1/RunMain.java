package bai_1;

public class RunMain {

	public static void main(String[] args) {
		HinhPhang hv = new HinhVuong(Math.random()*10 + 1);
		HinhPhang ht = new HinhTron(Math.random()*10 + 1);
		HinhChuNhat hcn = new HinhChuNhat(Math.random()*10 + 1, Math.random()*10 + 1);
		
		InTieuDe();
		System.out.println(hv + "\n" + ht + "\n" + hcn);
	}
	
	public static void InTieuDe() {
		System.out.println(String.format("%10s %10s %10s %10s %10s", "Chiều dài", "Chiều rộng", "Bán kinh","Chu vi","Diện tích"));
		System.out.println("-------------------------------------------------------");
	}
}
