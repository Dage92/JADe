package fr.uvsq.poo.monprojet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import asciiPanel.AsciiPanel;
import fr.uvsq.poo.monprojet.interfaces.Window;
import fr.uvsq.poo.monprojet.interfaces.Start;

/**
 * Enumeration {@code Application} contenant la methode principale de notre programme
 * @author GOODMAN David 21401471 et JACQUET Julien 21400579
 */
public class Application extends JFrame implements KeyListener {
    private static final Logger logger = LogManager.getLogger(Application.class);
    private static final long serialVersionUID = 1060623638149583738L;
    private AsciiPanel panel;
    private Window window;
    public static String greeting = "Hello!";

    public Application(){
        super();
        panel = new AsciiPanel();
        add(panel);
        pack();
        window = new Start();
        addKeyListener(this);
        repaint();
    }

    /**
     * Methode qui permet de regenerer l'interface graphique
     */
    @Override
    public void repaint(){
        panel.clear();
        window.display(panel);
        super.repaint();
    }

    /**
     * Methode qui permet d'identifier les inputs du joueur
     * @param userInput
     */
    @Override
    public void keyReleased(KeyEvent userInput){ }

    /**
     * Methode qui permet d'identifier les inputs du joueur
     * @param userInput
     */
    @Override
    public void keyPressed(KeyEvent userInput){
        window = window.reaction(userInput);
        repaint();
    }

    /**
     * Methode qui permet d'identifier les inputs du joueur
     * @param userInput
     */
    @Override
    public void keyTyped(KeyEvent userInput) { }

    /**
     * La methode de classe <em>main</em> se contente de deleguer le lancement du programme a la methode <em>run</em>.
     *
     * @param args les parametres de la ligne de commande du shell
     */
    public static void main(String[] args) {
        logger.trace("Debut du programme");
        System.out.println(Application.greeting);     //Pour le ApplicationTest.java
        Application GUI = new Application();
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        logger.trace("Fin du programme");
    }
}
