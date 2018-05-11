package fr.uvsq.poo.monprojet.world;

import fr.uvsq.poo.monprojet.creatures.Creature;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe world represente le monde de notre Rogue-Like compose de {@code Panes}
 * @author JACQUET Julien 21400579
 */
public class World{
  private Pane[][] panes;
  private int height;
  private int width;
  List<Creature> creatures;

    /**
     * Constructeur de {@code World}
     * @param panes - tableau 2D de cases
     */
  public World(Pane[][] panes){
    this.panes = panes;
    this.width = panes.length;
    this.height = panes[0].length;
    this.creatures =new ArrayList<Creature>();
  }

    /**
     * simple {@code get} de la hauteur
     */
  public int getHeight(){
      return this.height;
  }
    /**
     * simple {@code get} de la largeur
     */
  public int getWidth(){
      return this.width;
  }

    /**
     * Methode qui renvoie une case
     * @param x - width
     * @param y - height
     * @return Pane
     */
  public Pane pane(int x, int y){
      if(x < 0 || x >= width || y < 0 || y >= height){
          return Pane.LIMITE;
      }
      else {
          return panes[x][y];
      }
  }

    /**
     * Methode qui renvoie la couleur d'une case
     * @param x - width
     * @param y - height
     * @return Color
     */
  public Color color(int x, int y){
      return pane(x, y).color();
  }

    /**
     * Methode qui renvoie le symbole d'une case
     * @param x - width
     * @param y - height
     * @return char
     */

  public char symbole(int x,int y){
      return pane(x,y).symbole();
  }

    /**
     *Verifie si il y a une creature a un emplacement donne
     * @param x - coordonne x de la creature demandee
     * @param y - coordonee y de la creature demandee
     * @return la creature demandee ou null
     */
  public Creature creature(int x, int y){
      for(Creature c : creatures){
          if(c.x == x && c.y == y){
              return c;
          }
      }
      return null;
  }

  public void placeCreature(int x,int y){


  }

  public void deleteCreature(Creature creature){


  }

  public void deleteLoot(/*Loot loot*/){


  }


}
