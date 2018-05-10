package fr.uvsq.poo.monprojet.world;

import java.util.Random;

/**
 * La classe {@code WorldGenerator} sert a generer le monde de notre Rogue-Like de facon aleatoire.
 * (non procedurale)
 * @author JACQUET Julien 21400579
 */
public class WorldGenerator extends World {
  private int height;
  private int width;
  private int paneX;
  private int paneY;
  public Pane[][] panes;

  private Random rand = new Random();
  private int Neighbours;
  private int Iterations;
  private int CloseCellProb;
  private boolean ProbExceeded;

    /**
     * Constructeur de {@code WorldGenerator}
     * @param width
     * @param height
     */
  public WorldGenerator(int width, int height){
      Neighbours = 4;
      Iterations = 50000;
      ProbExceeded = true;
      paneX = width;
      paneY = height;
      CloseCellProb = 45;
  }

    /**
     * Cette methode est l'algorithme de generation aleatoire :
     * Inspire de l'algorithme en C# disponible ici : http://www.evilscience.co.uk/map-generator/ et readapte au JAVA.
     * @return WolrdGenerator
     */
  public WorldGenerator  generate(){
      for(int i = 0; i < width; i++){
        for(int j = 0 ; j < height ; j++){
            if(rand.nextInt(100)< CloseCellProb){
                panes[i][j] = Pane.SOL;
            }
        }
    }

    for(int i = 0; i < Iterations ; i++){
        int rX = rand.nextInt(width);
        int rY = rand.nextInt(height);

        if (ProbExceeded) {
            if(examineNeighbours(rX,rY) > Neighbours){
                panes[rX][rY] = Pane.MUR;
            }
            else{
                panes[rX][rY] = Pane.SOL;
            }
        }
        else {
            if(examineNeighbours(rX,rY) > Neighbours){
                panes[rX][rY] = Pane.SOL;
            }
            else{
                panes[rX][rY] = Pane.MUR;
            }
        }
    }
    return this;
  }

    /**
     * Methode privee necessaire au fonctionnement de {@code generate}
     * @param xVal
     * @param yVal
     * @return
     */
  private int examineNeighbours(int xVal, int yVal){
      int count = 0;
      for(int i = -1; i < 2 ; i++){
          for(int j = -1; j < 2 ; j++){
              if(checkPane(xVal + i, yVal + j)){
                  count += 1;
              }
          }
      }
      return count;
  }

    /**
     * Methode privee necessaire au fonctionnement de {@code generate}
     * @param x
     * @param y
     * @return
     */
  private Boolean checkPane(int x, int y){
      if(x >= 0 & x < width & y >= 0 & y<height){
          if(panes[x][y] == Pane.SOL){
              return true;
          }
          else{
              return false;
          }
      }
      else{
          return false;
      }
  }

  public World Create(){
      return new World(panes);
  }

    /**
     * @deprecated Cette methode est la methode basique pour generer un monde aleatoire base sur des probabilite d'etre du sol ou un mur.
     * @return
     */
/*
  private WorldGenerator generateRandomPanes(){
      for(int x = 0; x < width; x++){
          for(int y = 0; y < height ; y++){
              if(Math.random() <= 0.5){
                  panes[x][y] = Pane.SOL;
              }
              else{
                  panes[x][y] = Pane.MUR;
              }
          }
      }
      return this;
  }
*/

    /**
     * Appel commun a generate, est communement utilise comme methode de generation du monde.
     * @return WorldGenerator
     */
  public WorldGenerator makeDungeon(){
    return generate();
    }

}
