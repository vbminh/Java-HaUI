import java.io.Serializable;
import java.util.Scanner;

public class SinhVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ten;
	private int tuoi;
	
	public void setTen(String ten) throws Exception {
		if(ten.trim().equals(""))
			throw new Exception("Ten khong duoc bo trong");
		else
			this.ten = ten;
	}
	public void setTuoi(int tuoi) throws Exception {
		if(tuoi < 0)
			throw new Exception("Tuoi phai lon hon 0");
		else
			this.tuoi = tuoi;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Nhap ten: ");
				setTen(sc.nextLine());
			
				System.out.print("Nhap tuoi: ");
				setTuoi(sc.nextInt());
				break;
			} catch (Exception e) {
				System.out.println(e.toString());;
			}	
		}
		sc.close();
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %10s","Ten: " + ten,", Tuoi: " + tuoi);
	}
}
