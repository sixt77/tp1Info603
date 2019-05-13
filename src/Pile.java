import javax.xml.bind.Element;

public class Pile {
    private int tailleMax;
    private int taille;
    public int[] liste;
    public Pile(){
        this.tailleMax = 100;
        this.taille = 0;
        this.liste = new int[100];
    }
    public Pile(int taille){
        this.tailleMax = taille;
        this.taille = 0;
        this.liste = new int[taille];
    }

    public boolean est_vide(Pile pile){
        if(pile.taille == 0){
            return true;
        }else{
            return false;
        }
    }

    public Pile empiler(Pile pile, int element){
        for (int i = pile.taille; i > 0; i--){
            pile.liste[i]=pile.liste[i-1];
        }
        pile.liste[0] = element;
        pile.taille = pile.taille+1;
        return pile;
    }

    public Pile depiler(Pile pile){
        if(pile.taille == 0){
            for (int i = 0; i < pile.taille; i++){
                pile.liste[i]=pile.liste[i+1];
            }
            pile.taille = pile.taille-1;
        }else{
            System.out.println("pile vide");
        }
        return pile;
    }

    public int sommet(Pile pile){
        return pile.liste[0];
    }

}
