import java.util.Scanner;
public class vucutindeks {
    public static void main(String[] args) {
        double boy, kilo, kitleindeks;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu Metre cinsinden giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        kitleindeks = kilo / (boy * boy);
        System.out.print("Vücüt kilo indeksiniz:"+ kitleindeks);
    }

}
