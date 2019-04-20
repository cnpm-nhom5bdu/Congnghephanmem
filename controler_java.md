package giaiphuongtrinh;

public class Controller {
   public PTbac_1 pt;
   public Giaodien giaoDien;

    public Controller(PTbac_1 pt, Giaodien giaoDien) {
        this.pt = pt;
        this.giaoDien = giaoDien;
    }
    
    public void hienKetQua(){
        giaoDien.xuat(pt.ketqua());
    }
    
    public void nhapA(){
        pt.setA(giaoDien.NhapSothuc("Nhập a: "));
    }
    
    public void nhapB(){
        pt.setB(giaoDien.NhapSothuc("Nhập b: "));
    }
    
    public void nhapPhuongTrinh(){
        nhapA();
        nhapB();
    } 
}
