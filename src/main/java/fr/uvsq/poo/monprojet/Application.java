package fr.uvsq.poo.monprojet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.lang.*;

/**
 * Enumeration {@code Application} contenant la methode principale de notre programme
 * @author GOODMAN David 21401471 & JACQUET Julien 21400579
 */

public enum Application {
    APPLICATION;

    private static final Logger logger = LogManager.getLogger(Application.class);

    /**Pour faire le ApplicationTest.java marcher*/
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
