import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class dialog {

    battle b;
    scene s;

    public void Battle(battle b, scene s) {
        this.b = b;
        this.s = s;
    }

    public void scene1(window w) {

        w.eichdialog.setText("Hallo ich bin Professor Eich.");

        w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                w.eichdialog.setText("Wilkommen in der wunderbaren Welt der Pokémon");

                w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {

                        w.eichdialog.setText("Du bist zu mir gekommen um Pokémon Trainer zu werden");
                        w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {

                                w.eichdialog.setText("Das trifft sich gut!");

                                w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {

                                        w.eichdialog.setText(
                                                "<html>Zufällig habe ich hier noch 3 Pokémon übrig aus denen <br> du dir eines auswählen kannst!</html>");

                                        w.add(w.glumanda);
                                        w.add(w.bisasam);
                                        w.add(w.shiggy);

                                        w.glumanda.setBounds(280, 300, 250, 250);
                                        w.glumanda.setContentAreaFilled(false);
                                        w.glumanda.setBorder(null);

                                        w.bisasam.setBounds(530, 300, 250, 250);
                                        w.bisasam.setContentAreaFilled(false);
                                        w.bisasam.setBorder(null);

                                        w.shiggy.setBounds(780, 300, 250, 250);
                                        w.shiggy.setContentAreaFilled(false);
                                        w.shiggy.setBorder(null);

                                        w.repaint();

                                        w.bisasam.addMouseListener(new java.awt.event.MouseAdapter() {
                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                if (w.pokemonIsSelected == true) {
                                                    System.err.println("[!] Pokemon is already selected");
                                                    return;
                                                }
                                                w.pokemon = "Bisasam";
                                                System.out.println("[!] " + w.pokemon + " selected");
                                                w.eichdialog.setText("Herzlichen Glückwunsch du hast dich für "
                                                        + w.pokemon + " entschieden.");
                                                w.remove(w.glumanda);
                                                w.remove(w.shiggy);
                                                w.repaint();

                                                w.pokemonIsSelected = true;

                                                w.bisasam.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "Click on Prof. Eich's text to continue");
                                                    }
                                                });

                                                w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        w.pokemonSelected();
                                                    }
                                                });
                                            }
                                        });

                                        w.shiggy.addMouseListener(new java.awt.event.MouseAdapter() {
                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                if (w.pokemonIsSelected == true) {
                                                    System.err.println("[!] Pokemon is already selected");
                                                    return;
                                                }
                                                w.pokemon = "Shiggy";
                                                System.out.println("[!] " + w.pokemon + " selected");
                                                w.eichdialog.setText("Herzlichen Glückwunsch du hast dich für "
                                                        + w.pokemon + " entschieden.");
                                                w.remove(w.glumanda);
                                                w.remove(w.bisasam);
                                                w.repaint();

                                                w.pokemonIsSelected = true;

                                                w.shiggy.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "Click on Prof. Eich's text to continue");
                                                    }
                                                });

                                                w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        w.pokemonSelected();
                                                    }
                                                });
                                            }
                                        });

                                        w.glumanda.addMouseListener(new java.awt.event.MouseAdapter() {
                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                if (w.pokemonIsSelected == true) {
                                                    System.err.println("[!] Pokemon is already selected");
                                                    return;
                                                }
                                                w.pokemon = "Glumanda";
                                                System.out.println("[!] " + w.pokemon + " selected");
                                                w.eichdialog.setText("Herzlichen Glückwunsch du hast dich für "
                                                        + w.pokemon + " entschieden.");
                                                w.remove(w.bisasam);
                                                w.remove(w.shiggy);
                                                w.repaint();

                                                w.pokemonIsSelected = true;

                                                w.glumanda.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "Click on Prof. Eich's text to continue");
                                                    }
                                                });

                                                w.eichdialog.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        w.pokemonSelected();
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });

                            }
                        });

                    }
                });

            }
        });

    }

    public void scene2(window w, scene s) {

        dialog _this = this;
        String text[] = new String[10];

        text[0] = "Herzlichen Glückwunsch du hast gewonnen";
        text[1] = "Yippie! Ein sehr guter Sieg. Toll gemacht!";
        text[2] = "Puuuh! Das war aber knapp! Aber trotzdem ein guter erster Kampf.";
        text[3] = "Für den ersten Sieg zwar kanpp aber toll.";
        text[4] = "Nun aber wünsche ich dir viel Spaß in der Kanto Region";
        text[5] = "Vielleicht sieht man sich ja auf der Reise.";
        text[6] = "Oh! Dein " + w.pokemon + " entwickelt sich zu....";
        text[7] = w.pokemon;

        double random = Math.random();

        System.out.println("[!] Initializing Eich");
        s.initEich(w);
        s.clearMouseListeners(w.eichdialog);
        System.out.println("[!] Initializing Eich -> should be done!");

        System.out.println(w.b.enemy);
        System.out.println(w.b.myHP);
        System.out.println(w.b.enemyHP);

        if (w.b.won()) {

            if (random >= 0.5) {
                w.eichdialog.setText(text[0]);
            } else {
                w.eichdialog.setText(text[1]);
            }

            w.eichKampf = true;

            w.eichdialog.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {

                    w.eichdialog.setText(text[4]);

                    w.eichdialog.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {

                            w.eichdialog.setText(text[5]);

                            w.eichdialog.addMouseListener(new MouseAdapter() {
                                public void mouseClicked(MouseEvent evt) {

                                    w.eichdialog.setText(text[6]);

                                    w.eichdialog.addMouseListener(new MouseAdapter() {
                                        public void mouseClicked(MouseEvent evt) {

                                            if (w.pokemon == "Glumanda") {

                                                w.pokemon = "Glutexo";
                                                w.add(w.glutexo);
                                                w.glutexo.setBounds(530, 300, 250, 250);
                                                w.glutexo.setContentAreaFilled(false);
                                                w.glutexo.setBorder(null);
                                                w.eichdialog.setText("Glutexo");

                                            } else if (w.pokemon == "Shiggy") {

                                                w.pokemon = "Schillok";
                                                w.add(w.schillok);
                                                w.schillok.setBounds(530, 300, 250, 250);
                                                w.schillok.setContentAreaFilled(false);
                                                w.schillok.setBorder(null);
                                                w.eichdialog.setText("Schillok");

                                            } else if (w.pokemon == "Bisasam") {

                                                w.pokemon = "Bisaknosp";
                                                w.add(w.bisaknosp);
                                                w.bisaknosp.setBounds(530, 300, 250, 250);
                                                w.bisaknosp.setContentAreaFilled(false);
                                                w.bisaknosp.setBorder(null);
                                                w.eichdialog.setText("Bisaknosp");

                                            } else {

                                                System.out.println("[!] Invalid Pokemon: " + w.pokemon);
                                            }

                                            w.repaint();

                                            w.eichdialog.addMouseListener(new MouseAdapter() {
                                                public void mouseClicked(MouseEvent evt) {

                                                    s.removeAllComponents(w);
                                                    s.clearMouseListeners(w.eichdialog);
                                                    w.scene3(w.pokemon);

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }
            });

        } else {

            w.eichdialog.setText("Schade! Du hast leider verloren!");

            w.eichdialog.addMouseListener(new MouseAdapter() {

                public void mouseClicked(MouseEvent evt) {
                    w.eichdialog.setText("Aber da ich der nette Prof. Eich bin will ich mal nicht so sein!");

                    w.eichdialog.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {
                            w.eichdialog.setText(
                                    "<html>Ich gebe dir nochmal die Chance gegen mich zu kämpfen <br>und du darfst dein Starter noch einmal erneut auswählen. Also zurück zum Start.<html>");

                            w.eichdialog.addMouseListener(new MouseAdapter() {
                                public void mouseClicked(MouseEvent evt) {

                                    w.setName();

                                }
                            });
                        }
                    });

                }

            });

        }

        w.repaint();

    }

    public void scene3(window w) {

        w.eichdialog.setText("Hoppla!");

        JOptionPane.showMessageDialog(null, "Einige Zeit später triffst du auf einen anderen Trainer");

        w.eichdialog.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {

                w.eichdialog.setText("Da bist du mir wohl über den Weg gelaufen!");

                w.eichdialog.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {

                        w.eichdialog.setText("Das heißt du musst jetzt wohl oder übel gegen mich kampfen!");

                        w.eichdialog.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent evt) {

                                w.eichdialog.setText("Lets GOOOO!");

                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                    public void mouseClicked(MouseEvent evt) {

                                        w.secondBattle(w.pokemon);

                                    }
                                });

                            }
                        });

                    }
                });

            }
        });

    }

    public void scene4(window w) {

        if (w.b.won()) {

            w.eichdialog.setText("Schade ich habe verloren! Mal wieder... :c");

            w.eichdialog.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {

                    w.eichdialog.setText("Trotzdem viel Spaß auf deiner restlichen Reise");

                    w.eichdialog.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {

                            w.eichdialog.setText("Trotzdem viel Spaß auf deiner restlichen Reise");

                            w.eichdialog.addMouseListener(new MouseAdapter() {
                                public void mouseClicked(MouseEvent evt) {

                                    w.remove(w.behance);
                                    w.repaint();

                                    w.eichdialog.setText("...");

                                    w.eichdialog.addMouseListener(new MouseAdapter() {
                                        public void mouseClicked(MouseEvent evt) {

                                            w.eichdialog.setText("OH! Dein " + w.pokemon + " entwickelt sich!");

                                            if (w.pokemon == "Glutexo") {
                                                w.pokemon = "Glurak";
                                            } else if (w.pokemon == "Bisaknosp") {
                                                w.pokemon = "Bisaflor";
                                            } else if (w.pokemon == "Schillok") {
                                                w.pokemon = "Turtok";
                                            }

                                            w.eichdialog.addMouseListener(new MouseAdapter() {
                                                public void mouseClicked(MouseEvent evt) {

                                                    w.eichdialog.setText("Zu einem " + w.pokemon);
                                                    if (w.pokemon == "Glurak") {
                                                        w.add(w.glurak);
                                                        w.glurak.setBounds(530, 300, 250, 250);
                                                        w.glurak.setContentAreaFilled(false);
                                                        w.glurak.setBorder(null);
                                                    } else if (w.pokemon == "Bisaflor") {
                                                        w.add(w.bisaflor);
                                                        w.bisaflor.setBounds(530, 300, 250, 250);
                                                        w.bisaflor.setContentAreaFilled(false);
                                                        w.bisaflor.setBorder(null);
                                                    } else if (w.pokemon == "Turtok") {
                                                        w.add(w.turtok);
                                                        w.turtok.setBounds(530, 300, 250, 250);
                                                        w.turtok.setContentAreaFilled(false);
                                                        w.turtok.setBorder(null);
                                                    }

                                                    w.repaint();

                                                    w.eichdialog.addMouseListener(new MouseAdapter() {
                                                        public void mouseClicked(MouseEvent evt) {

                                                            w.repaint();
                                                            w.scene5(w.pokemon);

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }
            });

        } else {
            w.eichdialog.setText("JAAA ICH HABE GEWONNEN! Und du leider verloren.");

            s.clearMouseListeners(w.eichdialog);

            w.eichdialog.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {

                    w.eichdialog.setText("Du musst jetzt wohl einen Kampf zurück!");

                    if (w.pokemon == "Glutexo") {
                        w.pokemon = "Glumanda";
                    } else if (w.pokemon == "Bisaknosp") {
                        w.pokemon = "Bisasam";
                    } else if (w.pokemon == "Schillok") {
                        w.pokemon = "Schiggy";
                    }

                    System.out.println(">>> goto first Battle");
                    w.firstBattle(w.pokemon);

                }
            });

        }

    }

    public void scene5(window w) {

        JOptionPane.showMessageDialog(null,
                "Eine Trainerin hat dich am Straßenrand ein Eis essen sehen und geht zu dir.");

        w.eichdialog.setText("Hallo ich habe dein tolles T-Shirt gesehen das ist glaube ich von WISH oder?");

        w.eichdialog.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {

                w.eichdialog.setText("Naja ist ja auch egal.");

                w.eichdialog.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {

                        w.eichdialog.setText("Meine langen grünen Haare sind so oder so besser.");

                        w.eichdialog.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent evt) {

                                w.eichdialog.setText(
                                        "Da du mir aber aufgefallen bist möchte ich jetzt auch gegen dich kämpfen");

                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                    public void mouseClicked(MouseEvent evt) {

                                        w.eichdialog.setText("Viel Spaß beim verlieren! :)");

                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                            public void mouseClicked(MouseEvent evt) {

                                                w.thirdBattle(w.pokemon);

                                            }
                                        });

                                    }
                                });

                            }
                        });

                    }
                });

            }
        });

    }

    public void scene6(window w, boolean megastone) {

        if (w.b.won()) {

            w.eichdialog.setText("Guter Kampf!");

            w.eichdialog.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {

                    w.eichdialog.setText("Ich hab dich natürlich gewinnen lassen, da ich nett bin.");

                    w.eichdialog.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {

                            w.eichdialog.setText("Ab hier darfst du nur durch wenn du einen Megastein besitzt");

                            w.eichdialog.addMouseListener(new MouseAdapter() {
                                public void mouseClicked(MouseEvent evt) {

                                    if (megastone == true) {
                                        w.eichdialog.setText("OH! Ich sehe du hast einen Megastein");

                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                            public void mouseClicked(MouseEvent evt) {

                                                w.eichdialog.setText(
                                                        "Damit kannst du bei deinemPokemon die Megaentwicklung auslösen");

                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                    public void mouseClicked(MouseEvent evt) {

                                                        w.eichdialog
                                                                .setText("Ich mache das mal ganz schnell für dich.");

                                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                                            public void mouseClicked(MouseEvent evt) {

                                                                if (w.pokemon == "Glurak") {
                                                                    w.pokemon = "Mega Glurak";
                                                                } else if (w.pokemon == "Bisaflor") {
                                                                    w.pokemon = "Mega Bisaflor";
                                                                } else if (w.pokemon == "Turtok") {
                                                                    w.pokemon = "Mega Turtok";
                                                                }

                                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                                    public void mouseClicked(MouseEvent evt) {

                                                                        w.eichdialog.setText(
                                                                                "So du hast nun ein " + w.pokemon);

                                                                        if (w.pokemon == "Mega Glurak") {
                                                                            w.add(w.mglurak);
                                                                            w.mglurak.setBounds(530, 300, 250, 250);
                                                                            w.mglurak.setContentAreaFilled(false);
                                                                            w.mglurak.setBorder(null);
                                                                            w.mglurak.setIcon(
                                                                                    new ImageIcon(new ImageIcon(
                                                                                            "images/pokemon/starter/mega-glurak.png")
                                                                                                    .getImage()
                                                                                                    .getScaledInstance(
                                                                                                            300, 300,
                                                                                                            Image.SCALE_DEFAULT)));
                                                                        } else if (w.pokemon == "Mega Bisaflor") {
                                                                            w.add(w.mbisaflor);
                                                                            w.mbisaflor.setBounds(530, 300, 250, 250);
                                                                            w.mbisaflor.setContentAreaFilled(false);
                                                                            w.mbisaflor.setBorder(null);
                                                                            w.mbisaflor.setIcon(
                                                                                    new ImageIcon(new ImageIcon(
                                                                                            "images/pokemon/starter/bisaflor_mega.png")
                                                                                                    .getImage()
                                                                                                    .getScaledInstance(
                                                                                                            300, 300,
                                                                                                            Image.SCALE_DEFAULT)));

                                                                        } else if (w.pokemon == "Mega Turtok") {
                                                                            w.add(w.mturtok);
                                                                            w.mturtok.setBounds(530, 300, 250, 250);
                                                                            w.mturtok.setContentAreaFilled(false);
                                                                            w.mturtok.setBorder(null);
                                                                            w.mbisaflor.setIcon(
                                                                                    new ImageIcon(new ImageIcon(
                                                                                            "images/pokemon/starter/mega-turtok.png")
                                                                                                    .getImage()
                                                                                                    .getScaledInstance(
                                                                                                            300, 300,
                                                                                                            Image.SCALE_DEFAULT)));
                                                                        }

                                                                        w.eichdialog
                                                                                .addMouseListener(new MouseAdapter() {
                                                                                    public void mouseClicked(
                                                                                            MouseEvent evt) {

                                                                                        w.eichdialog.setText(
                                                                                                "Also viel Glück weiterhin.");

                                                                                        w.eichdialog.addMouseListener(
                                                                                                new MouseAdapter() {
                                                                                                    public void mouseClicked(
                                                                                                            MouseEvent evt) {

                                                                                                        w.scene7(
                                                                                                                w.pokemon);

                                                                                                    }
                                                                                                });

                                                                                    }
                                                                                });

                                                                    }
                                                                });

                                                            }
                                                        });

                                                    }
                                                });

                                            }
                                        });
                                    } else {

                                        w.eichdialog.setText("Du hast keinen Megastein also darfst du nicht weiter");

                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                            public void mouseClicked(MouseEvent evt) {

                                                w.eichdialog.setText("Versuche es nocheinmal erneut");

                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                    public void mouseClicked(MouseEvent evt) {

                                                        w.eichdialog.setText(
                                                                "Vielleicht hast du beim nächsten mal Glück und bekommst einen");

                                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                                            public void mouseClicked(MouseEvent evt) {

                                                                w.eichdialog.setText(
                                                                        "Zufallig weiß ich dass du deine Pokemon von Prof. Eich bekommen hast");

                                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                                    public void mouseClicked(MouseEvent evt) {

                                                                        w.eichdialog.setText(
                                                                                "<html>Geh also wieder zu Anfang und suche dich<br> vielleicht auch ein anderes Pokemon aus.</html>");

                                                                        w.eichdialog
                                                                                .addMouseListener(new MouseAdapter() {
                                                                                    public void mouseClicked(
                                                                                            MouseEvent evt) {

                                                                                        JOptionPane.showMessageDialog(
                                                                                                null,
                                                                                                "Starte das Spiel neu um erneut zu beginnen.");
                                                                                        System.exit(0);

                                                                                    }
                                                                                });

                                                                    }
                                                                });

                                                            }
                                                        });

                                                    }
                                                });

                                            }
                                        });

                                    }
                                }
                            });

                        }
                    });

                }
            });

        } else {

            w.eichdialog.setText("HAHA! Wie gesagt ich habe gewonnen.");

            w.eichdialog.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {

                    w.eichdialog.setText(
                            "Ich muss dich jetzt leider bitten umzukehren un den letzten Trainer noch einmal zu besiegen");

                    if (w.pokemon == "Glurak") {
                        w.pokemon = "Glutexo";
                    } else if (w.pokemon == "Bisaflor") {
                        w.pokemon = "Bisaknosp";
                    } else if (w.pokemon == "Turtok") {
                        w.pokemon = "Schillok";
                    }

                    w.eichdialog.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {

                            System.out.println(">>> goto second Battle");
                            w.secondBattle(w.pokemon);

                        }
                    });

                }
            });

        }

    }

    public void scene7(window w) {

        System.out.println("Scene 7");

        w.eichdialog.setText("Jessie: Jetzt gibts Ärger ...");

        w.eichdialog.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {

                w.eichdialog.setText("James: ... und es kommt noch härter!");

                w.eichdialog.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {

                        w.eichdialog.setText("Jessie: Wir wollen über die Erde regieren!");

                        w.eichdialog.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent evt) {

                                w.eichdialog.setText("James: Und unseren eigenen Staat kreiren!");

                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                    public void mouseClicked(MouseEvent evt) {

                                        w.eichdialog.setText("Jessie: Liebe und Wahrheit verurteilen wir!");

                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                            public void mouseClicked(MouseEvent evt) {

                                                w.eichdialog.setText("James: Mehr und mehr Macht, das wollen wir!");

                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                    public void mouseClicked(MouseEvent evt) {

                                                        w.eichdialog.setText("Jessie: Jessie!");

                                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                                            public void mouseClicked(MouseEvent evt) {

                                                                w.eichdialog.setText("James: Und James!");

                                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                                    public void mouseClicked(MouseEvent evt) {

                                                                        w.eichdialog.setText("James: Und James!");

                                                                        w.eichdialog
                                                                                .addMouseListener(new MouseAdapter() {
                                                                                    public void mouseClicked(
                                                                                            MouseEvent evt) {

                                                                                        w.eichdialog.setText(
                                                                                                "Jessie: Wir sind Team Rocket, so schnell wie das Licht!");

                                                                                        w.eichdialog.addMouseListener(
                                                                                                new MouseAdapter() {
                                                                                                    public void mouseClicked(
                                                                                                            MouseEvent evt) {

                                                                                                        w.eichdialog
                                                                                                                .setText(
                                                                                                                        "James: Drum gebt lieber auf und bekämpft uns nicht!");

                                                                                                        w.eichdialog
                                                                                                                .addMouseListener(
                                                                                                                        new MouseAdapter() {
                                                                                                                            public void mouseClicked(
                                                                                                                                    MouseEvent evt) {

                                                                                                                                w.eichdialog
                                                                                                                                        .setText(
                                                                                                                                                "Mauzi: Miauz, genau!");

                                                                                                                                w.eichdialog
                                                                                                                                        .addMouseListener(
                                                                                                                                                new MouseAdapter() {
                                                                                                                                                    public void mouseClicked(
                                                                                                                                                            MouseEvent evt) {

                                                                                                                                                        w.fourthBattle(
                                                                                                                                                                w.pokemon);

                                                                                                                                                    }
                                                                                                                                                });

                                                                                                                            }
                                                                                                                        });

                                                                                                    }
                                                                                                });
                                                                                    }
                                                                                });
                                                                    }
                                                                });

                                                            }
                                                        });

                                                    }
                                                });

                                            }
                                        });

                                    }

                                });

                            }

                        });

                    }
                });

            }
        });

    }

    public void win(window w) {

        if (w.teamrocket == true) {

            if (w.b.won() == true) {
                w.eichdialog.setText("Team Rocket: Das war mal wieder ein Schuss in den Ofen!");

                w.eichdialog.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {

                        w.eichdialog.setText("...");

                        w.eichdialog.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent evt) {

                                w.add(w.eichPic);
                                w.repaint();
                                w.eichdialog.setText("Herzlichen Glückwunsch du hast Team Rocket besiegt!");

                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                    public void mouseClicked(MouseEvent evt) {

                                        w.eichdialog.setText("Nun bist du der beste Trainer der Kanto Region");

                                        w.eichdialog.addMouseListener(new MouseAdapter() {
                                            public void mouseClicked(MouseEvent evt) {

                                                w.eichdialog
                                                        .setText("Du bekommst von mir dafür als Belohnung einen Pokal");

                                                w.add(w.pokal);
                                                w.pokal.setBounds(530, 300, 250, 250);
                                                w.pokal.setBorder(null);
                                                w.pokal.setIcon(new ImageIcon(new ImageIcon("images/items/pokal.png")
                                                        .getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT)));
                                                w.repaint();

                                                w.eichdialog.addMouseListener(new MouseAdapter() {
                                                    public void mouseClicked(MouseEvent evt) {

                                                        JOptionPane.showMessageDialog(null,
                                                                "Du erhälst den Pokal des Champs der Kanto Region");

                                                        JOptionPane.showMessageDialog(null,
                                                                "DU HAST DAS SPIEL ERFOLGREICH ABSOLVIERT!");

                                                        System.exit(0);

                                                    }
                                                });

                                            }
                                        });

                                    }
                                });

                            }
                        });

                    }
                });

            } else {
                w.eichdialog.setText("HAHAH! Mit diesem Sieg sind wir ein Sieg näher an der Weltherrschaft!");

                w.eichdialog.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt) {

                        w.eichdialog.setText("Tschau Tschau ab mit dir in das Team Rocket Gefängnis");

                        w.eichdialog.addMouseListener(new MouseAdapter() {
                            public void mouseClicked(MouseEvent evt) {

                                JOptionPane.showMessageDialog(null,
                                        "Du hast verloren! Starte das Spiel erneut um es noch einmal zu versuchen.");
                                System.exit(0);

                            }
                        });

                    }
                });

            }

        } else {
            System.out.println(w.teamrocket +" , " +w.b.won());
        }

    }
}