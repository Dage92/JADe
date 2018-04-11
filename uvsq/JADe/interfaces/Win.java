package interfaces;

public class Win implements Window {

    @Override
    public void display(AsciiPanel panel){
        panel.write("GG", 1, 1);
        panel.writeCenter("Appuyer sur 'Entrer' pour commencer un nouveau jeu", 22);
    }

    @Override
    public Window reaction(KeyEvent key){
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new Play() : this;
    }
}
