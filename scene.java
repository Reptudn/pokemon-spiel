import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class scene {

    battle b;

    public void clearMouseListeners(JButton c) {

        for (ActionListener al : c.getActionListeners()) {
            c.removeActionListener(al);
        }
        for (MouseListener al : c.getMouseListeners()) {
            c.removeMouseListener(al);
        }

    }

    public void initEich(window w) {

        removeAllComponents(w);

        w.getContentPane().setBackground(new Color(100, 100, 200));

        w.add(w.eichPic);

        w.eichPic.setBorder(null);
        w.eichPic.setBounds(20, 10, 200, 700);

        w.add(w.eichdialog);
        w.eichdialog.setBounds(275, 65, 710, 170);
        w.eichdialog.setBackground(Color.GRAY);
        // w.eichdialog.setText("Hallo ich bin Professor Eich.");

        w.eichdialog.setBorder(null);
        w.eichdialog.setContentAreaFilled(true);
        w.eichdialog.setFont(new Font("arial", Font.PLAIN, 20));

        w.repaint();

    }

    public void removeAllComponents(window w) {
        System.out.println(">>> Removing everything from Window");
        w.getContentPane().removeAll();
        w.repaint();
    }

    public void gotoNextScene(window w) {

        int i = 0;

        dialog d = new dialog();
        scene s = new scene();

        removeAllComponents(w);
        s.clearMouseListeners(w.eichdialog);

        System.out.println("Pokemon: " + w.pokemon);

        if (w.b.won()) {

            if(w.teamrocket == true){
                w.end();
            } else {
            if (w.pokemon == "Bisasam" || w.pokemon == "Shiggy" || w.pokemon == "Glumanda") {
                System.out.println(">>> goto Scene 2");
                w.scene2(w.pokemon);
            } else if (w.pokemon == "Bisaknosp" || w.pokemon == "Schillok" || w.pokemon == "Glutexo") {
                System.out.println(">>> goto Scene 4");
                w.scene4(w.pokemon);
            } else if (w.pokemon == "Bisaflor" || w.pokemon == "Turtok" || w.pokemon == "Glurak") {

                if (i == 0) {

                    System.out.println(">>> goto Scene 5");
                    i = 1;
                    System.out.println("i: " + i);
                    w.scene6(w.pokemon);

                } else {
                    w.scene6(w.pokemon);
                }
            }
        }

        } else {

            if (w.teamrocket == true) {

                System.out.println("TeamRocket: " + w.teamrocket);

                if (w.pokemon == "Mega Glurak") {
                    w.pokemon = "Glumanda";
                } else if (w.pokemon == "Mega Turtok") {
                    w.pokemon = "Schiggy";
                } else {
                    w.pokemon = "Bisasam";
                }

                s.removeAllComponents(w);
                s.clearMouseListeners(w.eichdialog);
                w.firstBattle(w.pokemon);
            }

            else if (w.eichKampf == true) {

                if (w.pokemon == "Bisasam" || w.pokemon == "Shiggy" || w.pokemon == "Glumanda") {
                    System.out.println(">>> goto Scene 2");
                    w.scene2(w.pokemon);
                } else if (w.pokemon == "Bisaknosp" || w.pokemon == "Schillok" || w.pokemon == "Glutexo") {
                    System.out.println(">>> goto Scene 4");
                    w.scene6(w.pokemon);
                } else if (w.pokemon == "Bisaflor" || w.pokemon == "Turtok" || w.pokemon == "Glurak") {

                    if (i == 0) {

                        System.out.println(">>> goto Scene 5");
                        i = 1;
                        System.out.println("i: " + i);
                        w.scene6(w.pokemon);

                    } else {
                        w.scene6(w.pokemon);
                    }
                }
            } else {
                w.scene2(w.pokemon);
            }
        }

    }

}
