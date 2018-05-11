package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

/**
 * La Classe {@code Interaction} sert a afficher les interactions entre le joueur et le monde.
 * @author GOODMAN David 21401471
 */
public class Interaction implements Window {

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel) {

    }

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    @Override
    public Window reaction(KeyEvent userInput) {
        return null;
    }
}
