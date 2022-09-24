public class Main {
    public static void main(String[] args) {
        int total = add(1,2,3,4,5);
  System.out.println(total);
    }

    public static int add(int... numbers){ //int... bu şekilde birden fazla sayı girmeye imkan tanır ve java arka planda bunları bir diziye çevirir.
        int total=0;
        for(int number: numbers) {
            total=total+number;
        }
        return total;

    }
}