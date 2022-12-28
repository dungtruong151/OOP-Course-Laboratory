package Lab4.Question4;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class DrawAllCorners extends JPanel{
    public DrawAllCorners(){
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth()/15;
        int height = getHeight()/15;
        super.paintComponent(g);

        try {
            g.setColor(Color.BLACK);
            int i=0;
            while (i<15) {
                g.drawLine(0, height*i, width*(i+1), getHeight());
                i++;
            }
            i=0;
            while (i<15) {
                g.drawLine(width*(i+1), getHeight(), getWidth(), getHeight()-height*(i+1));
                i++;
            }
            i=0;
            while (i<15) {
                g.drawLine(getWidth(), getHeight()-height*(i+1), getWidth()-width*(i+1), 0);
                i++;    
            }
            i=0;
            while (i<15) {
                g.drawLine(getWidth()-width*(i+1), 0, 0, height*(i+1));
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
