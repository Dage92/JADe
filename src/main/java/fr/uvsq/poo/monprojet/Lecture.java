import world.World;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * La classe {@code Lecture} sert a charger le monde avec un fichier de sauvegarde.
 * @author JACQUET Julien 21400579
 */

public class Lecture{

    /**
     * La methode Load charge un nouveau {@code world} depuis un fichier de sauvegarde situe a : "../save/save1.ser"
     * @throws IOException
     */
    public void load() throws IOException {
        ObjectInputStream serObj = null;
        try {
            FileInputStream fin = new FileInputStream("../save/save1.ser");
            serObj = new ObjectInputStream(fin);
            World worldread = (World) serObj.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serObj != null) {
                serObj.close();
            }
        }
    }
}
