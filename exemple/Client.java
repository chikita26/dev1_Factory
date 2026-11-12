public class Client {

    public static void main(String[] args) {

        System.out.println("bonjour le monde");

        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;

        //affiche un produit de type A
        Produit produitA = fabriqueproduit.createProduit(fabriqueproduit.typeA);
        produitA.methodeproduit();

        //affiche un produit de type B
        Produit produitB = fabriqueproduit.createProduit(fabriqueproduit.typeB);
        produitB.methodeproduit();

        //affiche un produit de type C
        Produit produitC = fabriqueproduit.createProduit(fabriqueproduit.typeC);
        produitC.methodeproduit();

        //produit inexistant
        String d="D"
        produit = fabriqueproduit.createProduit(d);
        produit.methodeproduit();

    }
}