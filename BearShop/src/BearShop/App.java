package BearShop;

public class App {
    public static void main(String[] args) {

        TheShop shop1 = new TheShop("Welcome to the Bear Shop Bazar Paris.");
        TheShop shop2 = new TheShop("Mundo dos brinquedos");
        TheShop shop3 = new TheShop(("Ursos incriveis"));


        Bear[] bears = new Bear[10];

        System.out.println(shop1.shopName);

        for(int i = 0; i < 10; i++){
            bears[i] = shop1.createNewBear();
            bears[i] = shop2.createNewBear();
        }

        bears[0].talk();
        bears[1].talk();
        bears[2].talk();
        bears[3].talk();
        bears[4].talk();
        bears[5].talk();
        bears[6].talk();
        bears[7].talk();
        bears[8].talk();
        bears[9].talk();


       shop1.compareTo(shop2);
       shop3.compareTo(shop1);


    }
}