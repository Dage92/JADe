package world;

public enum Pane{
  SOL((char)176, "Le sol."),
  MUR((char) 219,"Un mur infranchissable."),
  LIMITE((char) 255, "Nul ne sait ce qui ce passe par dela cette limite");

  private char symbole;
  private String def;

  public char symbole(){

      return symbole;
    }


  public String getDef(){

      return def;
    }



  Pane(char symbole, String def) {
        this.symbole = symbole;
        this.def = def;
  }





}
