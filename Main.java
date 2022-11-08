import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner inp=new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1=inp.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2=inp.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("İşlem Numarası: ");
        select=inp.nextInt();

        switch (select)
        {
            case 1:
                System.out.println("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölme: "+(n1/n2)+"."+(n1%n2)); // 1. sayının 2. sayıdan küçük olma durumunda ondalık gösterme biçimi
                // double olarak tanımlandığında bölüm 0 olduğu için 0.0 oluyor. Bu yüzden mod(%) alıyoruz
                break;
            default:
                System.out.println("Hatalı giriş yaptınız..!!");
        }
    }
}