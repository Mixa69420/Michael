import javax.swing.*;
import java.awt.*;

public class Bg extends JComponent {
    public final static int breite = 75;

    public Bg() {

        ImageIcon lauefer = new ImageIcon("C:\\Users\\vikto\\IdeaProjects\\Schach\\res\\lauefer.png");
        JLabel j1 = new JLabel(lauefer);


        //Obere Buchstaben
        JLabel lb1 = new JLabel(" a       b       c       d        e       f        g       h");
        lb1.setBounds(100, 435, 915, 935);
        lb1.setForeground(Color.BLACK);
        add(lb1);
        lb1.setFont(new Font("Arial", Font.PLAIN, 40));


        //Untere Buchstaben
        JLabel lb2 = new JLabel(" A       B      C       D      E       F       G      H");
        lb2.setBounds(100, -425, 915, 935);
        lb2.setForeground(Color.BLACK);
        add(lb2);
        lb2.setFont(new Font("Arial", Font.PLAIN, 40));

        int einsBis8 = 1;
        for (int i = -340; i <= 360; i += 100) {
            //Linke Zahlen
            JLabel lb4 = new JLabel("" + einsBis8);
            lb4.setBounds(40, i, 915, 935);
            lb4.setForeground(Color.BLACK);
            add(lb4);
            lb4.setFont(new Font("Arial", Font.PLAIN, 40));

            //Rechte Zahlen
            JLabel lb3 = new JLabel("" + einsBis8);
            lb3.setBounds(890, i, 915, 935);
            lb3.setForeground(Color.BLACK);
            add(lb3);
            lb3.setFont(new Font("Arial", Font.PLAIN, 40));
            einsBis8++;



        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.decode("#f7eed7"));

        //Schach Feld

        /*reihe 1
        g2.fillRect(50,50,100,100);
        g2.fillRect(50,250,100,100);
        g2.fillRect(50,450,100,100);
        g2.fillRect(50,650,100,100);

        //reihe 2
        g2.fillRect(150,150,100,100);
        g2.fillRect(150,350,100,100);
        g2.fillRect(150,550,100,100);
        g2.fillRect(150,750,100,100);

        //reihe 3
        g2.fillRect(250,50,100,100);
        g2.fillRect(250,250,100,100);
        g2.fillRect(250,450,100,100);
        g2.fillRect(250,650,100,100);

        //reihe 4
        g2.fillRect(350,150,100,100);
        g2.fillRect(350,350,100,100);
        g2.fillRect(350,550,100,100);
        g2.fillRect(350,750,100,100);

        //reihe 5
        g2.fillRect(450,50,100,100);
        g2.fillRect(450,250,100,100);
        g2.fillRect(450,450,100,100);
        g2.fillRect(450,650,100,100);

        //reihe 6
        g2.fillRect(550,150,100,100);
        g2.fillRect(550,350,100,100);
        g2.fillRect(550,550,100,100);
        g2.fillRect(550,750,100,100);

        //reihe 7
        g2.fillRect(650,50,100,100);
        g2.fillRect(650,250,100,100);
        g2.fillRect(650,450,100,100);
        g2.fillRect(650,650,100,100);

        //reihe 8
        g2.fillRect(750,150,100,100);
        g2.fillRect(750,350,100,100);
        g2.fillRect(750,550,100,100);
        g2.fillRect(750,750,100,100);*/

        int position = 800 + breite;
        int hoehe = 800 + breite * 2;

        for (int x = breite; x <= breite + 600; x += 200) {
            for (int y = breite; y <= breite + 600; y += 200) {
                g2.fillRect(x, y, 100, 100);
            }
        }
        for (int x = breite + 100; x <= breite + 700; x += 200) {
            for (int y = breite + 100; y <= breite + 700; y += 200) {
                g2.fillRect(x, y, 100, 100);
            }
        }


        //Rahmen definieren
        Graphics2D g3 = (Graphics2D) g;
        g3.setColor(Color.decode("#615639"));

        //links/rechts
        g3.fillRect(0, 0, breite, hoehe);
        g3.fillRect(position, 0, breite, hoehe);

        //oben/unten
        g3.fillRect(0, 0, hoehe, breite);
        g3.fillRect(0, position, hoehe, breite);

        Graphics2D g4 = (Graphics2D) g;
        g3.setColor(Color.decode("#000000"));

        for (int x = breite; x <= breite + 600; x += 200) {
            for (int y = breite; y <= breite + 600; y += 200) {
                g4.drawRect(x, y, 100, 100);
            }
        }
        for (int x = breite + 100; x <= breite + 700; x += 200) {
            for (int y = breite + 100; y <= breite + 700; y += 200) {
                g4.drawRect(x, y, 100, 100);
            }
        }
        g4.drawRect(breite, breite, 800, 800);


    }
}