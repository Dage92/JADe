package world;

import creatures.Creatures;

import java.util.List;
import java.util.Objects;

public class World{
  private Pane[][] panes;
  private int height;
  private int width;
  List<Creatures> creatures;

  World (Pane[][] panes){
    this.panes = panes;
    this.width = panes.length;
    this.height = panes.length;

  }

  public Pane pane(int x, int y){
      if(x < 0 || x >= width || y < 0 || y >= height){
          return Pane.LIMITE;
      }
      else {
          return panes[x][y];
      }
    }

  public char symbole(int x,int y){

      return pane(x,y).getSymbole();
  }

  public void /*Creatures*/ creature(int x, int y){

  }

  public void placeCreature(int x,int y){


  }

  public void deleteCreature(Creatures creature){


  }

  public void deleteLoot(/*Loot loot*/){


  }


}
