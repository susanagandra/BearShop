package BearShop;

import java.util.Random;

public class TheShop {
    public String shopName;
    private int bearsCreated;

    public TheShop(String name) {
        this.shopName = name;
        this.bearsCreated = 0;
    }

    public Bear createNewBear() {
        Bear bear;

        bearsCreated++;
        if (bearsCreated % 2 == 0) {
            bear = new SimpleBear((int) (Math.random() * (10+1)));
            return bear;
        }
        if (bearsCreated % 5 == 0) {
            bear = new CrankyBear((int) (Math.random() * (10+1)));
            return bear;
        }
            bear = new DrunkBear((int) (Math.random() * (10+1)));
            return bear;
    }

    public int getCreateNewBear() {
        return bearsCreated;
    }

    public boolean compareTo(TheShop theShop) {
        if (this.getCreateNewBear() > theShop.getCreateNewBear()) {
            System.out.println("This shop wins!" + this.getCreateNewBear());
            return  true;
        }
            System.out.println();
            return false;
    }
}
