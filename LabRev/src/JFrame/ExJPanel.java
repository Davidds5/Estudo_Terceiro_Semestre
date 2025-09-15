package JFrame;

import javax.swing.*;
import java.awt.*;



public class ExJPanel extends JFrame{
  JPanel panel;
    public ExJPanel(){
        panel = new JPanel(new GridLayout(2, 2));
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);
        setTitle("Exemplo de JFrame com um JPanel azul");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        ExJPanel panel1 = new ExJPanel();

    }
}
