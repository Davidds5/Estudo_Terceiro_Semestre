package JFrame;

import javax.swing.*;
import java.awt.*;

public class ExJList extends Jframe{
    JPanel panel;
    JLabel label;
    javax.swing.JList list;

    public ExJList(){
        panel = new JPanel();

        panel.setLayout(new GridLayout(5, 1));
        label = new JLabel("Time");
        panel.add(label);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Sao Paulo");
        listModel.addElement("Santos");
        listModel.addElement("Bahia");

        list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        JScrollPane jScrollPane = new JScrollPane(list);

        panel.add(jScrollPane);

        this.getContentPane().add(panel);

        setTitle("Exemplo JFrame com JButtons");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ExJList();
    }

}
