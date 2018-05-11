package fr.uvsq.poo.monprojet.creatures;

import fr.uvsq.poo.monprojet.world.Pane;
import fr.uvsq.poo.monprojet.world.World;

import java.awt.*;

/**
 * La classe {@code Creature} represente toutes les creatures presentes dans le monde, que ce soit le joueur ou des NPC
 * @author JACQUET Julien 21400579
 */
public class Creature {

    private World world;
    Creature creature;

    int maxHP, HP, ATK, DEF, maxMP, MP;
    public int x, y;
    /*Inventaire inventaire;*/



    char symbole;
    public char getSymbole(){
        return symbole;
    }

    Color color;
    public Color getColor(){
        return color;
    }

    String name;
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    /**
     * constructeur de {@code Creature}
     * @param world - le monde
     * @param symbole -symbole de la creature
     * @param color - couleur du symbole
     * @param name - nom de la creature
     * @param maxHP - nombre d'HP maximums de la creature
     * @param ATK - attaque de la creature
     * @param DEF - Defense de la creature
     */
    public Creature(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF) {
        this.world = world;
        this.symbole = symbole;
        this.color = color;
        this.name = name;
        this.maxHP = maxHP;
        this.HP = maxHP;
        this.ATK = ATK;
    }

    public int attackVal(){
        return this.ATK;
    }

    /**
     * Calcule les degats engendres par une attaque
     * @param other
     * @param val
     * @return
     */
    public int attack(Creature other, int val){
        int dmg = this.ATK - other.DEF;
        if (dmg < 0){
            dmg = 0;
        }

        return dmg;
    }

    public int checkHP(){
        return this.HP;
    }

    /**
     * Changement des HP apres avoir subit une attaque
     * @param val - valeur de l'attaque recue
     */
    public void priseDeDegats(int val){
        this.HP = this.HP - val;
        this.DEF = this.DEF - 1; //simule de l'usure
    }

    public void moveBy(int mvx, int mvy){

        Pane pane = world.pane(x+mvx,y+mvy);

        Creature other = world.creature(x+mvx,y+mvy);

        //incomplet

    }

}
