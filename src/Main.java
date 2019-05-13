import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("veuillez choisir votre représentation");
        System.out.println("1- tableau");
        System.out.println("2- liste chainée");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        switch (value)
        {
            case 1:
                menuPile();
                break;
            case 2:
                menuListeChainee();
                break;
                default:
                    System.out.println("valeur non reconnue ! ");
        }

    }
    public static void showMenu(){
        System.out.println("veuillez choisir votre une action");
        System.out.println("1- Ajouter element");
        System.out.println("2- Enlever element");
        System.out.println("3- Afficher 1er element");
        System.out.println("4- Est vide ?");
        System.out.println("5- quitter");
    }

    public static void menuPile(){
        Pile pile = new Pile();
        boolean fini = false;
        while (!fini){
            showMenu();
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            switch (value){
                case 1 :
                    System.out.println("veuillez entrer une valeur");
                    Scanner sc2 = new Scanner(System.in);
                    int value2 = sc2.nextInt();
                    pile = pile.empiler(pile, value2);
                    break;
                case 2 :
                    pile = pile.depiler(pile);
                    break;
                case 3 :
                    System.out.println(pile.sommet(pile));
                    break;
                case 4 :
                    if(pile.est_vide(pile)){
                        System.out.println("liste vide");
                    }else{
                        System.out.println("liste non vide");
                    }
                    break;
                case 5 :
                    System.out.println("aurevoir");
                    break;
                default:
                    System.out.println("valeur non reconnu");
            }
        }
    }
    public static void menuListeChainee(){
        ListeChainee liste = new ListeChainee();
        boolean fini = false;
        while (!fini){
            showMenu();
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            switch (value){
                case 1 :
                    System.out.println("veuillez entrer une valeur");
                    Scanner sc2 = new Scanner(System.in);
                    int value2 = sc2.nextInt();
                    liste = liste.empiler(liste, new Element(value2));
                    break;
                case 2 :
                    liste = liste.depiler(liste);
                    break;
                case 3 :
                    System.out.println(liste.sommet(liste));
                    break;
                case 4 :
                    if(liste.est_vide(liste)){
                        System.out.println("liste vide");
                    }else{
                        System.out.println("liste non vide");
                    }
                    break;
                case 5 :
                    System.out.println("aurevoir");
                    break;
                    default:
                        System.out.println("valeur non reconnu");
            }
        }
    }
}
