package JFrame;

import javax.swing.*;
import java.awt.*;

public class ExJComboBox extends Jframe{
    JPanel panel;
    JLabel label;
    JComboBox comboBox;

    public ExJComboBox(){

        panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));
        label = new JLabel("Time");

        panel.add(label);

        String[] times = {"Santos", "Palmeiras", "Sao Paulo", "Bahia" };
        comboBox = new JComboBox<>(times);
        panel.add(comboBox);

        this.getContentPane().add(panel);

        setTitle("Exemplo JFrame com JComboBox");
        setSize(200 ,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ExJComboBox();
    }
}

