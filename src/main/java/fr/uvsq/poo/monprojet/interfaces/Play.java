package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.world.*;
import fr.uvsq.poo.monprojet.creatures.Creature;
import fr.uvsq.poo.monprojet.creatures.player.PlayerCreation;
import fr.uvsq.poo.monprojet.inventaire.*;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

/**
 * La Classe {@code Play} sert a afficher l'etat de jeu.
 * @author GOODMAN David 21401471
 */
public class Play implements Window {
    private PlayerCreation player;
    private World world;
    private int height;
    private int width;
    private Window popup;
    //private List<String> msg;

    /**
     * Constructeur de {@code Play}
     */
    public Play(){
        height = 40;
        width = 100;
        //msg = new ArrayList<String>();
        createWorld();
        player = new PlayerCreation(world, '@', Color.white, "Joueur", 180, 55, 40);
    }

    /**
     * Methode qui affiche les creature sur le champ de jeu.
     * @param creator
     */
    private void createCreature(Creature creator){ }

    /**
     * Methode qui affiche les objets sur le champ de jeu.
     * @param maker
     */
    private void createLoot(LootCreation maker) { }

    /**
     * Methode qui affiche le monde de jeu.
     */
    private void createWorld(){
        world = new WorldGenerator(100,40).makeDungeon().build();
    }

    /**
     * Methode qui calcule combien de case l'on peut scroll horizontalement
     */
    public int scrollX(){
        return Math.max(0, Math.min(player.x - width / 2, world.getWidth() - width));
    }

    /**
     * Methode qui calcule combien de case l'on peut scroll verticalement
     */
    public int scrollY(){
        return Math.max(0, Math.min(player.y - height / 2, world.getHeight() - height));
    }

    /**
     * Methode qui affiche les blocs representant l'aire de jeu.
     * @param panel
     * @param g
     * @param h
     */
    public void displayPanes(AsciiPanel panel, int g, int h){
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                int worldX = x + g;
                int worldY = y + h;
                panel.write(world.symbole(worldX, worldY), x, y, world.color(worldX, worldY));
            }
        }
    }

    //public void displayMsg(AsciiPanel panel, List<String> msg){ }

    /**
     * Le methode affiche l'interface
     * @param panel
     */
    @Override
    public void display(AsciiPanel panel) {
        int g = scrollX();
        int h = scrollY();
        displayPanes(panel, g, h);
        panel.write('X', player.x, player.y);
        panel.writeCenter("--[ESC] pour perdre ou [ENTER] pour gagner--", 44);
        if(popup != null) {
            popup.display(panel);
        }
    }

    /**
     * Methode qui reagit selon l'input du joueur
     * @param userInput
     */
    @Override
    public Window reaction(KeyEvent userInput) {
        if (popup != null) {
            popup = popup.reaction(userInput);
        }
        else {
            switch (userInput.getKeyCode()) {
                case KeyEvent.VK_ENTER: return new Win();           //Renvoi l'ecran gagnant quand on tape [ENTER]
                case KeyEvent.VK_ESCAPE: return new Lose();         //Renvoi l'ecran perdant quand on tape [ESC]
                case KeyEvent.VK_LEFT:                              //Deplace le joueur vers la gauche [GAUCHE]
                case KeyEvent.VK_RIGHT:                             //Deplace le joueur vers la droite [DROITE]
                case KeyEvent.VK_UP:                                //Deplace le joueur vers le haut [HAUT]
                case KeyEvent.VK_DOWN:                              //Deplace le joueur vers le bas [BAS]
            }

            switch (userInput.getKeyChar()) {
                //case 'f': player.PlayerAI.pickUpLoot(); break;    //Interaction avec un objet
                //case 'i': player.inventaire(); break;             //Ouvre l'inventaire
                case 'h': popup = new Help(); break;                //Ouvre le menu d'aide
            }
        }
        return this;
    }
}
