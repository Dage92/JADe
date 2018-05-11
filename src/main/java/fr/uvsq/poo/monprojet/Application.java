package fr.uvsq.poo.monprojet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.util.*;
import java.lang.*;
import asciiPanel.AsciiPanel;


/**
 * Enumeration {@code Application} contenant la methode principale de notre programme
 * @author GOODMAN David 21401471 & JACQUET Julien 21400579
 */

public class Application extends JFrame{
    //APPLICATION;
    private static final long serialVersionUID = 1060623638149583738L;
    private AsciiPanel panel;
    private static final Logger logger = LogManager.getLogger(Application.class);
    public static String greeting = "Hello!";

    public Application(){
        super();
        panel = new AsciiPanel();
        panel.writeCenter("JADe", 1);
        add(panel);
        pack();
    }

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
