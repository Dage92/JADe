package interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class Start implements Window{

    @Override
    public void display(AsciiPanel panel){
        panel.write("JADe", 1, 1);
        panel.writeCenter("Appuyer sur 'Entrer' pour jouer", 22);
    }

    @Override
    public Window reaction(KeyEvent key){
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}