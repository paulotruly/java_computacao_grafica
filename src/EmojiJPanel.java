// BASE: Fig. 12.18: Bandeira
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class EmojiJPanel extends JPanel 
{
   // Emoji
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o método paint da superclasse

      this.setBackground( Color.WHITE );
      
      g.setColor(new Color(206, 105, 1));
      g.fillOval(200, 100, 400, 400);

      g.setColor(new Color(255, 199, 4));
      g.fillOval(208, 108, 385, 385);

      g.setColor(new Color(255, 218, 47));
      g.fillOval(220, 120, 360, 360);

      g.setColor(new Color(255, 254, 220));
      g.fillOval(230, 120, 340, 340);

      g.setColor(new Color(255, 218, 47));
      g.fillOval(230, 160, 340, 300);
      
      g.setColor(new Color(78, 23, 0));
      g.fillOval(270, 210, 80, 100);

       g.setColor(new Color(166, 104, 3));
       g.fillOval(275, 215, 70, 90);

      g.setColor(new Color(78, 23, 0));
      g.fillOval(450, 210, 80, 100);

       g.setColor(new Color(166, 104, 3));
       g.fillOval(455, 215, 70, 90);

      g.setColor(new Color(78, 23, 0));
      g.fillOval(345, 325, 120, 120);

       g.setColor(new Color(166, 104, 3));
       g.fillOval(350, 330, 110, 110);
      
   } // fim do m�todo paintComponent
} // fim da classe BandeiraJPanel
