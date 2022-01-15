package Bai_1;

public class HCN {
	private double dai;
	private double rong;
	
	public HCN() {
		// TODO Auto-generated constructor stub
	}
	
	public HCN(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	public double Chuvi() {
		return (dai + rong) * 2;
	}
	
	public double Dientich() {
		return dai * rong;
	}
	
	@Override
	public String toString() {
		return String.format("%10.1f %12.1f %10.1f %12.1f", dai,rong,Chuvi(),Dientich());
	}
}
