package interfaces;

import asciiPanel.AsciiPanel;
import creatures.Creatures;

import java.awt.event.KeyEvent;

public class InventaireUI implements Window {
    protected Creatures player;
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
