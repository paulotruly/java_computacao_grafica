import java.awt.Color;
import javax.swing.JFrame;

public class PlanoCartesiano
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // criar frame
      JFrame frame = 
         new JFrame( "Plano cartesiano" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
      PlanoCartesianoJPanel planocarteseanoJPanel = 
         new PlanoCartesianoJPanel(); 
      planocarteseanoJPanel.setBackground( Color.WHITE ); 
      frame.add(planocarteseanoJPanel); // adiciona painel ao frame
      frame.setSize(640, 480); // configura o tamanho do frame
      frame.setVisible(true); // exibe o frame
   } // fim de main
} // fim da classe 
