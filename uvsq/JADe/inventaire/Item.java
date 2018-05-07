package inventaire;

public class Item {

    private char symbole;
    public char getSymbole(){
        return symbole;
    }

    private  String name;
    public String getName(){
        return name;
    }

    private String appearance;
    public String getAppearance(){
        return appearance;
    }

    private int attackValue;
    public int attackValue(){
        return attackValue();
    }
    public int modifyAttackValue(int amount){
        return attackValue += amount;
    }

    public Item(char symbole, String name, String appearance){
        this.symbole = symbole;
        this.name = name;
        this.appearance = appearance == null ? name : appearance;
    }

    public String details(){
        String details ="";

        if(attackValue != 0){
            details += "attack :" + attackValue;
        }
        //possibilite d'ajouter plus de champs

        return details;
    }
}
