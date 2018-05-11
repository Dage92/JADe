package fr.uvsq.poo.monprojet.world;

import java.util.Random;

/**
 * La classe {@code WorldGenerator} sert a generer le monde de notre Rogue-Like de facon aleatoire.
 * (non procedurale)
 * @author JACQUET Julien 21400579
 */
public class WorldGenerator {
  private int height;
  private int width;
  private int paneX;
  private int paneY;
  private Pane[][] panes;

  private Random rand = new Random();
  private int Neighbours;
  private int Iterations;
  private int CloseCellProb;
  private boolean ProbExceeded;

    /**
     * Constructeur de {@code WorldGenerator}
     * @param width - largeur
     * @param height - hauteur
     */
  public WorldGenerator(int width, int height){
      this.width = width;
      this.height = height;
      this.panes = new Pane[width][height];
      this.Neighbours = 4;
      this.Iterations = 50000;
      this.ProbExceeded = true;
      this.paneX = width;
      this.paneY = height;
      this.CloseCellProb = 45;
  }

  public World build(){
      return new World(panes);
  }

    /**
     * Cette methode est l'algorithme de generation aleatoire :
     * Inspire de l'algorithme en C# disponible ici : http://www.evilscience.co.uk/map-generator/ et readapte au JAVA.
     * Similaire a une forme de "Jeu de la vie".
     * @return WolrdGenerator
     */
  public WorldGenerator generate(){
      int neigh = 0;
      for(int i = 0; i < width; i++){
        for(int j = 0 ; j < height ; j++){
            if(rand.nextInt(100)< CloseCellProb){
                panes[i][j] = Pane.SOL;
            }
        }
    }

    for(int i = 0; i < Iterations ; i++){
        int rX = rand.nextInt(this.width);
        int rY = rand.nextInt(this.height);
        neigh = examineNeighbours(rX,rY);

        if (ProbExceeded) {
            if(neigh > Neighbours){
                panes[rX][rY] = Pane.MUR;
            }
            else{
                panes[rX][rY] = Pane.SOL;
            }
        }
        else {
            if(neigh > Neighbours){
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
     * Methode privee evaluant les voisins d'une case pour {@code generate}
     * @param xVal - coordonnee x de la case
     * @param yVal - coordonnee y de la case
     * @return - compteur de checkPanel
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
     * Methode privee qui test le type d'une case {@code examineNeighbours}
     * @param x - coordonnee x de la case
     * @param y - coordonnee y de la case
     * @return true si la case est du SOL sinon false
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

    /**
     * OBSOLETE : Cette methode est la methode basique pour generer un monde aleatoire base sur des probabilite d'etre du sol ou un mur. Cette methode est obsolete.
     * @return WorldGenerator aleatoire pur, donc un nuage aleatoire de sol ou mur.
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
     * Appel a generate, est communement utilise comme methode de generation du monde.
     * @return WorldGenerator
     */
  public WorldGenerator makeDungeon(){
    return generate();
    }

}
