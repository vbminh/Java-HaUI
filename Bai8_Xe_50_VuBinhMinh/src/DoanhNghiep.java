import java.util.Scanner;

public class DoanhNghiep {
	private String tenDN;
	private String soDT;
	private String diaChi;
	
	@SuppressWarnings("resource")
	public void nhap() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Nhap ten DN, so dien thoai, dia chi:");
		 tenDN=sc.nextLine();
		 soDT=sc.nextLine();
		 diaChi=sc.nextLine();
	 }
	
	 @Override
	 public String toString() {
		 return "("+tenDN + "," + soDT + "," + diaChi+")";
	 }
}
