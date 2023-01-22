package BearShop;

public class DrunkBear extends Bear{
    private boolean isSnoring;
    public DrunkBear(int battery) {
        super(battery);
        this.battery = battery;
        this.isSnoring = false;
    }
    @Override
    public void talk(){
        if(this.isSnoring != false) {
            int sleepProbability = (int) (Math.random() * 2);
            if (sleepProbability == 5) {
                snoring();
                this.isSnoring = true;
            }
        }{
            System.out.println("I love you!");
            this.battery--;
        }

    }
    private static void snoring(){
        System.out.println("zzzZZZZZZzzzzZZZzzzzZZ");
    }

}






