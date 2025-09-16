package JFrame;

import javax.swing.*;
import java.awt.*;

public class ExJTable extends JFrame {
    JPanel panel;
    JTable table;

    public ExJTable(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));

        String columnNames[] = {"Coluna 1" , "Coluna 2", "Coluna 3"};

        String dataValues[][] = {
                {"12", "234", "67"},
                {"-123", "43", "854"},
                {"93", "89,9", "109"},
                {"279", "9033", "3092"}
        };

        table = new JTable(dataValues, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);

        this.getContentPane().add(panel);

        setTitle("Exemplo JFrame com JButtons");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new ExJTable();
    }
}
