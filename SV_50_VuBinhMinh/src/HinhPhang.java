import java.util.ArrayList;
import java.util.List;

abstract class HinhPhang {
	private String Mahinh;
	private String Tenhinh;
	private List<Double> DSCanh = new ArrayList<Double>();
	
	public abstract double Chuvi();
	public abstract double Dientich();
	public abstract void Nhap();
	
	public void setMahinh(String mahinh) throws Exception {
		if(mahinh.trim().equals(""))
			throw new Exception("Ma hinh khong duoc bo trong");
		Mahinh = mahinh;
			
	}
	
	public void setTenhinh(String tenhinh) {
		Tenhinh = tenhinh;
	}
	
	public void setDSCanh(Double canh) throws Exception {
		if(canh <= 0)
			throw new Exception("Do dai canh phai lon hon 0");
		DSCanh.add(canh);
	}
	
	public String getMahinh() {
		return Mahinh;
	}
	
	public String getTenhinh() {
		return Tenhinh;
	}
	
	public List<Double> getDSCanh() {
		return DSCanh;
	}
	
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-25s %-15.2f %-15.2f",getMahinh(), getTenhinh(), getDSCanh().toString(), Chuvi(), Dientich());
	}

	
}
