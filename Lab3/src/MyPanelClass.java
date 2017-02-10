import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
import java.awt.Polygon;
public class MyPanelClass extends JPanel {
            /**
     *
     */
    private static final long serialVersionUID = 1L;

            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width+1, height+1);
                       
                        //Tres rectangulos rojos
                        g.setColor(Color.RED);
                        g.fillRect(x1, 4*(y1+y2)/5, width+1, height/5 +2);
                        g.fillRect(x1, 2*(y1+y2)/5, width+1, height/5);
                        g.fillRect(x1, y1/5, width+1, height/5);
                       
                        //Triangulo
                        Polygon p = new Polygon();
                         p.addPoint(x1, y1);
                         p.addPoint(x1, y2);
                         p.addPoint((x1+x2)/2, (y1+y2)/2);
                         g.setColor(Color.BLUE);
                         g.fillPolygon(p);
                       
                         //Estrella
                         Polygon p2 = new Polygon();
                         p2.addPoint((width*25)/300, (height*73)/160);
                         p2.addPoint( (width*41)/300, (height*73)/160);
                         p2.addPoint( (width*47)/300, (height*58)/160);
                         p2.addPoint( (width*53)/300, (height*73)/160);
                         p2.addPoint( (width*69)/300, (height*73)/160);
                         p2.addPoint( (width*56)/300, (height*83)/160);
                         p2.addPoint( (width*61)/300, (height*98)/160);
                         p2.addPoint( (width*47)/300, (height*88)/160);
                         p2.addPoint( (width*34)/300, (height*98)/160);
                         p2.addPoint((width*38)/300, (height*83)/160);
                         g.setColor(Color.WHITE);
                         g.fillPolygon(p2);
            }
}
