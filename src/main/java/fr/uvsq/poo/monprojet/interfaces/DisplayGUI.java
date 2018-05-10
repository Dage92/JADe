package main.java.fr.uvsq.poo.monprojet.interfaces;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;

public class DisplayGUI extends JFrame{
    private AsciiPanel panel;

    public DisplayGUI(){
        super();
        panel = new AsciiPanel();
        panel.writeCenter("rl tutorial", 1);
        add(panel);
        pack();
    }
}
