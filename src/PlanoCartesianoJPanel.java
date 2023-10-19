// BASE: Fig. 12.18: Bandeira
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlanoCartesianoJPanel extends JPanel {

   public void paintComponent(Graphics g) {
      super.paintComponent(g); // chama o método paint da superclasse
      this.setBackground( Color.WHITE );
    
    // tracinhos x pro y
    g.drawLine(299, 35, 323, 35);
    g.drawLine(299, 135, 323, 135);
    g.drawLine(299, 405, 323, 405);
    g.drawLine(299, 305, 323, 305);  
    // linha y
     g.drawLine(312, 0, 312, 440);
    //tracinhos y pro x
     g.drawLine(20, 210, 20, 230);
     g.drawLine(120, 210, 120, 230);
     g.drawLine(220, 210, 220, 230);
     g.drawLine(603, 210, 603, 230);
     g.drawLine(603, 210, 603, 230);
     g.drawLine(503, 210, 503, 230);
     g.drawLine(403, 210, 403, 230);   
    // linha x
     g.drawLine(0, 220, 623, 220);
    // tracinho vermelho
     g.setColor(Color.RED);
     g.drawLine(503, 35, 403, 135);
   // i x, i y - f x, f y
      
     g.setColor(Color.BLUE);
     g.drawString("2", 280, 40);
     g.drawString("1", 280, 140);
     g.drawString("-1", 280, 310);
     g.drawString("-2", 280, 410);
   
     g.drawString("-3", 12, 250);
     g.drawString("-2", 112, 250);
     g.drawString("-1", 212, 250);
     g.drawString("0", 282, 250);
     g.drawString("1", 400, 250);
     g.drawString("2", 500, 250);
     g.drawString("3", 600, 250);


   } // fim do m�todo paintComponent
} // fim da classe BandeiraJPanel
