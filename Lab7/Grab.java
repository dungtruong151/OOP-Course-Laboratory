public class Grab extends TransportService{
    
    public Grab() {
        super();
    }

    public Grab(double balance) {
        super(balance);
    }

    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public double getPrice(double km) {
        double price = 0;
        if (km>2.0){
            price += 1 + (km-2)*1;
        } else {
            price += km*0.5;
        }
        return price;
    }

}
