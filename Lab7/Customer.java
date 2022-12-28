import java.lang.Math;

public class Customer {
    private Visa visa;
    private EWallet ewallet;
    private IBanking ibanking;

    private int status;
    private int driver;
    private int service;

    public Customer(Visa visa, EWallet ewallet, IBanking ibanking) {
        this.visa = visa;
        this.ewallet = ewallet;
        this.ibanking = ibanking;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }
    public void setEwallet(EWallet ewallet) {
        this.ewallet = ewallet;
    }
    public void setIbanking(IBanking ibanking) {
        this.ibanking = ibanking;
    }

    public synchronized Visa getVisa() {
        return visa;
    }
    public synchronized EWallet getEwallet() {
        return ewallet;
    }
    public synchronized IBanking getIbanking() {
        return ibanking;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getStatus() {
        if (this.status == 1) {
            return "BOOKING (" + this.getService() + ")"; // Booking
        } else if (this.status == 2) {
            return "Being carried by D00" + this.driver + " (" + this.getService() + ")"; //Processing
        } else if (this.status == 3) {
            return "I am BANNED..."; // Banned
        } else {
            return "Unknown";
        }
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }
    public int getDriver() {
        return this.driver;
    }
    
    public void setService(int Service) {
        this.service = Service;
    }
    public String getService() {
        if (this.service == 1) {
            return "Grab";
        } else if (this.service == 2) {
            return "Gojek";
        } else if (this.service == 3) {
            return "Be";
        } else {
            return "Unknown";
        }
    }

    public void Processing(Double km){
        Thread t = new Thread() {
            public void run() {
                try {
                    if (km>=5.0){
                        Thread.sleep(10000);
                    } else {
                        Thread.sleep(2000 * Math.round(km));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
