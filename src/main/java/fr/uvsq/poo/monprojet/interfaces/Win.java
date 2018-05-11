//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche l'un des deux etat de fin, celui ou le joueur a gagne.
//===============================================================================

package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class Win implements Window {

    @Override
    public void display(AsciiPanel panel){
        panel.writeCenter("Bravo! Vous avez vaincu les forces des tenebre!", 24);
        panel.writeCenter("Appuyer sur 'Entrer' pour commencer une nouvelle partie", 48);
    }

    @Override
    public Window reaction(KeyEvent userInput){
        return userInput.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}
