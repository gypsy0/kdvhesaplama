import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İşlem yapmak istediğiniz tutarı giriniz : ");
        double para = input.nextDouble();
        if (para > 1000) {
            double kdv = 0.08;
            double kdvlitutar = para * kdv;
            System.out.println("İşlem tutarı : " + kdvlitutar);
        } else if (para < 100 && para > 0) {
            double kdv = 0.18;
            double kdvlitutar = para * kdv;
            System.out.println("İşlem tutarı : " + kdvlitutar);

        } else {
            System.out.println("Hatalı işlem yaptınız");
        }
    }
}