package bai_1;

public class HinhChuNhat extends HinhPhang {
	private double a;
	private double b;
	
	public HinhChuNhat(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double ChuVi() {
		return 2 * (a + b);
	}

	@Override
	public double DienTich() {
		return a * b;
	}
	
	@Override
	public String toString() {
		return String.format("%10.1f %10.1f %10s %10.1f %10.1f", a,b,"-",ChuVi(),DienTich());
	}

}
