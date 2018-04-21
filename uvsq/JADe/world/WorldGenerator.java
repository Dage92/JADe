package world;

import java.util.Random;

public class WorldGenerator{
  private int height = 99;
  private int width = 99;
  public Pane[][] panes;

  Random rand = new Random();
  public int Neighbours;
  public int Iterations;
  public int PaneX;
  public int PaneY;
  public int CloseCellProb;
  public boolean ProbExceeded;

  public WorldGenerator(){
      Neighbours = 4;
      Iterations = 50000;
      ProbExceeded = true;
      PaneX = width;
      PaneY = height;
      CloseCellProb = 45;
  }

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

        if(ProbExceeded == true){
            if(examineNeighbours(rX,rY) > Neighbours){
                panes[rX][rY] = Pane.SOL;
            }
            else{
                panes[rX][rY] = Pane.MUR;
            }
        }
        else{
            if(examineNeighbours(rX,rY) > Neighbours){
                panes[rX][rY] = Pane.MUR;
            }
            else{
                panes[rX][rY] = Pane.SOL;
            }
        }
    }
    return this;
  }

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
  /*
  public WorldGenerator(int width, int height){
      this.width = width;
      this.height = height;
      this.panes = new Pane[width][height];

  }
  */

  public World Create(){
      return new World(panes);

  }
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

/*
  private WorldGenerator linker(){
    Pane[][] panes2 = new Pane[width][height];

    return this;
  }
*/
  public boolean isPlayable(){
    return true;
  }

  /*
  public WorldGenerator makeDungeon(){
    return generateRandomPanes();
        /*linker(); incomplet*/

    //}

}
