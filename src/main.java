import java.util.Scanner;
public class main {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
            int fakt1 = 1, fakt2 = 1, fakt3 = 1;
            System.out.print("Birinci değeri giriniz : ");
            int deger1 = inp.nextInt();
            for (int a = 1; a <= deger1; a++) {
                fakt1 *= a;
                }
                System.out.print("İkinci değeri giriniz : ");
            int deger2 = inp.nextInt();
            for (int b = 1; b <= deger2; b++) {
                fakt2 *= b;
            }if(deger1 > deger2) {
                    int fark = deger1 - deger2;
                    for (int c = 1; c <= fark; c++) {
                    fakt3 *= c;
                    }
                    int carpim = fakt2 * fakt3;
                    int kombinasyon = fakt1 / carpim;
                    System.out.println("Kombinasyon : " +kombinasyon);
            }else{
                    System.out.print("Değer 1, değer 2'den büyük olmalıdır, tekrar deneyiniz.");
            }
















    }
}