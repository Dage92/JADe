package world;

public class WorldGenerator{
  private int height;
  private int width;
  private Pane[][] panes;

  public WorldGenerator(int width, int height){
      this.width = width;
      this.height = height;
      this.panes = new Pane[width][height];

  }

  public World Create(){
      return new World(panes);

  }

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


  private WorldGenerator linker(){
    Pane[][] panes2 = new Pane[width][height];
    //incomplet similaire jeu de la vie
    return this;
  }

  public boolean isPlayable(){
    return true;
  }

  public WorldGenerator makeDungeon(){
    return generateRandomPanes();
        /*linker(); incomplet*/
  }

}
