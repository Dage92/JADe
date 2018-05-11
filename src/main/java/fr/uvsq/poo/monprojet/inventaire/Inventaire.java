package fr.uvsq.poo.monprojet.inventaire;

import java.util.List;

/**
 * La Classe {@code Inventaire} sert a la gestion de l'inventaire.
 * @author GOODMAN David 21401471
 */
public class Inventaire {
    private Loot[] loot;

    /**
     * simple {@code get} de loot
     */
    public Loot[] getLoot() {
        return loot;
    }
    /**
     * simple {@code get} de l'indice
     * @param i
     */
    public Loot getIndice(int i) {
        return loot[i];
    }

    /**
     * Constructeur de {@code Inventaire}
     * @param capacite
     */
    public Inventaire(int capacite) {
        loot = new Loot[capacite];
    }

    /**
     * Methode qui ajoute un objet dans l'inventaire
     * @param item
     */
    public void addItem(Loot item) {
        for (int i = 0; i < loot.length; i++) {
            if (loot[i] == null) {
                loot[i] = item;
                break;
            }
        }
    }

    /**
     * Methode qui enleve un objet de l'inventaire
     * @param item
     */
    public void removeItem(Loot item) {
        for (int i = 0; i < loot.length; i++) {
            if (loot[i] == item) {
                loot[i] = null;
                return;
            }
        }
    }

    /**
     * Methode qui indique si l'inventaire est plein ou non
     */
    public boolean estPlein() {
        int taille = 0;
        for (int i = 0; i < loot.length; i++) {
            if (loot[i] != null) {
                taille++;
            }
        }
        return taille == loot.length;
    }

    /**
     * Methode qui deplace un objet dans l'inventaire
     * @param j
     * @param k
     */
    //public void moveItem(int j, int k) {
    //    Loot[] tmp;
    //    for (int i = 0; i < loot.length; i++) {
    //       if (loot[i] == loot[j]) {
    //            tmp[i] = loot[i];
    //            loot[i] = loot[j];
    //            loot[j] = tmp[i];
    //            return;
    //        }
    //    }
    //}
}