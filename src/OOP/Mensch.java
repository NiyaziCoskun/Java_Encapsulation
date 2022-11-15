package OOP;

public class Mensch extends Parent{
    //java da => private, public, default, protected total de 4 tane access modifiers var
    private String anadil, isim;
    private int yas;
    private long kimlikNo;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAnadil() {
        return anadil;
    }

    public void setAnadil(String anadil) {
        this.anadil = anadil;
    }
}
