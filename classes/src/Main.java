public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager() ; //customerManager dediğimizde bellekte kullanılmak üzere bir nesne oluşturulur.
        CustomerManager customerManager2 = new CustomerManager();
        customerManager= customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type; sadece stack alanında işlem yapılır. heap alanında işlem yok
        int sayi1 = 450;
        int sayi2= 20;
        sayi2 =sayi1;
        sayi1=30;
        System.out.println(sayi2);

        //reference type; arraylar reference type dır. sayilar2 yi sayilar1 e eşitlediğimizde sayilar2 sayilar1 in referans numarasını alır.
        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }

}


//class lar gruplama yapmamızı sağlar.
//class lar reference type dır
//class ı kullanabilmek için onun new lenmesi gerekir.