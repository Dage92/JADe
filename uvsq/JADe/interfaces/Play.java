package interfaces;

import asciiPanel.AsciiPanel;
import world.World;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Play implements Window{
    private World world;
    private int height;
    private int width;
    List<String> msg;

    public Play(){
        height = 80;
        width = 23;
        msg = new ArrayList<String>();
    }

    private void createCreature(){

    }

    private void createLoot(){

    }

    public int scrollX(){
    return 0;
    }

    public int scrollY(){
        return 0;
    }

    public void reaction(){

    }

    public void displayPanes(){

    }

    public void displayMsg(){

    }

    @Override
    public void display(AsciiPanel panel) {

    }

    @Override
    public Window reaction(KeyEvent key) {
        return null;
    }
}
