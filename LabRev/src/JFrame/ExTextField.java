package JFrame;

import javax.swing.*;
import java.awt.*;

public class ExTextField extends JFrame{
    JPanel panel;
    JLabel label;
    JTextField textField;

    public ExTextField(){

        panel = new JPanel();

        panel.setLayout(new GridLayout(5, 1));

        label = new JLabel("Nome");

        textField = new JTextField("Fernando");
        textField.setBackground(Color.BLUE);
        textField.setSelectedTextColor(Color.CYAN);
        textField.setForeground(Color.BLACK);

        panel.add(textField);

        this.getContentPane().add(panel);

        setTitle("Exemplo JFrame com JButtons");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ExTextField();
    }

}
