//Truong Tri Dung_ITCSIU21126

public class Box {
    public int width=50;
    public int height=20;
    public int numPartical=3;
    public int location[][] = new int[height][width];

    private static Box instance;

    private Box(){   
    }

    public static Box getInstance(){
        if(instance == null){
            instance = new Box();
        }
        return instance;
        }


    public void display() {
        for (int j=0; j<width; j++) {
            if (location[0][j] == 1) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        for (int i=1; i<height-1; i++) {
            for (int j=0; j<width; j++) {
                if (location[i][j] == 1) {
                    System.out.print("*");
                } else {
                    if (j==0 || j==width-1) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int j=0; j<width; j++) {
            if (location[height-1][j] == 1) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
    }
    
    public void setPartical(int y, int x) {
        location[y][x] = 1;
    }
    public void removePartical(int y, int x) {
        location[y][x] = 0;
    }
    public int getPartical(int y, int x) {
        return location[y][x];
    }

    public void resetLocation() {
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                location[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Box b = Box.getInstance();
        Particle[] p = new Particle[b.width*b.height];
        b.resetLocation();

        System.out.println("Initial location:");
        for (int i=0; i<b.numPartical; i++) {
            p[i] = new Particle((int)(Math.random()*b.height), (int)(Math.random()*b.width));
            b.setPartical(p[i].getY(), p[i].getX());
        }
        b.display();
        System.out.println();
        System.out.println("Number of Partical: "+b.numPartical);
        System.out.println();

        int z=0;
        while (z!=-1){
            System.out.println("With n = "+(z+1)+" :");
            for (int i=0; i<b.numPartical; i++) {
                b.removePartical(p[i].getY(), p[i].getX());
                p[i].move(b.height, b.width);
                
            }
            for (int i=0; i<b.numPartical; i++) {
                b.setPartical(p[i].getY(), p[i].getX());
            }

            int old_numPartical=b.numPartical;
            for (int i=0; i<old_numPartical-1; i++) {
                for (int j=i+1; j<old_numPartical; j++) {
                    if (p[i].getX() == p[j].getX() && p[i].getY() == p[j].getY()) {
                        if (b.numPartical!=b.width*b.height-1){
                            b.numPartical++;
                            p[b.numPartical-1] = new Particle((int)(Math.random()*b.height), (int)(Math.random()*b.width));
                            b.setPartical(p[b.numPartical-1].getY(), p[b.numPartical-1].getX());
                        }
                        else {
                            System.out.println("The box is full");  
                            return;
                        }
                    }
                }
            }

            b.display();
            System.out.println();
            /*for (int i=0; i<b.numPartical; i++) {
                System.out.println(p[i].getY() + " "+ p[i].getX());
            }*/
            System.out.println("Number of Partical: "+b.numPartical);
            System.out.println();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            z++;
        }
    }
}
