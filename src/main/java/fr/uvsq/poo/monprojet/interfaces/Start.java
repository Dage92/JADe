package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public class Start implements Window{

    @Override
    public void display(AsciiPanel panel){
        panel.writeCenter("JADe", 1);
        panel.writeCenter("Appuyer sur 'Entrer' pour jouer", 22);
    }

    @Override
    public Window reaction(KeyEvent userInput){
        return userInput.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}