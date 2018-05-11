//===============================================================================
//Auteur: GOODMAN David 21401471
//Affiche l'etat de jeu.
//===============================================================================

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


public class Play implements Window {
    private PlayerCreation player;
    private World world;
    private int height;
    private int width;
    //List<String> msg;

    public Play(){
        height = 40;
        width = 100;
        //msg = new ArrayList<String>();
        createWorld();
        player = new PlayerCreation(world, '@', Color.white, "Joueur", 180, 55, 40);
        LootCreation maker = new LootCreation(world);
        createLoot(maker);
    }


    private void createCreature(Creature creator){ }

    private void createLoot(LootCreation maker){
    }

    private void createWorld(){
        world = new WorldGenerator(100,40).makeDungeon().build();
    }

    public int scrollX(){
        return Math.max(0, Math.min(player.x - width / 2, world.getWidth() - width));
    }

    public int scrollY(){
        return Math.max(0, Math.min(player.y - height / 2, world.getHeight() - height));
    }

    public void displayPanes(AsciiPanel panel, int left, int top){
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                int wx = x + left;
                int wy = y + top;

                panel.write(world.symbole(wx, wy), x, y, world.color(wx, wy));
            }
        }
    }

    public void displayMsg(AsciiPanel panel, List<String> msg){

    }

    @Override
    public void display(AsciiPanel panel) {
        int left = scrollX();
        int top = scrollY();

        displayPanes(panel, left, top);

        panel.write('X', player.x, player.y);
        panel.writeCenter("'Echap' pour perdre ou 'Entrer' pour gagner", 44);
    }

    @Override
    public Window reaction(KeyEvent userInput) {
        switch (userInput.getKeyCode()) {
            case KeyEvent.VK_ENTER: return new Win();
            case KeyEvent.VK_ESCAPE: return new Lose();
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_H: player.moveBy(-1, 0); break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_L: player.moveBy(1, 0); break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_K: player.moveBy(0, -1); break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_J: player.moveBy(0, 1); break;
            case KeyEvent.VK_Y: player.moveBy(-1, -1); break;
            case KeyEvent.VK_U: player.moveBy(1, -1); break;
            case KeyEvent.VK_B: player.moveBy(-1, 1); break;
            case KeyEvent.VK_N: player.moveBy(1, 1); break;
        }

        //switch (userInput.getKeyChar()) {
        //    case 'f': player.Player.AI.pickUpLoot(); break;
        //}
        return this;
    }
}
