 package Bai_2;

public class HinhTron {
	private double r;
	
	public HinhTron() {
		// TODO Auto-generated constructor stub
	}
	
	public HinhTron(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double chuvi() {
		return 2 * 3.14 * r;
	}
	
	public double dientich() {
		return 3.14 * Math.pow(r, 2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10.1f %10.1f %10.1f", r,chuvi(),dientich());
	}
}
