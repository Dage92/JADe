package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

/**
 * La Classe {@code Start} sert a afficher l'etat initial du jeu.
 * @author GOODMAN David 21401471
 */
public class Start implements Window{

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel){
        panel.writeCenter("Bienvenue dans le monde de JADe!", 25);
        panel.writeCenter("--[Enter] pour jouer--", 48);
    }

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    @Override
    public Window reaction(KeyEvent userInput){
        return userInput.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}