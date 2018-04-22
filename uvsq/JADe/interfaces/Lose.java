package interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class Lose implements Window {

    @Override
    public void display(AsciiPanel panel){
        panel.write("Game Over", 1, 1);
        panel.writeCenter("Appuyer sur 'Entrer' pour commencer un nouveau jeu", 22);
    }

    @Override
    public Window reaction(KeyEvent key){
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}
