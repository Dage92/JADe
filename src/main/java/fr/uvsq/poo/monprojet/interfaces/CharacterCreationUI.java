//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche les implementation de la creation de player dans la GUI.
//===============================================================================

package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class CharacterCreationUI implements Window {
    private String nom;
    private int age;
    private int HPmod;
    private int ATKmod;
    private int DEFmod;
    private int MPmod;

    public String getName(){
        return "";//tmp
    }

    public int getAge() {
        return 0;//tmp
    }

    public int getHPmod(){
        return 0;//tmp
    }

    public int getATKmod(){
        return 0;//tmp
    }

    public int getDEFmod(){
        return 0;//tmp
    }

    public int getMPmod(){
        return 0;//tmp
    }

    @Override
    public void display(AsciiPanel panel){}

    @Override
    public Window reaction(KeyEvent key) {
        return null;//tmp
    }

    public void UserInputResponce(KeyEvent key) {}
}
