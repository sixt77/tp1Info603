public class Element {
    private int valeur;
    private Element suivant;

    public Element(int valeur){
        this.valeur = valeur;
        this.suivant = null;
    }

    public int getValue(){
        return this.valeur;
    }

    public void setSuivant(Element element){
        this.suivant = element;
    }

    public Element getSuivant(){
        return this.suivant;
    }

}
