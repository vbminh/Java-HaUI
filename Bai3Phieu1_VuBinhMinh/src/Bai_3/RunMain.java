package Bai_3;

public class RunMain {

	public static void main(String[] args) {
		PTB2 pt = new PTB2((Math.random()*10 + 1),(Math.random()*10 + 1) , (Math.random()*10 + 1));
		System.out.println(String.format("%10s%10s%10s\t\t%s", "a", "b", "c", "Kết quả"));
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("" + pt);
	}

}
