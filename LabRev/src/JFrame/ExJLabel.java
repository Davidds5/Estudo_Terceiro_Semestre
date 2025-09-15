package JFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class ExJLabel extends JFrame {
    JPanel panel;
    JLabel label;
    Icon icone;

    public ExJLabel() {
        setTitle("Exemplo JFrame com um JLabel com ícone");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(2, 2));
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);

        // carrega a imagem que está em src/JFrame/imagen.jpg
        icone = new ImageIcon(Objects.requireNonNull(
                getClass().getResource("/JFrame/imagen.jpg")));

        // adiciona o JLabel com a imagem
        label = new JLabel("Minha imagem:", icone, JLabel.CENTER);
        panel.add(label);

        setVisible(true); // só deixa visível depois de tudo montado
    }

    public static void main(String[] args) {
        new ExJLabel();
    }
}
