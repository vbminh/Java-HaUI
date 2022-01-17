import java.util.Scanner;

public abstract class HangHoa {
	private String mahang, tenhang;
	private int slton;
	private double dongia;
	
	public String getMahang() {
		return mahang;
	}

	public int getSlton() {
		return slton;
	}

	public double getDongia() {
		return dongia;
	}
	
	public abstract double VAT();

	public abstract String DanhGia();
	
	public Scanner sc = new Scanner(System.in);
	
	public void input() {
		do {
			System.out.print("Mã hàng: ");
			mahang = sc.nextLine();
			if(mahang.replaceAll(" ", "").isEmpty())
				System.out.println("Mã hàng không được bỏ trống. Hãy nhập lại");
		}while(mahang.replaceAll(" ","").isEmpty());
		do {
			System.out.print("Tên hàng: ");
			tenhang = sc.nextLine();
			if(tenhang.replaceAll(" ", "").isEmpty())
				System.out.println("Tên hàng không được bỏ trống. Hãy nhập lại");
		}while(tenhang.replaceAll(" ", "").isEmpty());
		
		do {
			System.out.print("Số lượng tồn: ");
			slton = sc.nextInt();
			if(slton < 0)
				System.out.println("Số lượng tồn phải lớn hơn hoặc bằng 0. Hãy nhập lại");
		}while(slton < 0);
		
		do {
			System.out.println("Đơn giá: ");
			dongia = sc.nextDouble();
			if(dongia <= 0)
				System.out.println("Đơn giá phải lớn hơn 0. Hãy nhập lại");
		}while(dongia <= 0);
	}
}
