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
    private int HP = 128;
    private int ATK = 40;
    private int DEF= 40;
    private int MP = 60;
    private Color color = Color.cyan;

    public void setP_name(String s){
        this.name = s;
    }

    public void setAge(int a){
        this.age = a;
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

    public PlayerCreation(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF) {
        super(world, '@', color, name, maxHP, ATK, DEF);
        this.age = getAge();
        this.MP = getMP();
    }
}
