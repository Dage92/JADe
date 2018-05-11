package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

/**
 * L'interface {@code Window} pour gerer la GUI.
 * @author GOODMAN David 21401471
 */
public interface Window {

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    public void display(AsciiPanel panel);

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    public Window reaction(KeyEvent userInput);
}