package fr.uvsq.poo.monprojet.interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;
import java.util.List;

public class Communication implements Window {

    private List<String> msg;

    @Override
    public void display(AsciiPanel panel){
    }

    @Override
    public Window reaction(KeyEvent key){
        return null;
    }
}
