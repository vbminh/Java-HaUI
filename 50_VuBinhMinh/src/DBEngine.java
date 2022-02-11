import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DBEngine {
	public void LuuFile(String fileName, Object obj) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		File file = new File(fileName);
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		try {
			if(file.exists() && hasObj(file)) {//nếu file đã tồn tại và có dữ liệu
				System.out.print("Bạn có muốn ghi đè vào file không?(1:yes|0:no)\t");
				int choice = sc.nextInt();
				
				if(choice== 1) {//có ghi đè
					fs = new FileOutputStream(file,false);
					 
					os = new ObjectOutputStream(fs);
				}
				else if(choice == 0) {//không ghi đè, ghi thêm vào cuối
					fs = new FileOutputStream(file,true);
					 
					os = new ObjectOutputStream(fs) {
						protected void writeStreamHeader() throws IOException {
	                        reset();
	                    }
					};
				}
			}
			else {//ngược lại: ghi bình thường
				fs = new FileOutputStream(file);
				 
				os = new ObjectOutputStream(fs);
			}
			
			System.out.println("Lưu file thành công");
			
			os.writeObject(obj);			 
			fs.close();
			os.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public Object docFile(String fileName) throws Exception{
		Object kq;
	
		FileInputStream fi=new FileInputStream(fileName);
		
		ObjectInputStream ois=new ObjectInputStream(fi);

		kq= (Object)ois.readObject();
		
		fi.close();ois.close();
		return kq;
	}
	
	public static boolean hasObj(File file) {//kiểm tra trong file có dữ liệu chưa
		//doc file
		FileInputStream fi;
		boolean check = true;
        try {
            fi = new FileInputStream(file);
            ObjectInputStream inStream = new ObjectInputStream(fi);
            if (inStream.readObject() == null) { //kiểm tra file có obj nào không
                check = false;
            }
            inStream.close();
 
        } catch (FileNotFoundException e) {
            check = false;
        } catch (IOException e) {
            check = false;
        } catch (ClassNotFoundException e) {
            check = false;
            e.printStackTrace();
        }
        return check;
	}
}
