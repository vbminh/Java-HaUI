package bai_1;

public class HinhVuong extends HinhPhang {
	private double a;
	
	public HinhVuong(double a) {
		this.a = a;
	}

	@Override
	public double ChuVi() {
		return 4 * a;
	}

	@Override
	public double DienTich() {
		return Math.pow(a, 2);
	}
	
	@Override
	public String toString() {
		return String.format("%10.1f %10.1f %10s %10.1f %10.1f", a,a,"-",ChuVi(),DienTich());
	}

}
