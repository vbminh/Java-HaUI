package tx2;

import java.util.List;

abstract class DaGiac {
	private String mahinh;
	private String tenhinh;
	private List<Double> list;
	
	public abstract double tinhCV();
	public abstract double tinhDT();
	public abstract void nhapDL();	
	
	public String getMahinh() {
		return mahinh;
	}
	public void setMahinh(String mahinh) {
		this.mahinh = mahinh;
	}
	public String getTenhinh() {
		return tenhinh;
	}
	public void setTenhinh(String tenhinh) {
		this.tenhinh = tenhinh;
	}
	public List<Double> getList() {
		return list;
	}
	public void setList(Double canh) {
		this.list.add(canh);
	}
	@Override
	public String toString() {
		return "Chu vi = " + tinhCV() + "\tDien tich = " + tinhDT();
	}
}
