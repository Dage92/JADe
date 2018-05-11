package fr.uvsq.poo.monprojet.world;

import asciiPanel.AsciiPanel;

import java.awt.*;

/**
 * L'enumeration des {@code Pane} a l'origine on souhaitait appeler cette classe {@code Case} pour des raisons evidentes mais "case" (en minuscule) existe deja en JAVA et entrainait toutes sortes de conflits.
 * @author JACQUET Julien 21400579
 */
public enum Pane{
  SOL((char)176, AsciiPanel.brightBlack ,"Le sol."),
  MUR((char) 219,AsciiPanel.white, "Un mur infranchissable."),
  LIMITE((char) 255, AsciiPanel.brightWhite, "Nul ne sait ce qui ce passe par dela cette limite");
  private char symbole;
  private String def;
  private Color color;

    /**
     * get de {@code symbole}
     * @return char
     */
  public char symbole(){
      return this.symbole;
    }

    /**
     * get de {@code def}
     * @return String
     */
  public String def(){
      return this.def;
    }

    /**
     * get de {@code color}
     * @return
     */
    public Color color(){
      return this.color;
    }


    /**
     * constructeur d'une Case/Pane.
     * @param symbole
     * @param brightBlack
     * @param def
     */
  Pane(char symbole, Color brightBlack, String def) {
        this.symbole = symbole;
        this.color = color;
        this.def = def;
  }
}
