public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();
        int sonuc= dortIslem.Topla(3,4);
        System.out.println(sonuc);

        int sonuc2= dortIslem.Carp(20,5);
        System.out.println(sonuc2);

        double sonuc3 = dortIslem.Bol(100,33);
        System.out.println(sonuc3);

        int sonuc4 = dortIslem.Cikar(30,40);
        System.out.println(sonuc4);
        }
    }
