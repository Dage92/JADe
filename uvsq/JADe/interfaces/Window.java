package interfaces;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public interface Window {
    public void display(AsciiPanel panel);

    public Window reaction(KeyEvent key);
}