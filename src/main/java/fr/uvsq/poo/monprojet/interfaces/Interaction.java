//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche les interactions entre le joueur et le monde.
//===============================================================================

package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class Interaction implements Window {
    @Override
    public void display(AsciiPanel panel) {

    }

    @Override
    public Window reaction(KeyEvent key) {
        return null;//tmp
    }
}
