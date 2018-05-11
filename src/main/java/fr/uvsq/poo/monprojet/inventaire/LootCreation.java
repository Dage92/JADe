package fr.uvsq.poo.monprojet.inventaire;

import java.awt.Color;
import java.util.List;
import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.world.World;
import fr.uvsq.poo.monprojet.world.LootMap;

/**
 * @author GOODMAN David 21401471
 */
public class LootCreation {
    private World world;

    public LootCreation(World world) {
        this.world = world;
    }

    public Loot newRock(int x, int y) {
        Loot rock = new Loot('.', AsciiPanel.brightBlack, "rock", "Objet inerte qui exhube une volonte de roll");
        //LootMap.placeLoot(x, y); Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        return rock;
    }

    public Loot template(int x, int y) {
        Loot template = new Loot('T', AsciiPanel.brightGreen, "Template", "Two letters from a Templar");
        //LootMap.placeLoot(x, y); Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        return template;
    }
}
