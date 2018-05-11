package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

/**
 * La Classe {@code Help} sert a afficher les commandes de jeu, ainsi que le(s) objectif(s) de jeu.
 * @author GOODMAN David 21401471
 */
public class Help implements Window {

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel) {
        panel.clear();
        panel.writeCenter("***OBJECTIFS***", 10);
        panel.writeCenter("1) Explorer le monde de JADe", 12);
        panel.writeCenter("2) Trouver l'Epee du Destin", 13);
        panel.writeCenter("3) Librer le monde de l'emprise du Dragon", 14);
        panel.writeCenter("***KEYBINDS***", 25);
        panel.writeCenter("[Fleche Gauche]    -->    Deplace le personnage vers la gauche", 26);
        panel.writeCenter("[Fleche Droite]    -->    Deplace le personnage vers la droite", 27);
        panel.writeCenter("[Fleche Haut]    -->    Deplace le personnage vers le haut", 28);
        panel.writeCenter("[Fleche Bas]    -->    Deplace le personnage vers le bas", 29);
        panel.writeCenter("[f]    -->    Interaction avec un objet", 30);
        panel.writeCenter("[i]    -->    Inventaire", 31);
        panel.writeCenter("[?]    -->    Menu HELP", 32);
        panel.writeCenter("--Retour [ANY KEY]--", 48);
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
