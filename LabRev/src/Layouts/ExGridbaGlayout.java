package Layouts;

import java.awt.*;

public class ExGridbaGlayout extends Frame{
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;

    public void AdicionaItem(int Linha, int Coluna, int Largura, int Altura, int EscalarX, int EsclarY,
                             Component component){
        GridBagConstraints ItemGrade = new GridBagConstraints();
        ItemGrade.gridx = Coluna;
        ItemGrade.gridy = Linha;
        ItemGrade.gridwidth = Largura;
        ItemGrade.gridheight = Altura;
        ItemGrade.weighty = EsclarY;
        ItemGrade.weightx = EscalarX;
        ItemGrade.fill = GridBagConstraints.BOTH;
        ItemGrade.anchor = GridBagConstraints.CENTER;
        this.add(component, ItemGrade);
    }
    public void ExecutaGrid(){
        bt1 = new Button("Botao 1");
        bt2 = new Button("Botao 2");
        bt3 = new Button("Botao 3");
        bt4 = new Button("Botao 4");
        bt5 = new Button("Botao 5");
        bt6 = new Button("Botao 6");
        bt7 = new Button("Botao 7");
        bt8 = new Button("Botao 8");
        setSize(500, 300);
        setLocation(200, 200);
        setLayout(new GridBagLayout());
        AdicionaItem(0, 0, 4, 1, 0, 0,bt1);
        AdicionaItem(1, 0, 1, 1, 0, 0,bt2);
        AdicionaItem(1, 1, 1, 1,0, 0,bt3);
        AdicionaItem(1, 2, 1, 1, 0, 0,bt4);
        AdicionaItem(1, 3, 1, 1, 0, 0,bt5);
        AdicionaItem(2, 0, 1, 1, 0, 1,bt6);
        AdicionaItem(3, 0, 1, 1,0, 1, bt7);
        AdicionaItem(2, 1, 3, 4, 1, 1,bt8);
        setVisible(true);

        setVisible(true);
        setTitle("Exemplo GridBaLayout");

    }

    public static void main(String[] args) {
       ExGridbaGlayout exGridbaGlayout = new ExGridbaGlayout();
       exGridbaGlayout.ExecutaGrid();

    }
}
