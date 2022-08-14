import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double vki, boy, kilo;

        System.out.print("Metre cinsinden boyunuzu giriniz : ");
        Scanner inp = new Scanner(System.in);
        boy = inp.nextDouble();
        System.out.println("Kilonuzu giriniz(kg) : ");
        kilo = inp.nextDouble();
        vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle indeksiniz : "+ vki);

        if (vki<18.5) {System.out.println("Vücut Kitle indeksinize göre Zayıfsınız");
        } else if (vki<25) {System.out.println("Vücut Kitle indeksinize göre Normal Kilodasınız");
        } else if (vki<30) {System.out.println("Vücut Kitle indeksinize göre Kilolusunuz");
        } else {System.out.println("Vücut Kitle indeksinize göre Obezsiniz");}

    }
}