package Bai_1;

public class RunMain {

	public static void InTieuDe() {
		}
	
	public static void main(String[] args) {
		HCN hcn1 = new HCN((Math.random()*10 + 1),(Math.random()*10 + 1));
		System.out.println(String.format("%10s %12s %10s %12s", "Chiều dài", "Chiều rộng", "Chu vi", "Diện tích"));
		System.out.println("------------------------------------------------");
		System.out.println("" + hcn1);
	}

}
