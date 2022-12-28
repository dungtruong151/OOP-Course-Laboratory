public class TransportService {
    private double balance;

    public TransportService() {
        this.balance = 0;
    }
    public TransportService(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPrice(double km) {
        return 0;
    }

    public void receive(double amount){
        this.balance += amount;
    }
}
