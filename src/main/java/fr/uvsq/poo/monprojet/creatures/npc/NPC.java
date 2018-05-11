package fr.uvsq.poo.monprojet.creatures.npc;

import fr.uvsq.poo.monprojet.creatures.Creature;
import fr.uvsq.poo.monprojet.world.World;

import java.awt.*;

/**
 * La classe {@code NPC} represente tous les NPC
 * Un NPC peut etre hostile ou non.
 * @author JACQUET Julien 21400579
 */
public class NPC extends Creature{

    //true pour hostile, false pour friendly
    boolean hostile;

    public NPC(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF, boolean hostile){
        super(world, symbole, color, name, maxHP, ATK, DEF);
        this.hostile = hostile;
    }
}
