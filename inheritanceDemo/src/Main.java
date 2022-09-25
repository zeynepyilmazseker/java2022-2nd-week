public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        TarimKrediManager tarimKrediManager=new TarimKrediManager();
        ogretmenKrediManager.Hesapla();
        tarimKrediManager.Hesapla();
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla((new TarimKrediManager()));
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}