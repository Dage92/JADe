package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;
import java.util.List;

/**
 * La Classe {@code Communication} sert a afficher les communications entre NPC et le joueur.
 * @author GOODMAN David 21401471
 */

public class Communication implements Window {
    private List<String> msg;

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel){

    }

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    @Override
    public Window reaction(KeyEvent userInput){
        return null;
    }
}
