public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca() { //methodun adı sayı bulmaaca
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 1;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayı mevcut " + aranacak);
            System.out.println("sayı mevcut " + aranacak);

        } else {
            mesajVer("sayı mevcut değildir. " + aranacak);

        }
    }

    public static void mesajVer(String mesaj) { //parametreli method
        System.out.println(mesaj);


    }
}