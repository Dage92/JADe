package fr.uvsq.poo.monprojet.creatures.player;

import fr.uvsq.poo.monprojet.creatures.Creature;
import fr.uvsq.poo.monprojet.world.World;

import java.awt.*;

/**
 * Cette classe definit les attributs du Player, l'utilisateur a la possibilite de customiser son personnage, avec des
 * stats particulieres ou bien meme le nom du personnage ainsi que son age.
 * @author JACQUET Julien 21400579
 */
public class PlayerCreation extends Creature {

    private String name;
    private int age = 21;
    private int HP = 180;
    private int ATK = 55;
    private int DEF= 40;
    private int MP = 60;
    private Color color = Color.cyan;

    public void setName(String s){
        this.name = s;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


    public void setHP(int a){
        this.HP = a;
    }

    public int getHP() {
        return HP;
    }


    public void setATK(int a){
        this.ATK = a;
    }

    public int getATK(){
        return ATK;
    }


    public void setMP(int a){
        this.MP = a;
    }

    public int getMP(){
        return this.MP;
    }

    public void setDEF(int a){ this.DEF = a;}

    public int getDEF(){return this.DEF; }

    public PlayerCreation(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF) {
        super(world, '@', Color.white, "Joueur", 180, 55, 40);
        this.age = getAge();
        this.MP = getMP();
    }
}
