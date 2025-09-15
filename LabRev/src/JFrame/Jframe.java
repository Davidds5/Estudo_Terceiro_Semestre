package JFrame;

public class Jframe extends javax.swing.JFrame{
    public Jframe(){
        setTitle("Exemplo JFrame");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Jframe jframe = new Jframe();
    }

}
