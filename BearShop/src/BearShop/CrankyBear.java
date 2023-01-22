package BearShop;

public class CrankyBear extends Bear{
    public CrankyBear(int battery) {
        super(battery);
        this.battery = battery;
    }

    @Override
    public void talk() {
        if (getBattery() <= (this.battery / 2) ){
            System.out.println("Low Battery.");
        } else if (getBattery() <= (this.battery / 2)) {
            this.battery--;
        } else {
            System.out.println("I love you!");
            this.battery--;
        }
    }

}
