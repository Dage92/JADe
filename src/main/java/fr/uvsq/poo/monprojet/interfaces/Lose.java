//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche l'ecran indiquant au joueur qu'il a perdu.
//===============================================================================

package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class Lose implements Window {

    @Override
    public void display(AsciiPanel panel){
        panel.writeCenter("Game Over: Rien ne pourra arreter la sociere maintenent... ", 24);
        panel.writeCenter("Appuyer sur 'Entrer' pour commencer une nouvelle partie", 48);
    }

    @Override
    public Window reaction(KeyEvent userInput){
        return userInput.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}
