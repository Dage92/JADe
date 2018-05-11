package fr.uvsq.poo.monprojet.inventaire;

import java.awt.Color;
/**
 * @author GOODMAN David 21401471
 */
public class Loot {
    private char symbole;
    public char getSymbole(){
        return symbole;
    }

    private Color color;
    public Color color(){
        return color;
    }

    private  String name;
    public String getItemName(){
        return name;
    }

    private String flair;
    public String getFlair(){
        return flair;
    }

    /**private int attackValue;
     public int attackValue(){
     return attackValue();
     }
     public int modifyAttackValue(int amount){
     return attackValue += amount;
     }*/

    public Loot(char symbole, Color color, String name, String flair){
        this.symbole = symbole;
        this.color = color;
        this.name = name;
        this.flair = flair;//appearance == null ? name : appearance;
    }

    /**public String details(){
     String details ="";

     if(attackValue != 0){
     details += "attack :" + attackValue;
     }
     //possibilite d'ajouter plus de champs

     return details;
     }*/
}