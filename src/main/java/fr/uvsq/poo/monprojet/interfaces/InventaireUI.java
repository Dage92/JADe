package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.creatures.Creature;

import java.awt.event.KeyEvent;

public class InventaireUI implements Window {
    protected Creature player;
    private String lettre;

    @Override
    public void display(AsciiPanel panel) {
        panel.write("--Inventaire--", 1, 1);
    }

    @Override
    public Window reaction(KeyEvent key) {
        return null;//tmp
    }
}
