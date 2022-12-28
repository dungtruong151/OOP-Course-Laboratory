package Lab4.Question5;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawLineSpirals extends JPanel{
    public DrawLineSpirals(){
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        int centerX = getWidth()/2;
        int centerY = getHeight()/2;
        int x = centerX;
        int y = centerY;
        int frame = 50;

        super.paintComponent(g);

        try {
            g.setColor(Color.BLACK);
            int state = 0; //0: down, 1: up
            while (x<width && y<height && x>0 && y>0) {
                if (state == 0) {
                    g.drawLine(x, y, x, y+frame);
                    y += frame;
                    g.drawLine(x, y, x-frame, y);
                    x -= frame;
                    state = 1;
                } else {
                    g.drawLine(x, y, x, y-frame);
                    y -= frame;
                    g.drawLine(x, y, x+frame, y);
                    x += frame;
                    state = 0;
                }
                frame += 50;
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
