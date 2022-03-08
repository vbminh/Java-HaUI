package tx2;

import java.util.List;
import java.util.Scanner;

public class HinhVuong extends DaGiac{

	@Override
	public double tinhCV() {
		List<Double> list = getList();
		double cv = 0;
		for(Double item : list) {
			cv += item;
		}
		return cv;
	}

	@Override
	public double tinhDT() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void nhapDL() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ma hinh: ");
		setMahinh(sc.nextLine());
		System.out.print("Ten hinh: ");
		setTenhinh(sc.nextLine());
		System.out.print("Nhap do dai canh: ");
		setList(sc.nextDouble());
	}

}
