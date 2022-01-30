import java.util.Scanner;

public abstract class HangHoa {
	private String mahang, tenhang;
	private int slton;
	private double dongia;
	
	public HangHoa() {
	
	}
	
	public HangHoa(String mahang) {
		this.mahang = mahang;
	}

	public HangHoa(String mahang, String tenhang, int slton, double dongia) {
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.slton = slton;
		this.dongia = dongia;
	}

	public String getMahang() {
		return mahang;
	}
	
	public void setMahang(String mahang) {
		this.mahang = mahang;
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
			System.out.print("Ten hang: ");
			tenhang = sc.nextLine();
			if(tenhang.replaceAll(" ", "").isEmpty())
				System.out.println("Ten hang khong duoc bo trong. Hay nhap lai");
		}while(tenhang.replaceAll(" ", "").isEmpty());
		
		do {
			System.out.print("So luong ton: ");
			slton = sc.nextInt();
			if(slton < 0)
				System.out.println("So luong ton phai lon hon hoac bang 0. Hay nhap lai");
		}while(slton < 0);
		
		do {
			System.out.print("Don gia: ");
			dongia = sc.nextDouble();
			if(dongia <= 0)
				System.out.println("Don gia phai lon hon 0. Hay nhap lai");
		}while(dongia <= 0);
	}
	
	@Override
	public boolean equals(Object obj) {
		HangHoa hh = (HangHoa)obj;
		return this.mahang.toLowerCase().equals(hh.mahang.toLowerCase());
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-10s %15s %10s", mahang,tenhang,slton,dongia);
	}
}
