//built-in javanın içinde package var demek.
//util araç demek
//import matematik.Dortislem;
//import matematik.Logaritma;
import matematik.*; // Bu yazımda matematik paketinin içerisindeki herşeyi tanımlar.

import java.util.Scanner; // Bu yapı kullanıcıdan bilgi almayada yarar.
/*Bir paketi başka bir projede kullanmak istiyorsak o paketi import etmemiz gerekmektedir.
yada bir paketi başka bir paketin içinde kullanmak içinde import edilmelidir.*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınız:");

        String isim=scanner.nextLine();

        System.out.println("Merhaba "+isim);

        Dortislem dortislem=new Dortislem();
        dortislem.topla(2,3);
        Logaritma logaritma=new Logaritma();

    }
}
