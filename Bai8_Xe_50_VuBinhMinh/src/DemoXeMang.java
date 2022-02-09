import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoXeMang {
	static ArrayList<Xe> dsXe= new ArrayList<Xe>();

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("\t\t==Quan ly xe==");
		int chon;
		do{
			 System.out.print("1\tNhap danh sach xe\n");
			 System.out.print("2\tIn danh sach xe\n");
			 System.out.print("3\tTim kiem xe co trong tai max\n");
			 System.out.print("4\tXoa xe theo stt\n");
			 System.out.print("5\tSap xep danh sach xe\n");
			 System.out.print("6\tThoat\n");
			 System.out.print("Nhap lua chon: ");
			 chon=sc.nextInt();
			 switch(chon){
			 case 1:
				 nhapXe(); break;
			 case 2:
				 inDSXe(); break;
			 case 3:
				 timXeTrongTaiMax(); break;
			 case 4:
				 System.out.print("Nhap so xe can xoa:");
				 int stt=sc.nextInt();
				 xoaXe(stt); break;
			 case 5:
				 sapxep(); break;
			 }
		}
		while(chon!=6);
	}
	
	public static void nhapXe() {
		 while(true){
			 Xe xe = new Xe();
			 System.out.println("dung nhap trong tai =0");
			 xe.nhap();
			 System.out.println();
			 if (xe.getTrongTai()==0f) break;
			 dsXe.add(xe);
		 }
	}
	
	public static void inDSXe() {
		 Xe.inTieuDe();
		 for(Xe item : dsXe)
			 item.inDL();
	}

	public static boolean xoaXe(int stt) {
		 if ((stt>=0)&&(stt<=dsXe.size())) {
			 dsXe.remove(stt);
			 return true;
		 }
		 else {
			 System.out.println("vi tri xe ngoai pham vi");
			 return false;
		 }
	}

	public static void timXeTrongTaiMax() {
		Xe x = Collections.max(dsXe,(Xe t, Xe t1) -> {
			return Float.compare(t.getTrongTai(), t1.getTrongTai());
		});
		
		System.out.println("DS xe co trong tai max=");
		Xe.inTieuDe();
		float max =x.getTrongTai();
		for (Xe item : dsXe) {
			if (item.getTrongTai()==max) {
				item.inDL();
			}
		}
	 }
	
	public static void sapxep() {
		Collections.sort(dsXe, (Xe t, Xe t1) -> {
			if(t.getTenXe().compareTo(t1.getTenXe()) == 0)
				return Float.compare(t.getTrongTai(), t1.getTrongTai());
			return t.getTenXe().compareTo(t1.getTenXe());
		});
		inDSXe();
	}

}
