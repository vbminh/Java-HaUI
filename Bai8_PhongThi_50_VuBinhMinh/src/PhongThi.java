import java.io.Serializable;
import java.util.ArrayList;

public class PhongThi implements Serializable{
	private String msPT;
	private String diachiPT;
	private int luongTS;
	 
	private ArrayList<ThiSinh> dsTS;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public PhongThi(String msPT, String diachiPT, int luongTS) {
		this.msPT = msPT;
		this.diachiPT = diachiPT;
		this.luongTS = luongTS;
		dsTS=new ArrayList<ThiSinh>();
	}
	
	public ArrayList<ThiSinh> getDsTS() {
		return dsTS;
	}
	public void setDsTS(ArrayList<ThiSinh> dsTS) {
		this.dsTS = dsTS;
	}
	
	public boolean themThiSinh(ThiSinh ts) {
		if(dsTS.contains(ts)) return false;
		if(dsTS.size()+1>luongTS)		 {
			System.out.println("da du so luong thi sinh trong phong.");
			return false;
		}
		
		else{ 
			dsTS.add(ts);
			return true;
		}
	}
	
	public boolean xoaThisinh(String soBD) {
		ThiSinh ts=new ThiSinh(soBD);
		if(!dsTS.contains(ts)) return false;
		else { 
			 dsTS.remove(ts);
			 return true;
		}
	}
	
	public boolean suaThongtinTS(String soBD, ThiSinh newTS) {
		ThiSinh ts=new ThiSinh(soBD);
		if(!dsTS.contains(ts))
			return false;
		dsTS.set(dsTS.indexOf(ts),newTS);
		return true;
	}
	
	public ThiSinh layThongtinTS(String soBD) {
		ThiSinh ts=new ThiSinh(soBD);
		if(!dsTS.contains(ts))
			return null;
		ts=dsTS.get(dsTS.indexOf(ts));
		return ts;
	}
	
	public ThiSinh layThongtinTS(int index){
		if(index<0||index>dsTS.size())
			return null;
		return dsTS.get(index);
	}

	public int soThisinh() {
		return dsTS.size();
	}
	
}
