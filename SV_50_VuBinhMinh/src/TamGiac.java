import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class TamGiac extends HinhPhang implements Comparable<TamGiac>, Serializable{
	
	public TamGiac() {
		// TODO Auto-generated constructor stub
	}
	
	public TamGiac(String mahinh, String tenhinh, double a, double b, double c) {
		try {
			if (CheckCanh(a, b, c)) {
				setMahinh(mahinh);
				setTenhinh(tenhinh);
				
				setDSCanh((double)Math.round(a*100)/100);
				setDSCanh((double)Math.round(b*100)/100);
				setDSCanh((double)Math.round(c*100)/100);
			}
			else
				throw new Exception("Do dai cac canh khong thoa man: a + b > c && a + c > b && b + c > a");
			
		} catch (Exception e) {
			System.out.println("Co loi: " + e.toString());
		}
		
	}
	

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Ma hinh: ");
			setMahinh(sc.nextLine());
			System.out.print("Ten hinh: ");
			setTenhinh(sc.nextLine());
			System.out.println("Nhap do dai canh: ");
			System.out.print("a = ");
			double a = sc.nextDouble();
			System.out.print("b = ");
			double b = sc.nextDouble();
			System.out.print("c = ");
			double c = sc.nextDouble();
			sc.nextLine();
			if(CheckCanh(a, b, c)) {
				setDSCanh(a);
				setDSCanh(b);
				setDSCanh(c);
			}
			else
				throw new Exception("Do dai cac canh khong thoa man: a + b > c && a + c > b && b + c > a");
		}
		catch (Exception e) {
			System.out.println("Co loi: " + e.toString());
		}
		
	}

	@Override
	public double Chuvi() {
		List<Double> list = getDSCanh();
		double C = 0;
		for(double item : list)
			C += item;
		return C;
	}

	@Override
	public double Dientich() {
		List<Double> list = getDSCanh();
		double r = 1;
		double p = Chuvi() / 2;
		for(double item : list)
			r *= (p - item);
		return Math.sqrt((p*r));
	}
	
	public boolean CheckCanh(double a,double b,double c) {
		if(a + b > c && a + c > b && b + c > a)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int compareTo(TamGiac o) {
		TamGiac tg = (TamGiac)o;
		return this.Dientich() > tg.Dientich()? 1 : -1;
	}

}
