/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Duong
 */
public class DBEngine {
 /**
* Serial 1 Ä‘á»‘i tÆ°á»£ng xuá»‘ng file
* @param fileName file chá»‰ Ä‘á»‹nh
* @param obj: Ä‘á»‘i tÆ°á»£ng cáº§n serial
* @throws Exception
*/
public void LuuFile(String fileName, Object obj) 
        throws Exception{
    //Tạo luồng ghi file
    FileOutputStream fs=new FileOutputStream(fileName);
    //Tạo luồng để serial đối tươngk
    ObjectOutputStream os=new ObjectOutputStream(fs);
    //chuyá»ƒn táº£i Ä‘á»‘i tÆ°á»£ng tá»›i Ä‘Ă­ch (táº­p tin)
    os.writeObject(obj);
    //Ä‘Ă³ng luá»“ng
    fs.close();
    os.close();
}
/**
* KhĂ´i phá»¥c(deserial) 1 Ä‘á»‘i tÆ°á»£ng Ä‘Ă£ Ä‘Æ°á»£c serial trÆ°á»›c Ä‘Ă³
* lĂªn bá»™ nhá»›.
* @param fileName: file chá»‰ Ä‘á»‹nh
* @return Ä‘á»‘i tÆ°á»£ng Ä‘Ă£ Ä‘Æ°á»£c phá»¥c há»“i
* @throws Exception
*/
public Object docFile(String fileName) throws Exception{
    Object kq=null;
    //Táº¡o luá»“ng Ä‘á»�c file Ä‘Ă£ Ä‘Æ°á»£c serial    
    FileInputStream fi=new FileInputStream(fileName);
    //Táº¡o luá»“ng Ä‘á»ƒ Deserialize Ä‘á»‘i tÆ°á»£ng
    ObjectInputStream ois=new ObjectInputStream(fi);
    //Tiáº¿n hĂ nh khĂ´i phá»¥c Ä‘á»‘i tÆ°á»£ng
    kq=ois.readObject();
    //Ä‘Ă³ng luá»“ng
    fi.close();ois.close();
    return kq;
}
   
}
