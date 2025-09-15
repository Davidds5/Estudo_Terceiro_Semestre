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
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(2, 2));
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);

        icone = new ImageIcon(Objects.requireNonNull(
                getClass().getResource("Documentos/Terceiro Semestre/Estudo_terceiro_Semestre/LabRev/src/JFrame/imagen.jpg.jpg")));


        label = new JLabel("Minha imagem:", icone, JLabel.CENTER);
        panel.add(label);


    }

    public static void main(String[] args) {
        new ExJLabel();
    }
}
