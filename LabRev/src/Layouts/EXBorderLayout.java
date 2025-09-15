package Layouts;

import java.awt.*;

public class EXBorderLayout {
    public static void main(String[] args) {
        Frame minhajanela = new Frame("Exemplo de Border Layout");

        Button bt1 = new Button("Menu 1");
        Button bt2 = new Button("Menu 2");
        Button bt3 = new Button("Menu 3");
        Button bt4 = new Button("Menu 4");
        Button bt5 = new Button("Menu 5");


        minhajanela.setSize(600, 400);
        minhajanela.setLocation(200, 200);

        BorderLayout borderLayout = new BorderLayout();
        minhajanela.setLayout(borderLayout);

        minhajanela.add(bt1, BorderLayout.NORTH);
        minhajanela.add(bt2, BorderLayout.WEST);
        minhajanela.add(bt3, BorderLayout.SOUTH);
        minhajanela.add(bt4, BorderLayout.EAST);
        minhajanela.add(bt5, BorderLayout.CENTER);

        minhajanela.setVisible(true);
    }
}
