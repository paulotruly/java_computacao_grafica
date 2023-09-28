// BASE: Fig. 12.18: Bandeira
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PlanoCartesianoJPanel extends JPanel 
{
   // Emoji
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o método paint da superclasse

      this.setBackground( Color.WHITE );
    
    g.setColor(new Color(0,0,0));
    
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
   
// 624x440
// 312x220

    //  320     0    320   480
     // int x int y int2 x int2 y
    //  0      320   480   320
   
      
   } // fim do m�todo paintComponent
} // fim da classe BandeiraJPanel
