package main.java.fr.uvsq.poo.monprojet;

 

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Cette classe est le programme principal du projet.
 *
 * Elle est une impl??mentation du <em>design pattern</em>
 * <a href="https://fr.wikipedia.org/wiki/Singleton_(patron_de_conception)">Singleton</a>.
 *
 * @author St??phane Lopes
 * @version f??v. 2018
 */
public enum Application {
    APPLICATION;

    private static final Logger logger = LogManager.getLogger(Application.class);

    /**
     * Un exemple de m??thode.
     */
    public String getGreetings() {
        return "Hello !";
    }

    /**
     * Cette m??thode est destin??e ?? initialiser et lancer l'ex??cution du programme.
     *
     * @param args les param??tres de la ligne de commande du shell
     */
    public void run(String[] args) {
        logger.trace("D??but du programme");
        System.out.println(getGreetings());
        logger.trace("Fin du programme");
    }

    /**
     * La m??thode de classe <em>main</em> se contente de d??l??guer le lancement du programme ?? la m??thode <em>run</em>.
     *
     * @param args les param??tres de la ligne de commande du shell
     */
    public static void main(String[] args) {
        APPLICATION.run(args);
    }
}
