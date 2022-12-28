public class Driver{
    private Visa visa;
    private EWallet ewallet;
    private IBanking ibanking;

    private int status;
    private int Service;
    private int customers;

    public Driver(Visa visa, EWallet ewallet, IBanking ibanking) {
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
            return "FREE";
        } else if (this.status == 2) {
            return "Carrying C00" + this.customers; //Processing
        } else {
            return "Unknown";
        }
    }
    
    public void setService(int Service) {
        this.Service = Service;
    }
    public String getService() {
        if (this.Service == 1) {
            return "Grab";
        } else if (this.Service == 2) {
            return "Gojek";
        } else if (this.Service == 3) {
            return "Be";
        } else {
            return "Unknown";
        }
    }

    public void setCustomers(int customers) {
        this.customers = customers;
    }
    public int getCustomers() {
        return this.customers;
    }

}
