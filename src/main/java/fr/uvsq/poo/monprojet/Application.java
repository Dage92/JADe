package fr.uvsq.poo.monprojet;

import main.java.fr.uvsq.poo.monprojet.interfaces.DisplayGUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.util.*;
import java.lang.*;

/**
 * Enumeration {@code Application} contenant la methode principale de notre programme
 * @author GOODMAN David 21401471 & JACQUET Julien 21400579
 */

public enum Application {
    APPLICATION;

    private static final Logger logger = LogManager.getLogger(Application.class);

    /**Pour faire ApplicationTest.java marcher*/
    public String getGreetings() {
        return "Hello !";
    }

    /**
     * Cette methode est destinee a initialiser et lancer l'execution du programme.
     *
     * @param args les parametres de la ligne de commande du shell
     */

    public void run(String[] args) {
        logger.trace("Debut du programme");
        System.out.println(getGreetings());     /**Pour le ApplicationTest.java*/
        DisplayGUI GUI = new DisplayGUI();
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
        logger.trace("Fin du programme");
    }

    /**
     * La methode de classe <em>main</em> se contente de deleguer le lancement du programme a la methode <em>run</em>.
     *
     * @param args les parametres de la ligne de commande du shell
     */
    public static void main(String[] args) {
        APPLICATION.run(args);
    }
}
