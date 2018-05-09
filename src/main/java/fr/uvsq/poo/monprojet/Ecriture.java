import java.io.*;

/**
 * La Classe {@code Ecriture} sert a sauvegarder l'état d'un monde avant de quitter
 *@author JACQUET Julien 21400579
 */

public class Ecriture implements Serializable {

    private static final String filepath =" ../save/save1.ser";

    /**
     * Le methode ecrit l'objet {@code World} dans un fichier.
     * @param serObj
     * @throws IOException
     */
    public void WriteObject(Object serObj) throws IOException {
        ObjectOutputStream objOut = null;
        try{
            FileOutputStream fout = new FileOutputStream(filepath);
            objOut = new ObjectOutputStream(fout);
            objOut.writeObject(serObj);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            objOut.close();
        }
    }
}
