public class EWallet extends PaymentService{
    private int count = 0;

    public EWallet() {
        super();
    }
    public EWallet(double balance) {
        super(balance);
    }
    
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public synchronized int pay(double amount, PaymentService target, TransportService transport) {
        if (this.getBalance() < amount){
            return -1;
        }
        if (this.getCount() % 3 == 0 && this.getCount() != 0){
            this.setBalance(this.getBalance() - amount*1.005);
            transport.receive(0.005*amount);
        } else {
            this.setBalance(this.getBalance() - amount*1.008);
            transport.receive(0.008*amount);
        }
        this.setCount(this.getCount() + 1);
        target.receive(0.8*amount);
        transport.receive(0.2*amount);
        return 0;
    }
}
