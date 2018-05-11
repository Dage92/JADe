package fr.uvsq.poo.monprojet.inventaire;

import java.awt.Color;
import java.util.List;
import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.world.*;

/**
 * La Classe {@code LootCreation} sert a controler la gestion de la creation d'objet
 * @author GOODMAN David 21401471
 */
public class LootCreation {
    private World world;

    /**
     * Constructeur de {@code LootCreation}
     * @param world
     */
    public LootCreation(World world) {
        this.world = world;
    }

    /**
     * Methode qui renvoie un objet utilisable par le joueur
     */
    public Loot template() {
        Loot template = new Loot('t', AsciiPanel.brightGreen, "Template", "Two letters from a Templar");
        //LootMap.placeLoot(x, y); Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        return template;
    }
    //a reproduire pour n'importe quel objet
}
