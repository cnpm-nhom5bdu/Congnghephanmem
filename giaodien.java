package giaiphuongtrinh;
import java.io.*;
public class Giaodien {
    BufferedReader stdIn=new BufferedReader(new InputStreamReader(System.in));
    public void xuat(String chuoi){
        System.out.println(chuoi);
    }
    public float NhapSothuc(String chuoi)
            //throws IOException
    {
        String s;
        float a=0;
        int flag=0;
        do {
            this.xuat(chuoi);       
            try{
                flag=1;
                s=stdIn.readLine();//nhap dang chuoi
                a=Float.parseFloat(s);
            }
            catch (Exception e){
                this.xuat("du lieu khong hop le");
                flag=0;
            }
            
        } while (flag==0);
        
        return a;                
    }
}
