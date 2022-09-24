public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(0, 2); //begin index inclusive ; end index exclusive
        int number = add(20, 7);
        System.out.println(number);

        System.out.println(newMessage);


    }

    public static void delete() {
        System.out.println("deleted");

    }

    public static void update() {
        System.out.println("updated");
        return;   //bu methodu devam ettirme bitir anlamındadır.

    }

    public static int add(int number1, int number2) { //bu fonksiyon int tipinde bir değer döndürür
        return number1 + number2; // geri dönüş olarak yazdığını döndürür.
    }

    public static String getCity() {
        return "Ankara";
    }

}