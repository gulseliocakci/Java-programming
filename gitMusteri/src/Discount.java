import java.util.Scanner;

public class Discount extends Customer{
    String premium="premium";
    String gold="gold";
    String silver="silver";
    Double price;
    Scanner scanner=new Scanner(System.in);

    public void sale(){
        if (tur.equals(premium)){
            saleEvery();
            premiumSale();
            System.out.println("Ürününüzün indirim uygulanmış ücreti: "+price);
        } else if (tur.equals(gold)) {
            saleEvery();
            goldSale();
            System.out.println("Ürününüzün indirim uygulanmış ücreti: "+price);
        } else if (tur.equals(silver)) {
            saleEvery();
            silverSale();
            System.out.println("Ürününüzün indirim uygulanmış ücreti: "+price);
        } else {
            System.out.println("Üyelik türüne yanlış bir ifade girdiniz.");
            System.out.println("Lütfen üyelik türünüzü güncelleyip sonra yeniden deneyiniz.");
        }
    }
    public void saleEvery(){
        System.out.println("Almak istediğiniz ürünün ücretini yazınız.");
        price=scanner.nextDouble();
        price=price*90/100;
    }

    public void premiumSale(){
        price=price*80/100;
    }
    public void goldSale(){
        price=price*85/100;
    }
    public void silverSale(){
        price=price*90/100;
    }


}

