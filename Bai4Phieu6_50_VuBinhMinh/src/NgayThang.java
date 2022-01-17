import java.time.LocalDate;
import java.util.Scanner;

public class NgayThang {
	private int ngay;
	private int thang;
	private int nam;
	
	public NgayThang() {
		// TODO Auto-generated constructor stub
	}
	
	public Scanner sc = new Scanner(System.in);
	
	public void input() {
		int day, month, year;
		do {
			System.out.print("- Năm: ");
			year = sc.nextInt();
			if(!checkYear(year))
				System.out.println("Năm không hợp lệ. Hãy nhập lại");
		}while(!checkYear(year));	
		
		do {
			System.out.print("- Tháng: ");
			month = sc.nextInt();
			if(checkMonth(month,nam))
				System.out.println("Tháng không hợp lệ. Hãy nhập lại");
		}while(checkMonth(month,nam));	
		
		do {
			System.out.print("- Ngày: ");
			day = sc.nextInt();
			if(!checkDay(day))
				System.out.println("Ngày không hợp lệ. Hãy nhập lại");
		}while(!checkDay(day));	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ngay + "/" + this.thang + "/" + this.nam;
	}

	public boolean checkDay(int day) {
		int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam == LocalDate.now().getYear())
			if(thang <= LocalDate.now().getMonthValue())
				if(day <= LocalDate.now().getDayOfMonth())
					return true;
		if(day > 0 && day < dayOfMonth[this.thang])
			return true;
		if((this.thang == 2 && day == 29) && (this.nam % 400 == 0 && this.nam % 100 != 0)) 
			return true;
		return false;
	}
	
	public boolean checkMonth(int month, int year){
		if(year == LocalDate.now().getYear())
			if(month > LocalDate.now().getMonthValue())
				return false;
		if(month > 0 && month <= 12)
			return true;
		return false;
	}
	
	public boolean checkYear(int year) {
		int CurrentYear = LocalDate.now().getYear();
		if(year <= CurrentYear)
			return true;
		return false;
	}
	
	public int checkDate() {
		if(nam == LocalDate.now().getYear())
			if(thang == LocalDate.now().getMonthValue())
				if(ngay <= LocalDate.now().getDayOfMonth())
					return LocalDate.now().getDayOfMonth() - ngay;
		return -1;
	}
}