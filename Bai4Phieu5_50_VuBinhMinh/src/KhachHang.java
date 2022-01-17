import java.util.Scanner;

public class KhachHang {
	private String tenkh, diachi;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String tenkh, String diachi) {
		this.tenkh = tenkh;
		this.diachi = diachi;
	}
	
	public Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.print("Tên khách hàng: ");
		tenkh = sc.nextLine();
		System.out.print("Địa chỉ: ");
		diachi = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return String.format("\t%-30s %-30s","Khách hàng: " + tenkh,"Địa chỉ: " + diachi);
	}
	
}
