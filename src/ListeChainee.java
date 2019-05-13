public class ListeChainee {
    private Element liste;
    private int taille;
    private int tailleMax;

    public ListeChainee(){
        taille = 0;
        tailleMax = 100;
        liste = null;
    }
    public ListeChainee(int taille){
        taille = 0;
        tailleMax = taille;
        liste = null;
    }

    public boolean est_vide(ListeChainee liste){
        if(liste.taille == 0){
            return true;
        }else{
            return false;
        }
    }

    public ListeChainee empiler(ListeChainee liste, Element element){
        if(liste.taille <= liste.tailleMax){
            if(est_vide(liste)){
                liste.liste = element;
            }else{
                element.setSuivant(liste.liste);
                liste.liste = element;
            }
            liste.taille = liste.taille +1;
        }else{
            System.out.println("liste pleine, ajout impossible");
        }

        return liste;
    }

    public ListeChainee depiler(ListeChainee liste){
        if(!est_vide(liste)){
            if(liste.liste.getSuivant() != null){
                liste.liste = liste.liste.getSuivant();
            }else{
                liste.liste = null;
            }
            liste.taille = liste.taille -1;
        }else{
            System.out.println("liste vide");
        }
        return liste;
    }

    public int sommet(ListeChainee liste){
        return liste.liste.getValue();
    }

}
