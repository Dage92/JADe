package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.world.World;
import fr.uvsq.poo.monprojet.world.WorldGenerator;
import fr.uvsq.poo.monprojet.creatures.Creature;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Play implements Window{
    private Creature player;
    private World world;
    private int height;
    private int width;
    List<String> msg;

    public Play(){
        height = 80;
        width = 23;
        msg = new ArrayList<String>();
        createWorld();
    }

    private void createCreature(){

    }

    private void createLoot(){

    }

    private void createWorld(){
        world = new WorldGenerator(99,99).makeDungeon();
    }

    public int scrollX(){
        return Math.max(0, Math.min(player.x - width / 2, world.getWidth() - width));
    }

    public int scrollY(){
        return Math.max(0, Math.min(player.y - height / 2, world.getHeight() - height));
    }

    public void reaction(){

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
    }

    @Override
    public Window reaction(KeyEvent key) {
        switch (key.getKeyCode()) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_H:
                player.moveBy(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_L:
                player.moveBy(1, 0);
                break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_K:
                player.moveBy(0, -1);
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_J:
                player.moveBy(0, 1);
                break;
            case KeyEvent.VK_Y:
                player.moveBy(-1, -1);
                break;
            case KeyEvent.VK_U:
                player.moveBy(1, -1);
                break;
            case KeyEvent.VK_B:
                player.moveBy(-1, 1);
                break;
            case KeyEvent.VK_N:
                player.moveBy(1, 1);
                break;
        }
        return this;
    }
}
