import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;

public class window extends JFrame {

    JFrame gameWindow = new JFrame();

    // Professor Eich
    JLabel eichPic = new JLabel(new ImageIcon("images/people/prof_eich.png"));
    JButton eichdialog = new JButton();

    // Homescreen
    JLabel pokemonGame = new JLabel("", SwingConstants.CENTER);
    JLabel pokemonPic = new JLabel();
    JButton startGame = new JButton("Start");
    JButton quitGame = new JButton("Beenden");

    // NameSet and select Pokemon Scene
    JTextField setName = new JTextField();
    JButton glumanda = new JButton(new ImageIcon("images/pokemon/starter/glumanda.png"));
    JButton shiggy = new JButton(new ImageIcon("images/pokemon/starter/shiggy.png"));
    JButton bisasam = new JButton(new ImageIcon("images/pokemon/starter/bisasam.png"));
    public String pokemon;
    public boolean pokemonIsSelected = false;
    public String playerName;

    // First Battle
    String enemy;
    JButton attack1 = new JButton();
    JButton attack2 = new JButton("Tackle");
    JButton attack3 = new JButton();
    JButton attack4 = new JButton();
    JLabel myCurrentHP = new JLabel();
    JLabel enemyCurrentHP = new JLabel();

    JButton glutexo = new JButton(new ImageIcon("images/pokemon/starter/glutexo.png"));
    JButton schillok = new JButton(new ImageIcon("images/pokemon/starter/schillok.png"));
    JButton bisaknosp = new JButton(new ImageIcon("images/pokemon/starter/bisaknosp.png"));

    JButton glurak = new JButton(new ImageIcon("images/pokemon/starter/glurak.png"));
    JButton turtok = new JButton(new ImageIcon("images/pokemon/starter/turtok.png"));
    JButton bisaflor = new JButton(new ImageIcon("images/pokemon/starter/bisaflor.png"));

    JButton nidorino = new JButton(new ImageIcon("images/pokemon/starter/nidorino.png"));
    JButton maschock = new JButton(new ImageIcon("images/pokemon/starter/maschock.png"));
    JButton golbat = new JButton(new ImageIcon("images/pokemon/starter/golbat.png"));

    JButton mglurak = new JButton(new ImageIcon("images/pokemon/starter/mega-glurak.png"));
    JButton mturtok = new JButton(new ImageIcon("images/pokemon/starter/mega-turtok.png"));
    JButton mbisaflor = new JButton(new ImageIcon("images/pokemon/starter/bisaflor_mega.png"));

    JButton zapdos = new JButton(new ImageIcon("images/pokemon/legi/zapdos.png"));
    JButton arktos = new JButton(new ImageIcon("images/pokemon/legi/arktos.png"));
    JButton lavados = new JButton(new ImageIcon("images/pokemon/legi/lavados.png"));

    JLabel behance = new JLabel(new ImageIcon("images/trainer/behance.png"));
    JLabel sabrina = new JLabel(new ImageIcon("images/trainer/sabrina.png"));
    JLabel rocket = new JLabel(new ImageIcon("images/people/team-rocket.png"));

    JLabel pokal = new JLabel(new ImageIcon("images/items/pokal.png"));

    battle firstBattle;
    battle b;

    public boolean megastone;

    public boolean eichKampf = false;

    public boolean teamrocket = false;

    JOptionPane closeConfirm = new JOptionPane();

    public window() {

        super("PokémonGame");

        scene s = new scene();

        s.clearMouseListeners(eichdialog);
        s.removeAllComponents(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(1080, 720);

        ImageIcon icon = new ImageIcon("images/icons/pokemonicon.png");
        window.setIconImage(icon);

        pokemonGame.setIcon(new ImageIcon(new ImageIcon("images/icons/pokemonicon.png").getImage()
                .getScaledInstance(440, 110, Image.SCALE_DEFAULT)));
        pokemonGame.setFont(new Font("classic-roman", Font.PLAIN, 60));

        if (gameWindow != null) {
            startScreen();
        } else {
            System.err.println("[!] Something went wrong!");
            System.exit(0);
        }

    }

    private static void setIconImage(ImageIcon icon) {
    }

    public void startScreen() {

        setTitle("PokémonGame: Home");
        setLayout(null);
        getContentPane().setBackground(Color.BLACK);

        add(pokemonGame);
        add(pokemonPic);
        add(startGame);
        add(quitGame);

        pokemonGame.setBounds(1080 / 2 - (500 / 2), 100, 500, 110);
        startGame.setBounds(1080 / 2 - (200 / 2), 310, 200, 45);
        quitGame.setBounds(1080 / 2 - (200 / 2), 415, 200, 45);

        startGame.setBackground(Color.GREEN);
        quitGame.setBackground(Color.RED);
        repaint();

        quitGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                System.out.println("[!] asking if game should be really closed");

                int n = JOptionPane.showConfirmDialog(null, "Bist du sicher, dass du das Spiel schließen möchtest?", "",
                        JOptionPane.YES_NO_OPTION);

                if (n == JOptionPane.YES_OPTION) {
                    System.out.println("[!] confirmed closing game");
                    System.out.println("[!] closing game");
                    System.exit(0);
                } else {
                    System.out.println("[!] canceled closing game");
                }

            }
        });

        startGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                System.out.println("[-] started game");
                setName();
            }
        });
    }

    public void setName() {

        setTitle("PokémonGame: Choose your Pokemon");

        scene s = new scene();
        s.initEich(this);

        dialog d = new dialog();
        d.scene1(this);

    }

    public void pokemonSelected() {

        remove(bisasam);
        remove(glumanda);
        remove(shiggy);
        repaint();

        eichdialog.setText(
                "<html> Um dein erstes Pokémon einmal auszuprobieren <br> kannst du einmal gegen mich kämpfen</html>");

        eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remove(eichPic);
                remove(eichdialog);
                remove(bisasam);
                remove(glumanda);
                remove(shiggy);
                repaint();

                System.out.println(">>> First Battle");
                firstBattle(pokemon);

            }
        });
    }

    public void firstBattle(String pokemon) {

        setTitle("PokémonGame: Battle 1");

        System.out.println("[!] Initialized: first Battle");

        battleMenu menu = new battleMenu();
        firstBattle = new battle(menu, this);
        enemy = firstBattle.getEnemyPokemon(pokemon);

        // Enemy Pokemon
        firstBattle.enemyPokemon(enemy, this);

        // My Pokemon
        firstBattle.myPokemon(pokemon, this);

        menu.setMenu(pokemon, this, enemy);

        // scene2(pokemon);

    }

    public void scene2(String pokemon) {

        setTitle("PokémonGame");

        dialog d = new dialog();
        scene s = new scene();
        // d.b = firstBattle;

        d.scene2(this, s);

    }

    public void scene3(String pokemon) {

        scene s = new scene();
        dialog d = new dialog();

        s.initEich(this);

        remove(eichPic);

        add(behance);
        behance.setBounds(20, 10, 200, 700);
        behance.setBorder(null);
        behance.setIcon(new ImageIcon(new ImageIcon("images/trainer/behance.png").getImage().getScaledInstance(400, 600,
                Image.SCALE_DEFAULT)));
        repaint();

        d.scene3(this);

    }

    public void secondBattle(String pokemon) {

        System.out.println("[!] Second Battle");

        setTitle("PokémonGame: Battle 2");

        scene s = new scene();

        battleMenu bm = new battleMenu();

        s.removeAllComponents(this);

        firstBattle = new battle(bm, this);
        enemy = firstBattle.getEnemyPokemon(pokemon);

        bm.setMenu(pokemon, this, b.getEnemyPokemon(pokemon));

        // Enemy Pokemon
        firstBattle.enemyPokemon(enemy, this);

        // My Pokemon
        firstBattle.myPokemon(pokemon, this);

    }

    public void scene4(String pokemon) {

        setTitle("PokémonGame");

        scene s = new scene();

        dialog d = new dialog();

        battleMenu bm = new battleMenu();

        s.removeAllComponents(this);

        s.initEich(this);

        remove(eichPic);

        add(behance);
        behance.setBounds(20, 10, 200, 700);
        behance.setBorder(null);
        behance.setIcon(new ImageIcon(new ImageIcon("images/trainer/behance.png").getImage().getScaledInstance(500, 600,
                Image.SCALE_DEFAULT)));
        repaint();

        s.clearMouseListeners(eichdialog);

        b.hasWon = false;

        d.scene4(this);

    }

    public void scene5(String pokemon) {

        scene s = new scene();

        dialog d = new dialog();

        b.hasWon = false;

        s.removeAllComponents(this);
        s.clearMouseListeners(eichdialog);

        s.initEich(this);

        remove(eichPic);
        remove(behance);

        System.out.println("[!] Added Sabrina");
        add(sabrina);
        sabrina.setBounds(20, 10, 200, 700);
        sabrina.setBorder(null);
        sabrina.setIcon(new ImageIcon(new ImageIcon("images/trainer/sabrina.png").getImage().getScaledInstance(400, 600,
                Image.SCALE_DEFAULT)));
        repaint();

        eichdialog.setText("");

        repaint();

        d.scene5(this);

    }

    public void thirdBattle(String pokemon) {

        System.out.println("[!] Third Battle");

        setTitle("PokémonGame: Battle 3");

        scene s = new scene();

        battleMenu bm = new battleMenu();

        s.removeAllComponents(this);

        firstBattle = new battle(bm, this);
        enemy = firstBattle.getEnemyPokemon(pokemon);

        bm.setMenu(pokemon, this, b.getEnemyPokemon(pokemon));

        // Enemy Pokemon
        firstBattle.enemyPokemon(enemy, this);

        // My Pokemon
        firstBattle.myPokemon(pokemon, this);

    }

    public void scene6(String pokemon) {

        scene s = new scene();

        dialog d = new dialog();

        b.hasWon = false;

        s.removeAllComponents(this);
        s.clearMouseListeners(eichdialog);

        s.initEich(this);

        remove(eichPic);
        remove(behance);

        System.out.println("[!] Added Sabrina");
        add(sabrina);
        sabrina.setBounds(20, 10, 200, 700);
        sabrina.setBorder(null);
        sabrina.setIcon(new ImageIcon(new ImageIcon("images/trainer/sabrina.png").getImage().getScaledInstance(400, 600,
                Image.SCALE_DEFAULT)));
        repaint();

        eichdialog.setText("");

        repaint();

        d.scene6(this, megastone);

    }

    public void scene7(String pokemon) {

        scene s = new scene();

        dialog d = new dialog();

        b.hasWon = false;

        s.removeAllComponents(this);
        s.clearMouseListeners(eichdialog);

        s.initEich(this);

        remove(eichPic);
        remove(behance);

        System.out.println("[!] Added Team Rocket");
        add(rocket);
        rocket.setBounds(20, 10, 200, 700);
        rocket.setBorder(null);
        rocket.setIcon(new ImageIcon(new ImageIcon("images/people/team-rocket.png").getImage().getScaledInstance(200,
                700, Image.SCALE_DEFAULT)));
        repaint();

        eichdialog.setText("");

        repaint();

        d.scene7(this);

    }

    public void fourthBattle(String pokemon) {

        System.out.println("[!] Fourth Battle");

        setTitle("PokémonGame: Battle 4");

        scene s = new scene();

        battleMenu bm = new battleMenu();

        s.removeAllComponents(this);

        firstBattle = new battle(bm, this);
        enemy = firstBattle.getEnemyPokemon(pokemon);

        bm.setMenu(pokemon, this, b.getEnemyPokemon(pokemon));

        // Enemy Pokemon
        firstBattle.enemyPokemon(enemy, this);

        // My Pokemon
        firstBattle.myPokemon(pokemon, this);

    }

    public void end(){

        setTitle("PokémonGame: End");

        scene s = new scene();

        dialog d = new dialog();


        s.initEich(this);

        remove(eichPic);

        d.win(this);

    }
}
