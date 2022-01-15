package Bai_3;

public class PTB2 {
	private double a;
	private double b;
	private double c;
	
	public PTB2() {
		// TODO Auto-generated constructor stub
	}
	
	public PTB2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double delta() {
		return Math.pow(b, 2) - 4*a*c;
	}
	
	public String TinhNghiem() {
		if(delta() > 0)
			return String.format("%s%.2f\t%s%.2f","x1 = ",((-b + Math.sqrt(delta())) / (2*a)),"x2 = ",((-b - Math.sqrt(delta())) / (2*a)));
		else if(delta() == 0)
			return String.format("%s%.2f", "x1 = x2 = ",(-b / (2*a)));
		return String.format("%s%.2f%s%.2f%s%.2f%s%.2f%s", "x1 = ",(-b/(2*a)),"+",(Math.sqrt(delta())/(2*a)),"i\tx2 = ",(-b/(2*a)),"+",(-Math.sqrt(delta())/(2*a)),"i"); 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%10.1f%10.1f%10.1f\t\t%s",a,b,c,TinhNghiem());
	}
}
