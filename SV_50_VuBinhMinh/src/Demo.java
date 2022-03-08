
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
	
	private static TreeSet<TamGiac> treeset = new TreeSet<TamGiac>();;
	static String fileName="Hinhphang.txt";
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		treeset.add(new TamGiac("TG01", "Tam Giac 1", (Math.random() *100 + 10), (Math.random() *100 + 10), (Math.random() *100 + 10)));
		treeset.add(new TamGiac("TG02", "Tam Giac 2", (Math.random() *100 + 10), (Math.random() *100 + 10), (Math.random() *100 + 10)));
		treeset.add(new TamGiac("TG03", "Tam Giac 3", (Math.random() *100 + 10), (Math.random() *100 + 10), (Math.random() *100 + 10)));
		treeset.add(new TamGiac("TG04", "Tam Giac 4", (Math.random() *100 + 10), (Math.random() *100 + 10), (Math.random() *100 + 10)));
		treeset.add(new TamGiac("TG05", "Tam Giac 5", (Math.random() *100 + 10), (Math.random() *100 + 10), (Math.random() *100 + 10)));
			
		System.out.println("*****Hinh Phang*****");
		 //==================================
		
		System.out.println("\n");
		do {
			menu();
			int t=sc.nextInt();
			sc.nextLine();
			switch(t) {
				case 1: Indanhsach();break;
				case 2: Xoa();break;
				case 3: timmax(); break;
				case 4: try {
					LuuFile(treeset);
					System.out.println("Luu file thanh cong");
				} catch (Exception e) {
					System.out.println("Co loi: " + e.toString());
				} break;
				default: System.out.println("Lua chon khong hop le"); System.exit(1);
			}
		}while(true);
	}
	
	static void menu() {
		System.out.println("================================");
		System.out.println("1. In danh sách hinh");
		System.out.println("2. Xoa mot hinh");
		System.out.println("3. Tim hinh co dien tich lon nhat");
		System.out.println("4. Luu file");
		System.out.println("0. Thoat");
		System.out.println("******************");
		System.out.print("\t**Chon lua cua ban? <0->4>:");
	}
	
	static void Indanhsach() {
		Intieude();
		Iterator<TamGiac> it = treeset.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	static void Xoa() {
		System.out.print("Nhap ma hinh: ");
		String mahinh = sc.nextLine();
		int count = 0;
		for(TamGiac item : treeset) {
			if(item.getMahinh().equals(mahinh)) {
				treeset.remove(item);
				count++;
			}
				
		}
		
		if(count != 0) {
			System.out.println("Danh sach sau khi xoa: ");
			Indanhsach();
		}
		else
			System.out.println("Khong co phan tu nay");
			
	}
	
	static void timmax() {
		System.out.println("Danh sach phan tu co dien tich lon nhat la: ");
		Intieude();
		System.out.println(treeset.last());
	}
	
	static void LuuFile(SortedSet<TamGiac> obj) throws Exception{
		File file = new File(fileName);
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		try {
			if(file.exists()) {
				fs = new FileOutputStream(file,true);
				 
				os = new ObjectOutputStream(fs) {
					protected void writeStreamHeader() throws IOException {
                        reset();
                    }
				};
			}
			else {
				fs = new FileOutputStream(file);
				 
				os = new ObjectOutputStream(fs);
			}
			
			os.writeInt(obj.size());
			
			os.writeObject(obj);
			
			fs.close();
			os.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	static void Intieude() {
		System.out.println(String.format("%-15s %-15s %-25s %-15s %-15s","Ma hinh", "Ten hinh", "Do dai canh", "Chu vi", "Dien tich"));
	}
}
