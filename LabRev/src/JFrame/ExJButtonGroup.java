package JFrame;

import javax.swing.*;
import java.awt.*;

public class ExJButtonGroup extends JFrame {
    JPanel panel;
    JLabel label;
    javax.swing.JRadioButton rb1;
    javax.swing.JRadioButton rb2;
    ButtonGroup group;

    public ExJButtonGroup() {

        panel = new JPanel();

        panel.setLayout(new GridLayout(5, 1));
        label = new JLabel("Sexo");
        panel.add(label);

        rb1 = new javax.swing.JRadioButton("Masculino");
        panel.add(rb1);

        rb2 = new javax.swing.JRadioButton("Feminino");
        panel.add(rb2);

        group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        this.getContentPane().add(panel);

        setTitle("Exemplo JFrame com JButtons");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ExJButtonGroup();
    }

}
