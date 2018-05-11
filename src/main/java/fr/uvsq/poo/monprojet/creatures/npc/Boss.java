package fr.uvsq.poo.monprojet.creatures.npc;

import fr.uvsq.poo.monprojet.world.World;

import java.awt.*;

/**
 * Cette Classe definit les attributs de "Boss" un NPC hostile
 * @author JACQUET Julien 21400579
 */
public class Boss extends NPC{

    public Boss(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF, boolean hostile) {
        super(world, (char)92, Color.orange, "The Dragon", 300, 75, 50, true);
    }
}
