package interfaces;

import world.World;

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

    }

    public int scrollY(){

    }

    public void reaction(){

    }

    public void displayPanes(){

    }

    public void displayMsg(){

    }
}
