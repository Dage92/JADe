//===============================================================================
//Auteur: GOODMAN David 21401471
//Class qui controle la gestion de la creation d'objet
//===============================================================================

package fr.uvsq.poo.monprojet.inventaire;

import java.awt.Color;
import java.util.List;
import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.world.*;

/**
 * @author GOODMAN David 21401471
 */
public class LootCreation {
    private World world;

    public LootCreation(World world) {
        this.world = world;
    }

    public Loot template() {
        Loot template = new Loot('t', AsciiPanel.brightGreen, "Template", "Two letters from a Templar");
        //LootMap.placeLoot(x, y); Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        return template;
    }
    //a reproduire pour n'importe quel objet
}
