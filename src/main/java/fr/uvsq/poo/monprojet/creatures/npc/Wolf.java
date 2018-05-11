package fr.uvsq.poo.monprojet.creatures.npc;

import fr.uvsq.poo.monprojet.world.World;

import java.awt.*;

/**
 * Cette classe definit les attributs de Wolf un NPC hostile.
 * @author JACQUET Julien 21400579
 */

public class Wolf extends NPC{

    public Wolf(World world, char symbole, Color color, String name, int maxHP, int ATK, int DEF, boolean hostile) {
        super(world, 'W', Color.gray, "Wolf", 120, 60, 10, true);
    }
}
