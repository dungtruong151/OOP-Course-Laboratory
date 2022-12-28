package Lab4.Question5;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.lang.Math;

public class DrawArcSpirals extends JPanel{
    public DrawArcSpirals(){
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        int centerX = getWidth()/2;
        int centerY = getHeight()/2;
        int frame = 50;
        int x = centerX;
        int y = centerY-frame/2;

        super.paintComponent(g);

        try {
            g.setColor(Color.BLACK);
            int state = 1; //0: down, 1: up
            while (frame/2<width/Math.sqrt(2) || frame/2<height/Math.sqrt(2)) {
                if (state == 1) {
                    g.drawArc(x, y, frame, frame, 0, 180);
                    x -= 50;
                    y -= 50/2;
                    state = 0;
                } else {
                    g.drawArc(x, y, frame, frame, 180, 180);
                    y -= 50/2;
                    state = 1;
                }
                frame += 50;
            }        
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
