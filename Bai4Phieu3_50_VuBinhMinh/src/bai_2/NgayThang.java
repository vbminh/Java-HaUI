package bai_2;

import java.time.LocalDate;

public class NgayThang {
	private int ngay;
	private int thang;
	private int nam;
	
	public NgayThang() {
		// TODO Auto-generated constructor stub
	}
	
	public NgayThang(int ngay, int thang, int nam) throws Exception {
		this.nam = checkYear(nam);
		this.thang = checkMonth(thang);
		this.ngay = checkDay(ngay);
	}
	
	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ngay + "/" + this.thang + "/" + this.nam;
	}

	public int checkDay(int day) throws Exception {
		int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(day > 0 && day < dayOfMonth[this.thang - 1])
			return day;
		else if((this.thang == 2 && day == 29) && (this.nam % 400 == 0 && this.nam % 100 != 0)) 
			return day;
		else throw new Exception("Ngày không hợp lệ");
	}
	
	public int checkMonth(int month) throws Exception {
		if(month > 0 && month <= 12)
			return month;
		else throw new Exception("Tháng không hợp lệ");
	}
	
	public int checkYear(int year) throws Exception {
		int CurrentYear = LocalDate.now().getYear();
		if(year < CurrentYear)
			return year;
		else throw new Exception("Năm không hợp lệ");
	}
}
