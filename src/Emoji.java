import java.awt.Color;
import javax.swing.JFrame;

public class Emoji
{
   // executa o aplicativo
   public static void main( String args[] )
   {
      // criar frame
      JFrame frame = 
         new JFrame( "Emoji" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
      EmojiJPanel emojiJPanel = 
         new EmojiJPanel(); 
      emojiJPanel.setBackground( Color.WHITE ); 
      frame.add( emojiJPanel ); // adiciona painel ao frame
      frame.setSize( 800, 610 ); // configura o tamanho do frame
      frame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe 
