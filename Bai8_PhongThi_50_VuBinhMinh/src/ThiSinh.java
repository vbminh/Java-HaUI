import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class ThiSinh implements Serializable{
	private static int currentID = 0;
	private String soBD;
	private String hoTen;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	
	public ThiSinh() {
		soBD= String.valueOf(currentID++);hoTen="no-name";diemToan=diemLy=diemHoa=0f;
		}
	public ThiSinh(String soBD) {
		this.soBD = soBD;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 59 * hash + Objects.hashCode(this.soBD);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final ThiSinh other = (ThiSinh) obj;
		if (!Objects.equals(this.soBD, other.soBD)) {
			return false;
		}
		return true;
	}
	
	public void setSoBD(String soBD) throws Exception{
		if(soBD.trim().equals(""))
			throw new Exception("So bao danh khong duoc trong!");
		this.soBD = soBD;
	}
	
	public void setHoTen(String hoTen)throws Exception {
		if(hoTen.trim().equals(""))
			throw new Exception("Ho ten khong duocc trong!");
		this.hoTen = hoTen;
	}
	
	public void setDiemToan(float diemToan) throws Exception {
		if(diemToan<0||diemToan>10)
			throw new Exception("Diem toan khong hop le");
		this.diemToan = diemToan;
	}
	
	public void setDiemLy(float diemLy) throws Exception{
		if(diemLy<0||diemLy>10)
			throw new Exception("Diem ly khong hop le");
		this.diemLy = diemLy;
	}
	
	public void setDiemHoa(float diemHoa) throws Exception{
		if(diemHoa<0||diemHoa>10)
			throw new Exception("Diem hoa khong hop le");
		this.diemHoa = diemHoa;
	}
	
	public void nhap(){
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("\tNhap ho ten thi sinh:");
			setHoTen(sc.nextLine());
			System.out.print("\tNhap diem toan:");
			setDiemToan(sc.nextFloat());
			System.out.print("\tNhap diem ly:");
			setDiemLy(sc.nextFloat());
			System.out.print("\tNhap diem hoa:");
			setDiemHoa(sc.nextFloat());
		}
		catch (Exception ex) {
			System.out.print("co loi: "+ex.toString());
		}
	}

	@Override
	public String toString() {
		String tsValue;
		tsValue= "SBD:"+soBD+"\t Ho ten:"+hoTen+"\tdiem toan:"+diemToan+"\t diem ly";
		tsValue=tsValue +diemLy+"\tdiem hoa"+diemHoa;
		return tsValue;
	}
	
	public boolean CheckPassed() {
		return tongDiem()>15 && diemToan>=3 && diemHoa>=3 && diemLy>=3;
	}
	
	public float tongDiem() {
		return diemHoa+diemLy+diemToan;
	}
	public String getSoBD() {
		return soBD;
	}
	public String getHoTen() {
		return hoTen;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	
	
}
