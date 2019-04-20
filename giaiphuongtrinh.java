package giaiphuongtrinh;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        Giaodien giaoDien = new Giaodien();
        PTbac_1 pt = new PTbac_1();
        Controller dk = new Controller(pt, giaoDien);
        
        dk.nhapPhuongTrinh();;
        dk.hienKetQua();
    }
}
