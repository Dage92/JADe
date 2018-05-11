package fr.uvsq.poo.monprojet.inventaire;

import java.awt.Color;

/**
 * La Classe {@code Loot} sert a controler les objet rencontre par le joueur.
 * @author GOODMAN David 21401471
 */
public class Loot {
    private char symbole;
    /**
     * simple {@code get} de symbole
     */
    public char getSymbole(){
        return symbole;
    }

    private Color color;
    /**
     * simple {@code get} de couleur
     */
    public Color getColor(){
        return color;
    }

    private  String name;
    /**
     * simple {@code get} de nom de l'objet
     */
    public String getItemName(){
        return name;
    }

    private String flair;
    /**
     * simple {@code get} de details fictifs
     */
    public String getFlair(){
        return flair;
    }

    //private int attackValue;
     //public int attackValue(){
     //return attackValue();
     //}
     //public int modifyAttackValue(int amount){
     //return attackValue += amount;
     //}

    /**
     * Constructeur de {@code Loot}
     * @param symbole
     * @param color
     * @param name
     * @param flair
     */
    public Loot(char symbole, Color color, String name, String flair){
        this.symbole = symbole;
        this.color = color;
        this.name = name;
        this.flair = flair;//appearance == null ? name : appearance;
    }

}