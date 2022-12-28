public class Be extends TransportService{

    public Be() {
        super();
    }

    public Be(double balance) {
        super(balance);
    }

    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public double getPrice(double km) {
        double price = 0;
        if (km>3.0){
            price += 3*0.5 + (km-3)*1.5;
        } else {
            price += km*0.5;
        }
        return price;
    }
    
}
