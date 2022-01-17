package bai_1;

public class HinhTron extends HinhPhang{
	private double r;
	
	public HinhTron(double r) {
		this.r = r;
	}

	@Override
	public double ChuVi() {
		return 2 * 3.14 * r;
	}

	@Override
	public double DienTich() {
		return 3.14 * Math.pow(r, 2);
	}
	
	@Override
	public String toString() {
		return String.format("%10s %10s %10.1f %10.1f %10.1f", "-","-",r,ChuVi(),DienTich());
	}
}
