package fr.uvsq.poo.monprojet.inventaire;

import java.util.List;

public class Inventaire {
    private Loot[] loot;

    public Loot[] getLoot() {
        return loot;
    }

    public Loot get(int i) {
        return loot[i];
    }

    public Inventaire(int max) {
        loot = new Loot[max];
    }

    public void addItem(Loot item) {
        for (int i = 0; i < loot.length; i++) {
            if (loot[i] == null) {
                loot[i] = item;
                break;
            }
        }
    }

    public void removeItem(Loot item) {
        for (int i = 0; i < loot.length; i++) {
            if (loot[i] == item) {
                loot[i] = null;
                return;
            }
        }
    }

    public boolean estPlein() {
        int taille = 0;
        for (int i = 0; i < loot.length; i++) {
            if (loot[i] != null) {
                taille++;
            }
        }
        return taille == loot.length;
    }

    public void moveItem() {

    }
}

    //public void destroyItem() {}

    //public void displayInventaire() {}

    //To add to creature:   //private Inventory inventory;
                            //public Inventory inventory() { return inventory; }
