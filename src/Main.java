import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("KDV Hesaplama Programına Hoşgeldiniz");
        Scanner input=new Scanner(System.in);
        System.out.print("Para değeri giriniz: ");
        double paraDegeri;
        paraDegeri = input.nextDouble();
        double kdvTutari,kdvsizFiyat;

        kdvTutari= (paraDegeri*18)/100;
        kdvsizFiyat=paraDegeri;

        System.out.println("KDV Tutarı: "+(paraDegeri*18)/100);
        System.out.println("KDV'siz Fiyat: "+kdvsizFiyat);
        System.out.println("KDV'li Fiyat:"+(paraDegeri+kdvTutari));
    }
}