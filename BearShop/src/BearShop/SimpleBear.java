package BearShop;

public class SimpleBear extends Bear{
    public SimpleBear(int battery) {
        super(battery);
        this.battery = battery;
    }

    @Override
    public void talk() {
        if (getBattery() == 0) {
            System.out.println("Silent bear");
        }{
        System.out.println("I love you!");
        this.battery--;
        }
    }
}



