import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // pour ajouter les produits
        Boutique boutique = new Boutique();

        /*Produit produit1 = new Produit("cahier", "element permettant de prendre note");
        Produit produit2 = new Produit("livre" , "permet de lire");
        Produit produit3 = new Produit("stylo " , "pour ecrire dans un cahier");*/

        boutique.addProduit(new ProduitElectronique("ordinateur", "pc pour travailler",50000, 20));
        boutique.addProduit(new ProduitAlimentaire("plantain","banane plantain",500, "12/11/2023"));
        boutique.addProduit(new ProduitBoissons("oasis", "jus naturelle" ,24, 2));
        boutique.afficherStock();


        Panier panier = new Panier();
        panier.addProduit(new ProduitElectronique("ordinateur", "pc pour travailler",50000, 20));
        panier.addProduit(new ProduitAlimentaire("plantain","banane plantain",500, "12/11/2023"));
        panier.addProduit(new ProduitBoissons("oasis", "jus naturelle" ,24, 2));

        System.out.println("prix total du panier :" + panier.prixTotalPanier());




    }
}