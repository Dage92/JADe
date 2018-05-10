package world;

import creatures.Creature;

import java.awt.*;
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
     * Constructeur de {@code world}
     * @param panes
     */
  World(Pane[][] panes){
    this.panes = panes;
    this.width = panes.length;
    this.height = panes[0].length;
  }

    /**
     * default constructor
     */
  World() {

  }

    /**
     * simple {@code set} de la hauteur
     * @param h
     */
    public void setHeight(int h){
      this.height = h;
  }
    /**
     * simple {@code set} de la largeur
     * @param w
     */
  public void setWidth(int w){
      this.width = w;
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
     * @param x
     * @param y
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
     * @param x
     * @param y
     * @return Color
     */
  public Color color(int x, int y){
      return pane(x, y).color();
  }

    /**
     * Methode qui renvoie le symbole d'une case
     * @param x
     * @param y
     * @return char
     */

  public char symbole(int x,int y){

      return panes[x][y].symbole();
  }

  public void /*Creatures*/ creature(int x, int y){

  }

  public void placeCreature(int x,int y){


  }

  public void deleteCreature(Creature creature){


  }

  public void deleteLoot(/*Loot loot*/){


  }


}
