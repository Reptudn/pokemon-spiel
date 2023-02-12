import java.awt.*;
import javax.swing.*;

public class battleMenu extends JPanel {

    JButton attack1 = new JButton();
    JButton attack2 = new JButton("Tackle");
    JButton attack3 = new JButton();
    JButton attack4 = new JButton();
    JLabel myCurrentHP = new JLabel();
    JLabel enemyCurrentHP = new JLabel();

    JButton glumanda = new JButton(new ImageIcon("images/pokemon/starter/glumanda.png"));
    JButton shiggy = new JButton(new ImageIcon("images/pokemon/starter/shiggy.png"));
    JButton bisasam = new JButton(new ImageIcon("images/pokemon/starter/bisasam.png"));

    JButton glutexo = new JButton(new ImageIcon("images/pokemon/starter/glutexo.png"));
    JButton schillok = new JButton(new ImageIcon("images/pokemon/starter/schillok.png"));
    JButton bisaknosp = new JButton(new ImageIcon("images/pokemon/starter/bisaknosp.png"));

    JButton nidorino = new JButton(new ImageIcon("images/pokemon/nidorino.png"));
    JButton maschock = new JButton(new ImageIcon("images/pokemon/maschock.png"));
    JButton golbat = new JButton(new ImageIcon("images/pokemon/golbat.png"));

    JButton lapras = new JButton(new ImageIcon("images/pokemon/lapras.png"));
    JButton dragoran = new JButton(new ImageIcon("images/pokemon/dragoran.png"));
    JButton relaxo = new JButton(new ImageIcon("images/pokemon/relaxo.png"));

    JButton glurak = new JButton(new ImageIcon("images/pokemon/starter/glurak.png"));
    JButton turtok = new JButton(new ImageIcon("images/pokemon/starter/turtok.png"));
    JButton bisaflor = new JButton(new ImageIcon("images/pokemon/starter/bisaflor.png"));

    JButton mglurak = new JButton(new ImageIcon("images/pokemon/starter/mega-glurak.png"));
    JButton mturtok = new JButton(new ImageIcon("images/pokemon/starter/mega-turtok.png"));
    JButton mbisaflor = new JButton(new ImageIcon("images/pokemon/starter/bisaflor_mega.png"));

    JButton zapdos = new JButton(new ImageIcon("images/pokemon/legi/zapdos.png"));
    JButton arktos = new JButton(new ImageIcon("images/pokemon/legi/arktos.png"));
    JButton lavados = new JButton(new ImageIcon("images/pokemon/legi/lavados.png"));


    // private int myDamage;

    JButton back;

    public void setMenu(String pokemon, window w, String enemy) {

        battle b = new battle(this, w);

        JButton attackMenu = new JButton("Attacken");
        JButton run = new JButton("Flüchten");
        back = new JButton("Back");
        w.add(attackMenu);
        w.add(run);
        attackMenu.setBounds(20, 500, 250, 75);
        attackMenu.setBackground(Color.PINK);
        run.setBounds(300, 500, 250, 75);
        run.setBackground(Color.yellow);

        myCurrentHP.setBounds(10, 10, 150, 40);
        enemyCurrentHP.setBounds(500, 10, 150, 40);
        enemyCurrentHP.setText(enemy + "'s Leben: FULL");
        myCurrentHP.setText(pokemon + "'s Leben: FULL");
        w.repaint();

        run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, "Nah bro!");
            }

        });

        if (pokemon == "Bisasam" || pokemon == "Glumanda" || pokemon == "Shiggy") {

            attackMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    w.add(attack1);
                    w.add(attack2);
                    w.add(back);
                    w.add(myCurrentHP);
                    w.add(enemyCurrentHP);
                    w.remove(attackMenu);
                    w.remove(run);
                    attack1.setText(b.attacks(pokemon));
                    w.repaint();
                }

            });

            w.repaint();

        } else if (pokemon == "Schillok" || pokemon == "Glutexo" || pokemon == "Bisaknosp") {

            attackMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    w.add(attack1);
                    w.add(attack2);
                    w.add(attack3);
                    w.add(myCurrentHP);
                    w.add(enemyCurrentHP);
                    w.add(back);
                    w.remove(attackMenu);
                    w.remove(run);
                    attack1.setText(b.attack1);
                    attack3.setText(b.attack3(pokemon));
                    w.repaint();
                }

            });

        } else if (pokemon == "Turtok" || pokemon == "Bisaflor" || pokemon == "Glurak") {

            attackMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    w.add(attack1);
                    w.add(attack2);
                    w.add(attack3);
                    w.add(attack4);
                    w.add(myCurrentHP);
                    w.add(enemyCurrentHP);
                    w.add(back);
                    w.remove(attackMenu);
                    w.remove(run);
                    attack1.setText(b.attacks(pokemon));
                    attack3.setText(b.attack3(pokemon));
                    attack4.setText(b.attack4(pokemon));
                    w.repaint();
                }

            });

            
        }

        else if (pokemon == "Mega Turtok" || pokemon == "Mega Bisaflor" || pokemon == "Mega Glurak") {

            attackMenu.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    w.add(attack1);
                    w.add(attack2);
                    w.add(attack3);
                    w.add(attack4);
                    w.add(myCurrentHP);
                    w.add(enemyCurrentHP);
                    w.add(back);
                    w.remove(attackMenu);
                    w.remove(run);
                    attack1.setText(b.attacks(pokemon));
                    attack3.setText(b.attack3(pokemon));
                    attack4.setText(b.attack4(pokemon));
                    w.repaint();
                }

            });
        }

        else {
            System.out.println("[!] Invalid Pokemon '" + pokemon + "'");
        }

        back.setBounds(570, 500, 200, 45);
        attack1.setBounds(20, 500, 250, 45);
        attack2.setBounds(300, 500, 250, 45);
        attack3.setBounds(20, 555, 250, 45);
        attack4.setBounds(300, 555, 250, 45);

        attack1.setFont(new Font("classic-roman", Font.PLAIN, 20));
        attack2.setFont(new Font("classic-roman", Font.PLAIN, 20));
        attack3.setFont(new Font("classic-roman", Font.PLAIN, 20));
        attack4.setFont(new Font("classic-roman", Font.PLAIN, 20));
        attack1.setBackground(Color.ORANGE);
        attack2.setBackground(Color.ORANGE);
        attack3.setBackground(Color.ORANGE);
        attack4.setBackground(Color.ORANGE);
        w.repaint();

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w.remove(attack1);
                w.remove(attack2);
                w.remove(attack3);
                w.remove(attack4);
                w.remove(back);
                w.add(attackMenu);
                w.add(run);
                w.repaint();
            }
        });

        attack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b.damageCalc(pokemon, enemy, 4);

            }
        });

        attack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b.damageCalc(pokemon, enemy, 7);

            }
        });

        attack3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b.damageCalc(pokemon, enemy, 15);

            }
        });

        attack4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b.damageCalc(pokemon, enemy, 20);

            }
        });

    }

}
