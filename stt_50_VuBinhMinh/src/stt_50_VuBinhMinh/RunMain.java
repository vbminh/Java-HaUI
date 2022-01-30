package stt_50_VuBinhMinh;

public class RunMain {
	
	public static void main(String[] args) {
		HoaDon hd = new HoaDon();
		System.out.println("\t\t========Nhap hoa don=======");
		hd.inputHD(hd);
		System.out.println("\n\t\t========Xuat hoa don=======");
		hd.outputHD();
		System.out.println("\n\t\t========Hoa don sau khi sap xep=======");
		hd.Sapxep();
	}
}

