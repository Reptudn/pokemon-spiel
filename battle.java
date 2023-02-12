import javax.swing.*;
import java.awt.*;

public class battle {

    window w;
    battleMenu bm;
    int enemyAttackDam;
    boolean megastone = false;
    boolean hasMega = false;
    String enemy = "";
    String enemyTyp = "";
    String myTyp = "";
    public double myHP;
    double enemyHP;
    int myDamage;
    boolean initialised = false;
    String attack1 = "";
    String attack3 = "";

    public boolean hasWon = false;

    JButton enemyPok;

    public battle(battleMenu bm, window w) {
        this.bm = bm;
        this.w = w;
    }

    public String getEnemyPokemon(String pokemon) {

        double random = Math.random();

        if (pokemon == "Bisasam" || pokemon == "Glumanda" || pokemon == "Shiggy") {

            if (random >= 0 && random <= 0.33) {
                enemy = "Raupy";
            } else if (random > 0.33 && random <= 0.66) {
                enemy = "Taubsi";
            } else {
                enemy = "Hornliu";
            }

        } else if (pokemon == "Bisaknosp" || pokemon == "Glutexo" || pokemon == "Schillok") {

            if (random >= 0 && random <= 0.33) {
                enemy = "Golbat";
            } else if (random > 0.33 && random <= 0.66) {
                enemy = "Maschok";
            } else {
                enemy = "Nidorino";
            }

        } else if (pokemon == "Turtok" || pokemon == "Bisaflor" || pokemon == "Glurak") {

            if (random >= 0 && random <= 0.33) {
                enemy = "Lapras";
            } else if (random > 0.33 && random <= 0.66) {
                enemy = "Dragoran";
            } else {
                enemy = "Relaxo";
            }

        } else {
            if (random >= 0 && random <= 0.33) {
                enemy = "Zapdos";
            } else if (random > 0.33 && random <= 0.66) {
                enemy = "Lavados";
            } else {
                enemy = "Arktos";
            }
        }

        System.out.println("[!] returned '" + enemy + "'");
        return enemy;
    }

    public int enemyAttack(String pokemon) {

        double random = Math.random();

        if (pokemon == "Bisasam" || pokemon == "Glumanda" || pokemon == "Shiggy") {

            if (random >= 0 && random <= 0.5) {
                enemyAttackDam = 5;
            } else {
                enemyAttackDam = 2;
            }

        } else if (pokemon == "Bisaknosp" || pokemon == "Glutexo" || pokemon == "Schillok") {

            if (random >= 0 && random <= 0.33) {
                enemyAttackDam = 10;
            } else if (random > 0.33 && random <= 0.66) {
                enemyAttackDam = 7;
            } else {
                enemyAttackDam = 3;
            }

        } else if (pokemon == "Turtok" || pokemon == "Bisaflor" || pokemon == "Glurak") {

            if (random >= 0 && random <= 0.25) {
                enemyAttackDam = 17;
            } else if (random > 0.25 && random <= 0.5) {
                enemyAttackDam = 15;
            } else if (random > 0.5 && random <= 0.75) {
                enemyAttackDam = 11;
            } else {
                enemyAttackDam = 13;
            }

        } else {

            if (random >= 0 && random <= 0.25) {
                enemyAttackDam = 19;
            } else if (random > 0.25 && random <= 0.5) {
                enemyAttackDam = 16;
            } else if (random > 0.5 && random <= 0.75) {
                enemyAttackDam = 12;
            } else {
                enemyAttackDam = 2;
            }

        }

        System.out.println("[!] returned '" + enemyAttackDam + "' damage can do: Enemy (without multiplier)");
        return enemyAttackDam;

    }

    public boolean hasMegaStone() {

        double random = Math.random();

        if (hasMega == false) {
            if (random >= 0.5 && random <= 0.8) {
                System.out.println("[!] Megastone: returned 'true'");
                hasMega = true;
                w.megastone = true;
                return true;
            }

            System.out.println("[!] Megastone: returned 'false'");
            return false;
        } else {
            System.out.println("[!] Already has Megastone");
            return true;
        }
    }

    public String attacks(String pokemon) {

        String attack1 = "";

        if (pokemon == "Bisasam") {
            attack1 = "Rankenhieb";
            myDamage = 8;
            w.repaint();
            return attack1;

        } else if (pokemon == "Glumanda") {
            attack1 = "Glut";
            myDamage = 8;
            w.repaint();
            return attack1;

        } else if (pokemon == "Shiggy") {
            attack1 = "Blubber";
            myDamage = 8;
            w.repaint();
            return attack1;
        }

        return attack1;

    }

    public String attack3(String pokemon) {

        String attack3 = "";

        if (pokemon == "Bisaknosp") {
            attack3 = "Zerschneider";
            myDamage = 15;
            attack1 = "Rankenhieb";
            w.repaint();
            return attack3;

        } else if (pokemon == "Glutexo") {
            attack3 = "Feuerwirbel";
            myDamage = 16;
            attack1 = "Glut";
            w.repaint();
            return attack3;

        } else if (pokemon == "Schillok") {
            attack3 = "Aquaknarre";
            attack1 = "Blubber";
            myDamage = 14;
            w.repaint();
            return attack3;
        }

        return attack3;

    }

    public String attack4(String pokemon) {

        String attack4 = "";

        if (pokemon == "Bisaflor" || pokemon == "Mega Bisaflor") {
            attack4 = "Laubklinge";
            attack1 = "Rankenhieb";
            attack3 = "Zerschneider";
            w.repaint();
            myDamage = 22;
            return attack4;

        } else if (pokemon == "Glurak" || pokemon == "Mega Glurak") {
            attack4 = "Lohensturm";
            attack1 = "Glut";
            myDamage = 24;
            attack3 = "Feuerwirbel";
            w.repaint();
            return attack4;

        } else if (pokemon == "Turtok" || pokemon == "Mega Turtok") {
            attack4 = "Surfer";
            attack1 = "Blubber";
            attack3 = "Hydropumpe";
            attack3 = "Aquaknarre";
            w.repaint();
            myDamage = 21;
            return attack4;
        }

        return attack4;

    }

    public void enemyPokemon(String enemy, window w) {

        if (enemy == "Raupy") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/raupy.png"));

        } else if (enemy == "Hornliu") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/hornliu.png"));
            w.add(enemyPok);

        } else if (enemy == "Taubsi") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/taubsi.png"));
            w.add(enemyPok);

        } else if (enemy == "Nidorino") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/nidorino.png"));
            w.add(enemyPok);

        } else if (enemy == "Maschok") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/maschock.png"));
            w.add(enemyPok);

        } else if (enemy == "Golbat") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/golbat.png"));
            w.add(enemyPok);

        } else if (enemy == "Lapras") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/lapras.png"));
            enemyPok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/lapras.png").getImage().getScaledInstance(300,
                    300, Image.SCALE_DEFAULT)));
            w.add(enemyPok);

        } else if (enemy == "Relaxo") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/relaxo.png"));
            enemyPok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/relaxo.png").getImage().getScaledInstance(300,
                    300, Image.SCALE_DEFAULT)));
            w.add(enemyPok);

        } else if (enemy == "Dragoran") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/dragoran.png"));
            enemyPok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/dragoran.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
            w.add(enemyPok);

        } else if (enemy == "Arktos") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/legi/arktos.png"));
            enemyPok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/legi/arktos.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));

        } else if (enemy == "Lavados") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/legi/lavados.png"));
            enemyPok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/legi/lavados.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
        } else if (enemy == "Zapdos") {
            enemyPok = new JButton(new ImageIcon("images/pokemon/legi/zapdos.png"));
            enemyPok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/legi/zapdos.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
        } else {
            System.out.println("[!] Invalid enemy");
        }

        enemyPok.setBounds(600, 10, 300, 300);
        enemyPok.setBorderPainted(false);
        enemyPok.setBorder(null);
        enemyPok.setFocusPainted(false);
        enemyPok.setContentAreaFilled(false);

        w.add(enemyPok);

        System.out.println("[!] Pokemon '" + enemy + "' added as enemy");

        bm.repaint();
        w.repaint();

    }

    public void myPokemon(String pokemon, window w) {

        System.out.println("My Pokemon: " + pokemon);

        if (pokemon == "Bisasam") {
            w.add(bm.bisasam);
            bm.bisasam.setBounds(0, 175, 300, 300);
            bm.bisasam.setBorderPainted(false);
            bm.bisasam.setBorder(null);
            bm.bisasam.setFocusPainted(false);
            bm.bisasam.setContentAreaFilled(false);
        } else if (pokemon == "Glumanda") {
            w.add(bm.glumanda);
            bm.glumanda.setBounds(0, 175, 300, 300);
            bm.glumanda.setBorderPainted(false);
            bm.glumanda.setBorder(null);
            bm.glumanda.setFocusPainted(false);
            bm.glumanda.setContentAreaFilled(false);
        } else if (pokemon == "Shiggy") {
            w.add(bm.shiggy);
            bm.shiggy.setBounds(0, 175, 300, 300);
            bm.shiggy.setBorderPainted(false);
            bm.shiggy.setBorder(null);
            bm.shiggy.setFocusPainted(false);
            bm.shiggy.setContentAreaFilled(false);
        } else if (pokemon == "Glutexo") {
            w.add(bm.glutexo);
            bm.glutexo.setBounds(0, 175, 300, 300);
            bm.glutexo.setBorderPainted(false);
            bm.glutexo.setBorder(null);
            bm.glutexo.setFocusPainted(false);
            bm.glutexo.setContentAreaFilled(false);
        } else if (pokemon == "Schillok") {
            w.add(bm.schillok);
            bm.schillok.setBounds(0, 175, 300, 300);
            bm.schillok.setBorderPainted(false);
            bm.schillok.setBorder(null);
            bm.schillok.setFocusPainted(false);
            bm.schillok.setContentAreaFilled(false);
        } else if (pokemon == "Bisaknosp") {
            w.add(bm.bisaknosp);
            bm.bisaknosp.setBounds(0, 175, 300, 300);
            bm.bisaknosp.setBorderPainted(false);
            bm.bisaknosp.setBorder(null);
            bm.bisaknosp.setFocusPainted(false);
            bm.bisaknosp.setContentAreaFilled(false);
        } else if (pokemon == "Glurak") {
            w.add(bm.glurak);
            bm.glurak.setBounds(0, 175, 300, 300);
            bm.glurak.setBorderPainted(false);
            bm.glurak.setBorder(null);
            bm.glurak.setFocusPainted(false);
            bm.glurak.setContentAreaFilled(false);
        } else if (pokemon == "Turtok") {
            w.add(bm.turtok);
            bm.turtok.setBounds(0, 175, 300, 300);
            bm.turtok.setBorderPainted(false);
            bm.turtok.setBorder(null);
            bm.turtok.setFocusPainted(false);
            bm.turtok.setContentAreaFilled(false);
        } else if (pokemon == "Bisaflor") {
            w.add(bm.bisaflor);
            bm.bisaflor.setBounds(0, 175, 300, 300);
            bm.bisaflor.setBorderPainted(false);
            bm.bisaflor.setBorder(null);
            bm.bisaflor.setFocusPainted(false);
            bm.bisaflor.setContentAreaFilled(false);
        } else if (pokemon == "Mega Glurak") {
            w.add(bm.mglurak);
            System.out.println("adding: " + pokemon);
            bm.mglurak.setBounds(0, 175, 300, 300);
            bm.mglurak.setBorderPainted(false);
            bm.mglurak.setBorder(null);
            bm.mglurak.setFocusPainted(false);
            bm.mglurak.setContentAreaFilled(false);
            bm.mglurak.setIcon(new ImageIcon(new ImageIcon("images/pokemon/starter/mega-glurak.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
            w.teamrocket = true;
        } else if (pokemon == "Mega Bisaflor") {
            w.add(bm.mbisaflor);
            System.out.println("adding: " + pokemon);
            bm.mbisaflor.setBounds(0, 175, 300, 300);
            bm.mbisaflor.setBorderPainted(false);
            bm.mbisaflor.setBorder(null);
            bm.mbisaflor.setFocusPainted(false);
            bm.mbisaflor.setContentAreaFilled(false);
            bm.mbisaflor.setIcon(new ImageIcon(new ImageIcon("images/pokemon/starter/bisaflor_mega.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
            w.teamrocket = true;
        } else if (pokemon == "Mega Turtok") {
            w.add(bm.mturtok);
            System.out.println("adding: " + pokemon);
            bm.mturtok.setBounds(0, 175, 300, 300);
            bm.mturtok.setBorderPainted(false);
            bm.mturtok.setBorder(null);
            bm.mturtok.setFocusPainted(false);
            bm.mturtok.setContentAreaFilled(false);
            bm.mturtok.setIcon(new ImageIcon(new ImageIcon("images/pokemon/starter/mega-turtok.png").getImage()
                    .getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
            w.teamrocket = true;
        }

        else {
            System.out.println("[!] invalid Pokemon: " + pokemon);
        }

        w.repaint();
    }

    public boolean won() {

        System.out.println(enemyHP + ", " + myHP);
        return enemyHP <= 0;

    }

    public void damageCalc(String pokemon, String enemy, int myDamage) {

        double multiplier = 1;
        double damage = 0;
        scene s = new scene();

        enemyAttackDam = enemyAttack(pokemon);

        bm.enemyCurrentHP.setText(enemy + "'s Leben: " + String.valueOf(enemyHP));
        bm.myCurrentHP.setText(pokemon + "'s Leben: " + String.valueOf(myHP));
        bm.repaint();

        if (initialised == false) {

            initialised = true;
            // Typen zuweißen
            if (enemy == "Raupy" || enemy == "Hornliu") {
                enemyTyp = "Käfer";
                enemyHP = 20;
            } else if (enemy == "Taubsi") {
                enemyTyp = "Normal";
                enemyHP = 25;
            } else if (enemy == "Nidorino" || enemy == "Maschok" || enemy == "Golbat") {
                enemyHP = 45;
            } else if (enemy == "Lapras" || enemy == "Dragoran" || enemy == "Relaxo") {
                enemyHP = 80;
            } else {
                enemyHP = 95;
            }

            System.out.println("[!] Enemy Pokemon HP: " + enemyHP);

            if (pokemon == "Bisasam" || pokemon == "Bisaknosp" || pokemon == "Bisaflor") {
                myTyp = "Pflanze";

                if (pokemon == "Bisasam") {
                    myHP = 30;
                } else if (pokemon == "Bisaknosp") {
                    myHP = 50;
                } else {
                    myHP = 80;
                }

            } else if (pokemon == "Shiggy" || pokemon == "Schillok" || pokemon == "Turtok") {
                myTyp = "Wasser";

                if (pokemon == "Shiggy") {
                    myHP = 30;
                } else if (pokemon == "Schillok") {
                    myHP = 50;
                } else {
                    myHP = 80;
                }

            } else if (pokemon == "Glumanda" || pokemon == "Glutexo" || pokemon == "Glurak") {
                myTyp = "Feuer";

                if (pokemon == "Glumanda") {
                    myHP = 30;
                } else if (pokemon == "Glutexo") {
                    myHP = 50;
                } else {
                    myHP = 80;
                }

            } else {

                myHP = 100;

            }
        }

        System.out.println("[-] Multiplier:" + multiplier);
        System.out.println("[-] " + pokemon + " HP:" + myHP);
        System.out.println("[-] " + enemy + " HP:" + enemyHP);

        // effektivitäten
        if (enemyTyp == "Käfer") {
            if (myTyp == "Feuer") {
                multiplier = 1.5;
            } else {
                multiplier = 1;
            }
        } else if (enemyTyp == "Normal") {
            multiplier = 1;
        }

        // damage
        damage = (double) enemyAttackDam * multiplier;
        myHP -= damage;
        enemyHP -= myDamage * multiplier;

        System.out.println("[-] Multiplier:" + multiplier);
        System.out.println("[-] " + pokemon + " HP:" + myHP);
        System.out.println("[-] " + enemy + " HP:" + enemyHP);

        bm.enemyCurrentHP.setText(enemy + "'s Leben: " + String.valueOf(enemyHP));
        bm.myCurrentHP.setText(pokemon + "'s Leben: " + String.valueOf(myHP));
        bm.repaint();

        // Player lost
        if (myHP <= 0) {

            JOptionPane.showMessageDialog(null, "Du hast verloren!");
            bm.enemyCurrentHP.setText(pokemon + "'s Leben: 0");
            for (int i = w.getContentPane().getComponents().length - 1; i >= 0; i--) {
                w.getContentPane().remove(w.getContentPane().getComponents()[i]);
            }

            if (w.pokemon == "Glutexo") {
                w.pokemon = "Glumanda";
            } else if (w.pokemon == "Glurak") {
                w.pokemon = "Glutexo";
            } else if (w.pokemon == "Schillok") {
                w.pokemon = "Schiggy";
            } else if (w.pokemon == "Turtok") {
                w.pokemon = "Schillok";
            } else if (w.pokemon == "Bisaknosp") {
                w.pokemon = "Bisasam";
            } else {
                w.pokemon = "Bisaknosp";
            }

            System.out.println("[!] Pokemon is set back to: '" + pokemon + "'");
            w.pokemonIsSelected = false;
            System.out.println("[!] Pokemon is selected? : '" + w.pokemonIsSelected + "'");

            w.repaint();
            w.b = this;

            dialog d = new dialog();

            if (w.teamrocket == true) {
                System.out.println("Lost Rocket fight");
                JOptionPane.showMessageDialog(null, "DU HAST VERLOREN!");
                JOptionPane.showMessageDialog(null, "Starte das Spiel neu um es nocheinmal zu versuchen");
                System.exit(0);
            } else {

                    s.removeAllComponents(w);
            }
            s.clearMouseListeners(w.eichdialog);

            s.gotoNextScene(w);

            // Player won
        } else if (enemyHP <= 0) {

            bm.enemyCurrentHP.setText(enemy + "'s Leben: 0");
            w.repaint();
            hasWon = true;
            megastone = hasMegaStone();

            if (megastone == false) {
                JOptionPane.showMessageDialog(null, "Du hast gewonnen!");
            } else {
                JOptionPane.showMessageDialog(null, "Du hast gewonnen und einen Megastein erhalten!");
            }

            w.b = this;
            w.getContentPane().removeAll();
            s.clearMouseListeners(w.eichdialog);
            w.repaint();

            dialog d = new dialog();

            s.removeAllComponents(w);

            s.gotoNextScene(w);

        }

    }

}
