import java.util.Random;

public class Test {
    public static void main(String[] args) {
        final Grab Grab = new Grab();
        final GoJek GoJek = new GoJek();
        final Be Be = new Be();

        Random rand = new Random();
        final Driver[] drivers = new Driver[10];
        int m = rand.nextInt(9) + 1;
        for (int i = 1;i<=m;i++){
            drivers[i] = new Driver(new Visa(), new EWallet(), new IBanking());
            drivers[i].setService(rand.nextInt(3)+1);
        }
        
        final Customer[] customers = new Customer[10];
        int n = rand.nextInt(9) + 1;
        for (int i = 1;i<=n;i++){
            customers[i] = new Customer(new Visa(rand.nextInt(10)+10), new EWallet(rand.nextInt(10)+10), new IBanking(rand.nextInt(10)+10));
        }

        System.out.println("******************************************Initial State******************************************");
        System.out.println("[Customer]");
        System.out.println(String.format("%10s | %10s | %10s | %10s", "ID", "Visa", "E-Wallet", "IBanking"));
        for (int i=1;i<=n;i++){
            System.out.println(String.format("%10s | %10s | %10s | %10s", "C00"+i, customers[i].getVisa().getBalance(), customers[i].getEwallet().getBalance(), customers[i].getIbanking().getBalance()));
            customers[i].setDriver(1);
            customers[i].setStatus(0);
        }
        System.out.println();
        System.out.println("[Driver]");
        System.out.println(String.format("%10s | %10s ", "ID", "Service"));
        for (int i=1;i<=m;i++){
            System.out.println(String.format("%10s | %10s ", "D00"+i, drivers[i].getService()));
            drivers[i].setStatus(1);
        }
        

        Thread output = new Thread(){
            public void run(){
                long start[] = new long[10];
                boolean continous = true;
                while (continous){
                    for (int i=1;i<=n;i++){
                        Double km = rand.nextDouble(10)+1;
        
                            Double a = Grab.getPrice(km);
                            Double b = GoJek.getPrice(km);
                            Double c = Be.getPrice(km);
                        
                        if (customers[i].getStatus().equals("Unknown")){
                                                
                            if (a <= b && a <= c){ // Choose Grab
                                customers[i].setService(1);
                                customers[i].setStatus(1);
        
                                for (int j=1;j<=m;j++){
                                    if (drivers[j].getService().equals("Grab") && drivers[j].getStatus().equals("FREE")){
                                        if (customers[i].getVisa().pay(a, drivers[j].getVisa(), Grab) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis();                                    
                                            break;
                                        }
        
                                        if (customers[i].getEwallet().pay(a, drivers[j].getEwallet(), Grab) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
        
                                        if (customers[i].getIbanking().pay(a, drivers[j].getIbanking(), Grab) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
                                    }
        
                                }
                                
                            }else if (b <= c && b <= a){ // Choose Gojek
                                customers[i].setService(2);
                                customers[i].setStatus(1);
        
                                for (int j=1;j<=m;j++){
                                    if (drivers[j].getService().equals("Gojek") && drivers[j].getStatus().equals("FREE")){
                                        if (customers[i].getVisa().pay(b, drivers[j].getVisa(), GoJek) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
        
                                        if (customers[i].getEwallet().pay(b, drivers[j].getEwallet(), GoJek) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
        
                                        if (customers[i].getIbanking().pay(b, drivers[j].getIbanking(), GoJek) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
                                    }
                                }
                                                    
                            }else if (c <= a && c <= b){ // Choose Be
                                customers[i].setService(3);
                                customers[i].setStatus(1);
        
                                for (int j=1;j<=m;j++){
                                    if (drivers[j].getService().equals("Be") && drivers[j].getStatus().equals("FREE")){
                                        if (customers[i].getVisa().pay(c, drivers[j].getVisa(), Be) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
        
                                        if (customers[i].getEwallet().pay(c, drivers[j].getEwallet(), Be) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
        
                                        if (customers[i].getIbanking().pay(c, drivers[j].getIbanking(), Be) == 0){
                                            customers[i].setDriver(j);
                                            customers[i].setStatus(2);
                                            drivers[j].setCustomers(i);
                                            drivers[j].setStatus(2);
                                            start[i] = System.currentTimeMillis(); 
                                            break;
                                        }
                                    }
                                }
                                                        
                            }
                            else {
                                customers[i].setStatus(3);
                            }
                            start[i] = System.currentTimeMillis();

                            //System.out.println(a + " " + b + " " + c);
                        } else if (customers[i].getStatus().equals("BOOKING (" + customers[i].getService() + ")")){
                            long finish = System.currentTimeMillis();
                            long timeElapsed = finish - start[i];
                            System.out.println(timeElapsed);
                            if (timeElapsed >= 1000){
                                customers[i].setStatus(0);
                                break;
                            }
                        } else if (customers[i].getStatus().equals("Being carried by D00" + customers[i].getDriver() + " (" + customers[i].getService() + ")")){
                            long finish = System.currentTimeMillis();
                            long timeElapsed = finish - start[i];
                            if (km>5){
                                if (timeElapsed >= 10000){
                                    customers[i].setStatus(0);
                                    drivers[customers[i].getDriver()].setStatus(1);
                                    drivers[customers[i].getDriver()].setCustomers(0);
                                    break;
                                }
                            } else {
                                if (timeElapsed >= 2000*km){
                                    customers[i].setStatus(0);
                                    drivers[customers[i].getDriver()].setStatus(1);
                                    drivers[customers[i].getDriver()].setCustomers(0);
                                    break;
                                }
                            }
                        }
                        
                    }
        
                    int count = 0;
                    for (int i=1;i<=n;i++){
                        if (customers[i].getStatus().equals("I am BANNED...") ){
                            count++;
                        }
                    }
                    if (count == n){
                        continous = false;
                    }
        
                    //output
                    try{
                        System.out.println("**************************************************************************************************");
                            System.out.println();
                            System.out.println("==========================================System Status==========================================");
                            System.out.println(String.format("%-10s | %-30s | %-49s  |", "Customer", "Status", "Balance"));
                            System.out.println("--------------------------------------------------------------------------------------------------");
                            for (int i=1;i<=n;i++){
                                System.out.println(String.format("%-10s | %-30s | %-5.5s (Visa: %-5.5s E-Wallet: %-5.5s IBanking %-5.5s) |",
                                                                        "C00"+i, 
                                                                        customers[i].getStatus(), 
                                                                        customers[i].getVisa().getBalance() + customers[i].getEwallet().getBalance() + customers[i].getIbanking().getBalance(),
                                                                        customers[i].getVisa().getBalance(),
                                                                        customers[i].getEwallet().getBalance(),
                                                                        customers[i].getIbanking().getBalance()
                                                                        ));
                                                                
                            }
                            System.out.println("--------------------------------------------------------------------------------------------------");
                            System.out.println(String.format("%-10s | %-10s | %-17s | %-49s  |", "Driver", "Service", "Status", "Balance"));
                            System.out.println("--------------------------------------------------------------------------------------------------");
                            for (int i=1;i<=m;i++){
                                System.out.println(String.format("%-10s | %-10s | %-17s | %-5.5s (Visa: %-5.5s E-Wallet: %-5.5s IBanking %-5.5s) |",
                                                                        "D00"+i, 
                                                                        drivers[i].getService(),
                                                                        drivers[i].getStatus(), 
                                                                        drivers[i].getVisa().getBalance() + drivers[i].getEwallet().getBalance() + drivers[i].getIbanking().getBalance(),
                                                                        drivers[i].getVisa().getBalance(),
                                                                        drivers[i].getEwallet().getBalance(),
                                                                        drivers[i].getIbanking().getBalance()
                                                                        ));
                            }
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //continous = false;
                } 
            }
        };

        output.start();
        
    }
}
