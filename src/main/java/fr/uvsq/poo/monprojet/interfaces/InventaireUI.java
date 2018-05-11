package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.creatures.Creature;
import fr.uvsq.poo.monprojet.inventaire.Loot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public abstract class InventaireUI implements Window {
    protected Creature player;
    private String lettres;

    protected abstract String getAction();
    protected abstract boolean isAcceptable(Loot loot);
    protected abstract Window use(Loot loot);

    public InventaireUI(Creature player) {
        this.player = player;
        this.lettres = "abcdefghijklmnopqrstuvwxyz";
    }

    public void display(AsciiPanel panel) {
        panel.writeCenter("--Inventaire--", 1);
        ArrayList<String> listes = getList();

        int y = 23 - listes.size();
        int x = 4;

        if (listes.size() > 0) {
            panel.clear(' ', x, y, 20, listes.size());
        }

        for (String liste : listes) {
            panel.write(liste, x, y++);
        }

        panel.clear(' ', 0, 23, 80, 1);
        //panel.write("Que voulez-vous faire " + getVerbe() + "?", 2, 23);

        panel.repaint();
    }

    private ArrayList<String> getList() {
        ArrayList<String> listes = new ArrayList<String>();
        /**Loot[] inventaire = player.inventaire().getItems();

        for (int i = 0; i < inventaire.length; i++){
            Loot loot = inventaire[i];

            if (loot == null || !isAcceptable(loot))
                continue;

            String liste = lettres.charAt(i) + " - " + loot.symbole() + " " + loot.name();

            listes.add(liste);
        }*/
        return listes;
    }

    public Window reaction(KeyEvent userInput) {
        char c = userInput.getKeyChar();

        /**Loot[] loot = player.inventaire().getItems();

        if (lettres.indexOf(c) > -1
                && loot.length > lettres.indexOf(c)
                && loot[lettres.indexOf(c)] != null
                && isAcceptable(loot[lettres.indexOf(c)])) {
            return use(loot[lettres.indexOf(c)]);
        } else if (userInput.getKeyCode() == KeyEvent.VK_ESCAPE) {
            return null;*/
        //} else {
            return this;
        //}
    }
}
