import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    ArrayList<String> uyelikBilgileri=new ArrayList<String>();
    Scanner scanner=new Scanner(System.in);
    Scanner scanner1=new Scanner(System.in);
    String yeni;
    String tur;

    public void uyeGirisi(){
        System.out.println("Üyelik bilgilerinizi giriniz.");
        System.out.println("Adınız: ");
        uyelikBilgileri.add(scanner.nextLine());
        System.out.println("Soy adınız: ");
        uyelikBilgileri.add(scanner.nextLine());
        System.out.println("Email adresi: ");
        uyelikBilgileri.add(scanner.nextLine());
        System.out.println("Üyelik türü (premium, gold, silver, yok şeklinde belirtiniz): ");
        uyelikBilgileri.add(scanner.nextLine());
        tur= uyelikBilgileri.get(3);
    }
    public void bilgiGuncelle(){
        System.out.println("Değiştirmek istediğiniz bilgi için yanında verilen sayıyı giriniz.");
        System.out.println("Ad (0),soy ad (1), email (2), üyelik türü (3)");
        int bilgi= scanner.nextInt();
        System.out.println("Yeni bilgiyi yazınız.");
        yeni= scanner1.nextLine();
        uyelikBilgileri.set(bilgi,yeni);
    }
    public void uyelikSil(){
        String evet="evet";
        String hayir="hayır";
        System.out.println("Üyeliğinizin silinmesini onaylıyor musunuz?");
        System.out.println("evet veya hayır olarak yazınız.");
        String onay=scanner.nextLine();
        if (onay.compareTo(evet)==0){
            System.out.println("Üyelik bilgileriniz silinmiştir.");
            uyelikBilgileri.clear();
        } else if (onay.compareTo(hayir)==0) {
            System.out.println("üyeliğinizi silmekten vazgeçtiniz.");
        }
        else System.out.println("yanlış bir ifade yazdınız.");
    }



}

