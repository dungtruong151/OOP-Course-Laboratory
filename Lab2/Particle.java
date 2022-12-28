//Truong Tri Dung_ITCSIU21126

public class Particle {
    public int x;
    public int y;

    public Particle(int y, int x){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void okay(int x_move,int y_move){
        if (x_move==1){
            x++;
        }
        if (x_move==2){
            x--;
        }
        if (y_move==1){
            y++;
        }
        if (y_move==2){
            y--;
        }
    }

    public void move(int height, int width){
        int x_move=0;
        int y_move=0;
        
        while (x_move==0 && y_move==0){
            x_move=(int)(Math.random()*3);
            y_move=(int)(Math.random()*3);
        }

        if (x==0 && y==0){
            if (x_move==2){
                x_move=0;
            }
            if (y_move==2){
                y_move=0;
            }
        }

        if (x==0 && y==height-1){
            if (x_move==2){
                x_move=0;
            }
            if (y_move==1){
                y_move=0;
            }
        }

        if (x==width-1 && y==0){
            if (x_move==1){
                x_move=0;
            }
            if (y_move==2){
                y_move=0;
            }
        }

        if (x==width-1 && y==height-1){
            if (x_move==1){
                x_move=0;
            }
            if (y_move==1){
                y_move=0;
            }
        }

        if (x==0){
            if (x_move==2){
                x_move=0;
            }
        }
        
        if (x==width-1){
            if (x_move==1){
                x_move=0;
            }
        }

        if (y==0){
            if (y_move==2){
                y_move=0;
            }
        }

        if (y==height-1){
            if (y_move==1){
                y_move=0;
            }
        }

        okay(x_move,y_move);
    }
}
