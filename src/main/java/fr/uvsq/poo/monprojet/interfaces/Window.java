package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

public interface Window {
    /**Affiche sur une fenetre AsciiPanel et attend une commande de l'utilisateur.*/

    public void display(AsciiPanel panel);

    public Window reaction(KeyEvent userInput);
}