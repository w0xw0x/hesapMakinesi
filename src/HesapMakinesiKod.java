import java.util.Scanner;

public class HesapMakinesiKod {
    public static void main(String[] args) {
        int n1, n2,select;


        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();

        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("Şu işlemlerden birini seçiniz\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.println("Seçiminiz Nedir? (lütfen rakam yazınız!) : ");

        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc : " + (n1*n2));
                break;
            case 4:
                if (n2!=0) {
                    System.out.println("Sonuc : " + (n1 / n2));
                }else {
                    System.out.println("Bölmede 2. sayı 0 olamaz!");
                }
                break;

        }


    }
}
