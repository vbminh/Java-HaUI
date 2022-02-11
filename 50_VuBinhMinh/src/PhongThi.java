import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class PhongThi implements Serializable{
	private String msPT;
	private String diachiPT;
	private int luongTS;
	 
	private ArrayList<ThiSinh> dsTS;
	
	public void sapxep() {
		Collections.sort(dsTS,(ThiSinh t1, ThiSinh t2) -> {
			return t1.getSoBD().compareTo(t2.getSoBD()) > 0? -1 : 1;
		});
	}

	public PhongThi(String msPT, String diachiPT, int luongTS) {
		this.msPT = msPT;
		this.diachiPT = diachiPT;
		this.luongTS = luongTS;
		dsTS = new ArrayList<ThiSinh>();
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
			System.out.println("Đã đủ số lượng thí sinh trong phòng.");
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
	
	
	
	@Override
	public String toString() {
		return "Mã số PT:"+msPT+"\tĐịa chỉ:"+diachiPT+"\tSố lượng TS:"+soThisinh();
	}

	public String getMsPT() {
		return msPT;
	}
	
}
