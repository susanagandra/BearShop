package BearShop;

public class Bear{
    public int battery;
    private String name;


    public Bear(int battery, String name) {
        this.battery = battery;
        this.name = name;
    }

    public Bear(int battery){
        this.battery = battery;
        this.name = "Sem nome";
    }

    public void talk(){
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
