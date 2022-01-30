import java.time.LocalDate;
import java.util.Scanner;

public class NgayThang {
	private int ngay;
	private int thang;
	private int nam;
	
	public NgayThang() {
		// TODO Auto-generated constructor stub
	}
	
	public NgayThang(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public int getNgay() {
		return ngay;
	}

	public int getThang() {
		return thang;
	}

	public int getNam() {
		return nam;
	}

	public Scanner sc = new Scanner(System.in);
	
	public void input() {
		do {
			System.out.print("- Nam: ");
			nam = sc.nextInt();
			if(nam <= 0)
				System.out.println("Nam khong hop le. Hay nhap lai");
		}while(nam <= 0);	
		
		do {
			System.out.print("- Thang: ");
			thang = sc.nextInt();
			if(thang <= 0 || thang > 12)
				System.out.println("Thang khong hop le. Hay nhap lai");
		}while(thang <= 0 || thang > 12);	
		
		do {
			System.out.print("- Ngay: ");
			ngay = sc.nextInt();
			if(!checkDay(ngay))
				System.out.println("Ngay khong hop le. Hay nhap lai");
		}while(!checkDay(ngay));	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ngay + "/" + this.thang + "/" + this.nam;
	}

	public boolean checkDay(int day) {
		int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(day > 0 && day <= dayOfMonth[this.thang - 1])
			return true;
		if((this.thang == 2 && day == 29) && (this.nam % 400 == 0 && this.nam % 100 != 0)) 
			return true;
		return false;
	}
	
	public int checkDate() {
		if(nam == LocalDate.now().getYear()) {
			if(thang == LocalDate.now().getMonthValue()) {
				if(ngay <= LocalDate.now().getDayOfMonth())
					return LocalDate.now().getDayOfMonth() - ngay;
			}
			else if((thang + 1) == LocalDate.now().getMonthValue()) {
				if(thang == 2 && ngay >= 20 && LocalDate.now().getDayOfMonth() <= 9) {
					if(nam % 400 == 0 && nam % 100 != 0)
						return LocalDate.now().getDayOfMonth() + 29 - ngay;
					else
						return LocalDate.now().getDayOfMonth() + 28 - ngay;
				}
				else if((thang == 4 || thang == 6 || thang == 9 || thang == 11) 
						&& ngay >= 20 && LocalDate.now().getDayOfMonth() <= 10)
					return LocalDate.now().getDayOfMonth() + 30 - ngay;
				else
					return LocalDate.now().getDayOfMonth() + 31 - ngay;
			}
		}
		if(((nam + 1) == LocalDate.now().getYear() && thang == 12 
				&& ngay > 21 && LocalDate.now().getDayOfMonth() <= 11) )
					return LocalDate.now().getDayOfMonth() + 31 - ngay;
	
		return -1;
	}
}