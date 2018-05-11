package fr.uvsq.poo.monprojet.creatures.npc;

import fr.uvsq.poo.monprojet.world.World;

import java.awt.*;

/**
 * Cette classe definit les attributs de Witch un NPC non hostile
 * @author JACQUET Julien 21400579
 */

public class Witch extends NPC{

    public Witch(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF, boolean hostile) {
        super(world, (char)166, Color.green, "The Not So Mysterious Witch", 9999999, 0, 999, false);
    }
}
