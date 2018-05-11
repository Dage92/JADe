//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche les communications entre NPC et le joueur.
//===============================================================================

package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;
import java.util.List;

public class Communication implements Window {

    private List<String> msg;

    @Override
    public void display(AsciiPanel panel){
    }

    @Override
    public Window reaction(KeyEvent key){
        return null;
    }
}
