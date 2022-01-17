
public class RunMain {
	
	public static void main(String[] args) {
		HoaDon hd = new HoaDon();
		System.out.println("\t\t========Nhập hóa đơn=======");
		hd.inputHD(hd);
		System.out.println("\n\t\t========Xuất hóa đơn=======");
		hd.outputHD();
		System.out.println("\n\t\t========Hóa đơn sau khi sắp xếp=======");
		hd.Sapxep();
	}
}
