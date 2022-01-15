package Bai_2;

public class RunMain {

	public static void main(String[] args) {
		HinhTron ht = new HinhTron(Math.random()*10 + 1);
		
		System.out.println(String.format("%10s %10s %10s", "Bán kính","Chu vi","Diện tích"));
		System.out.println("----------------------------------");
		System.out.println("" + ht);
	}

}
