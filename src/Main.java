import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik ;

        Scanner point = new Scanner(System.in);

        System.out.println("Matematik Notunu Giriniz: ");
        matematik=point.nextInt();

        System.out.println("Fizik Notunu Giriniz: ");
        fizik=point.nextInt();

        System.out.println("Kimya Notunu Giriniz: ");
        kimya=point.nextInt();

        System.out.println("Türkçe Notunu Giriniz: ");
        turkce=point.nextInt();

        System.out.println("Tarih Notunu Giriniz: ");
        tarih=point.nextInt();

        System.out.println("Müzik Notunu Giriniz: ");
        muzik=point.nextInt();


        int total= (matematik+fizik+kimya+turkce+tarih+muzik);
        double average= total/6.0;

        boolean result= average>60;

        String str=(result)? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
        System.out.println("Ortalamanız " + average);
        System.out.println( str);

    }
}
