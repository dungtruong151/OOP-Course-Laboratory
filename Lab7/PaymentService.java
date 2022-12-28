public class PaymentService {
    private double balance;

    public PaymentService() {
        this.balance = 0;
    }
    public PaymentService(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int pay(double amount, PaymentService target, TransportService transport){
        return 0;
    }

    public void receive(double amount){
        this.balance += amount;
    }
}
