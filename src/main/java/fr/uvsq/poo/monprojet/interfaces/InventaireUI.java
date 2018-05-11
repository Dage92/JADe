package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.creatures.Creature;
import fr.uvsq.poo.monprojet.inventaire.Loot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * La Classe abstraite {@code InventaireUI} sert a afficher l'inventaire du joueur.
 * @author GOODMAN David 21401471
 */
public abstract class InventaireUI implements Window {
    protected Creature player;
    private String emplacement;

    /**
     * Constructeur de {@code InventaireUI}
     * @param player
     */
    public InventaireUI(Creature player) {
        this.player = player;
        this.emplacement = "abcdefghijklmnopqrstuvwxyz";
    }

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    public void display(AsciiPanel panel) {
        panel.writeCenter("***Inventaire***", 10);
        ArrayList<String> inventaire = getInventaire();
        int y = 10 - inventaire.size();
        int x = 50;

        if (inventaire.size() > 0) {
            panel.clear(' ', x, y, 20, inventaire.size());
        }

        for (String liste : inventaire) {
            panel.write(liste, x, y++);
        }

        panel.clear(' ', 0, 41, 100, 10);
        panel.repaint();
    }

    /**
     * Methode qui renvoie la liste des objets dans l'inventaire
     */
    private ArrayList<String> getInventaire() {
        ArrayList<String> inventaire = new ArrayList<String>();

        return inventaire;
    }

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    public Window reaction(KeyEvent userInput) {
        char c = userInput.getKeyChar();

        return this;
    }
}
