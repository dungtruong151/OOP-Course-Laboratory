public class IBanking extends PaymentService{

    public IBanking() {
        super();
    }
    public IBanking(double balance) {
        super(balance);
    }

    @Override
    public synchronized int pay(double amount, PaymentService target, TransportService transport) {
        if (this.getBalance() < amount){
            return -1;
        }
        this.setBalance(this.getBalance() - amount*1.005);
        target.receive(0.8*amount);
        transport.receive(0.2*amount + 0.005*amount);
        return 0;
    }
}
