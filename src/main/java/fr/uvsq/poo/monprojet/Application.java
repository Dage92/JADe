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

    /**
     * Cette méthode est destinée à initialiser et lancer l'exécution du programme.
     *
     * @param args les paramètres de la ligne de commande du shell
     */
    public void run(String[] args) {
        logger.trace("Début du programme");
        logger.trace("Fin du programme");
    }

    /**
     * La méthode de classe <em>main</em> se contente de déléguer le lancement du programme à la méthode <em>run</em>.
     *
     * @param args les paramètres de la ligne de commande du shell
     */
    public static void main(String[] args) {
        APPLICATION.run(args);
    }
}
