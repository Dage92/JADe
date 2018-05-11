package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

/**
 * La Classe {@code CharacterCreationUI} sert a afficher les implementations de la creation de player dans la GUI.
 * @author GOODMAN David 21401471
 */

public class CharacterCreationUI implements Window {
    private String name;
    private int age;
    private int HPmod;
    private int ATKmod;
    private int DEFmod;
    private int MPmod;

    /**
     * simple {@code get} du nom du joueur.
     */
    public String getPlayerName(){
        return name;
    }
    /**
     * simple {@code get} de l'age du joueur.
     */
    public int getAge() {
        return age;
    }
    /**
     * simple {@code get} du modifieur de HP.
     */
    public int getHPmod(){
        return 0;//tmp
    }
    /**
     * simple {@code get} du modifieur d'ATK.
     */
    public int getATKmod(){
        return 0;//tmp
    }
    /**
     * simple {@code get} du modifieur de DEF.
     */
    public int getDEFmod(){
        return 0;//tmp
    }
    /**
     * simple {@code get} du modifieur de MP.
     */
    public int getMPmod(){
        return 0;//tmp
    }

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel){
        panel.clear();
        panel.writeCenter("Qui est tu?", 10);
    }

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    @Override
    public Window reaction(KeyEvent userInput) {
        return null;//tmp
    }
}
