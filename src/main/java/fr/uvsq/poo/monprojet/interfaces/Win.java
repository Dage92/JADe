package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

/**
 * La Classe {@code Win} sert a afficher l'un des deux etat de fin, celui ou le joueur a gagne.
 * @author GOODMAN David 21401471
 */
public class Win implements Window {

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel){
        panel.writeCenter("Bravo! Vous avez vaincu les forces des tenebre!", 24);
        panel.writeCenter("--[Enter] pour commencer une nouvelle partie--", 48);
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
