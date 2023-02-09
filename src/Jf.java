import javax.swing.*;
import java.awt.*;

public class Jf {

    public String schwarz = "#000000";
    public String rot = "#823737";
    public String standart = "#241a00";
    public String standart2 = "#324535";

    public Jf() {
        JFrame screen = new JFrame("Schach");
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setPreferredSize(new Dimension(Bg.breite * 2 + 815, Bg.breite * 2 + 835));
        //screen.setPreferredSize(new Dimension(815, 835)); // Zum Testen vom Schachfeld ohne Rahmennudeln
        screen.setResizable(false);
        screen.getContentPane().setBackground(Color.decode(standart));
        screen.pack();
        screen.setVisible(true);
        screen.add(new Bg());


    }
}
