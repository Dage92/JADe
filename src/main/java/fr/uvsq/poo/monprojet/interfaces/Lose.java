//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche l'ecran indiquant au joueur qu'il a perdu.
//===============================================================================

package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

/**
 * La Classe {@code Lose} sert a afficher l'ecran indiquant au joueur qu'il a perdu.
 * @author GOODMAN David 21401471
 */
public class Lose implements Window {

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel){
        panel.writeCenter("Game Over", 24);
        panel.writeCenter("Rien ne pourra arreter le dragon maintenent...", 25);
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
