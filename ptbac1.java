package giaiphuongtrinh;
public class PTbac_1 {
    private float a,b;
    public PTbac_1(){
        this.a=0;
        this.b=0;
    }
    public PTbac_1(float t, float w){
        this.a=t;
        this.b=w;
    }
    public void setA(float t){
        this.a=t;
    }
    public void setB(float w){
        this.b=w;
    }
    public float getA(){
        return this.a;
    }
    public float getB(){
        return this.b;
    }
    public String ketqua(){
        String k;
        if (this.a==0){
            if (this.b==0){
                k="Phuong trinh vo so nghiem";
            }
            else{
                k="Phuong trinh vo nghiem";
            }
        }
        else{
            float x=-b/a;
            k="Phuong trinh co nghiem duy nhat la "+ x;
        }
        return k;
    }
}
