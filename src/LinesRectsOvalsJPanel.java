// Fig. 12.18: LinesRectsOvalsJPanel.java
// Desenhando linhas, ret�ngulos e ovais.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LinesRectsOvalsJPanel extends JPanel 
{
   // exibe várias linhas, retângulos e elipses
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // chama o m�todo paint da superclasse

      this.setBackground( Color.WHITE );
      
      g.setColor( new Color(0,156, 59));
      g.fillRect(0, 0, 200, 140);
      g.setColor( new Color(0,39, 118));
      g.fillOval(65, 35, 70, 70);
    
      g.setColor( new Color(255,223, 0));
     g.drawLine(100, 17	, 183, 70);
     g.drawLine(183, 70, 100, 123);
     g.drawLine(100, 123, 17, 70); 
     g.drawLine(17, 70, 100, 17); 
   
   } // fim do m�todo paintComponent
} // fim da classe LinesRectsOvalsJPanel


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/