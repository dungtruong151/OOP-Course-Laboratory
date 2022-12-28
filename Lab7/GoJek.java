public class GoJek extends TransportService{

    public GoJek() {
        super();
    }

    public GoJek(double balance) {
        super(balance);
    }

    public double getBalance() {
        return super.getBalance();
    }
    
    @Override
    public double getPrice(double km) {
        double price = 0;
        if (km>5.0){
            price += 5*0.7 + (km-5)*1.2;
        } else {
            price += km*0.7;
        }
        return price;
    }

}
