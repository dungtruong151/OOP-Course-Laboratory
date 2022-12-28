public class Visa extends PaymentService{
    private boolean isBorrowed = true;

    public Visa() {
        super();
    }
    public Visa(double balance) {
        super(balance);
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public synchronized int pay(double amount, PaymentService target, TransportService transport) {
        while (this.getBalance() < amount){
            if (this.isBorrowed){
                this.setBalance(this.getBalance() + 10);
                this.setBorrowed(false);
            } else {
                return -1;
            }
        }
        this.setBalance(this.getBalance() - amount*1.01);
        target.receive(0.8*amount);
        transport.receive(0.2*amount + 0.01*amount);
        return 0;
    }
}
