// Importation de la classe ArrayList du package java.util
import java.util.ArrayList;

// Définition de la classe principale Main
public class Main {
    
    // Méthode principale main qui est le point d'entrée de l'application
    public static void main(String[] args) {
        

        // Création d'une ArrayList pour stocker des objets de type Baleine
        ArrayList<BaleineTri> arrayListBaleines = new ArrayList<>();
        
        // Ajout de trois baleines à l'ArrayList avec leurs caractéristiques respectives
        arrayListBaleines.add(new BaleineTri("Baleine bleue", 10, 30,15000 )); // Baleine bleue de 30 mètres pesant 10 tonnes/mètre et avec une estimation de 15000 individus
        arrayListBaleines.add(new BaleineTri("Baleine à bosse", 5, 15, 80000)); // Baleine à bosse de 15 mètres pesant 5 tonnes/mètre et avec une estimation de 80000 individus
        arrayListBaleines.add(new BaleineTri("Baleine grise", 3, 14, 26000)); // Baleine grise de 14 mètres pesant 3 tonnes/mètre et avec une estimation de 26000 individus


        // Boucle pour afficher le nom et le poids au mètre de chaque baleine
        for (BaleineTri baleine : arrayListBaleines) { //for each
            System.out.println(baleine.toString());
            System.out.println("Main: " + baleine.getNom() + " - Poids au mètre: " + baleine.poidsAuMetre() + " tonnes/mètre");
            System.out.println(baleine);
            System.out.println();
        }
        
        // Imprime une ligne vide pour séparer les sections d'affichage
        System.out.println();

        // Appel de la méthode pour trier les baleines par poids total estimé et les afficher
        trierEtAfficherCetacesParPoidsTotal(arrayListBaleines);
    }

    // Méthode pour trier une liste de baleines par poids total estimé et les afficher
    // Je crée un ArrayList d'objets BaleineTri que je nomme 'baleines'.
    public static void trierEtAfficherCetacesParPoidsTotal(ArrayList<BaleineTri> baleines) {
        
        // Boucle externe pour parcourir la liste de baleines
        //Pour chaque index, en commençant par 0 jusqu'à l'avant-dernier index de ma liste, j'effectue une itération avec un pas de 1."
        for (int i = 0; i < baleines.size() - 1; i++) {
            
            // Boucle interne pour comparer chaque baleine avec les suivantes dans la liste
            //"Dans la boucle interne, pour chaque index, en commençant par i+1 jusqu'au dernier index de ma liste, j'effectue une itération avec un pas de 1."
            for (int j = i + 1; j < baleines.size(); j++) {
                
                // Si la baleine à l'index j a un poids total estimé supérieur à celle à l'index i, elles sont échangées
                if (baleines.get(j).poidsTotalEstime() > baleines.get(i).poidsTotalEstime()) {
                    // Je crée une copie temporaire (ou une variable temporaire) de l'élément à l'index i de la liste baleines et je la stocke dans la variable temp. Cette étape est nécessaire pour éviter la perte de données lors de l'échange.
                    BaleineTri temp = baleines.get(i);
                    // Cette ligne remplace l'élément à l'index i de la liste baleines par l'élément situé à l'index j. Ainsi, l'élément qui était à la position j est maintenant à la position i.
                    baleines.set(i, baleines.get(j));
                    //cette ligne remplace l'élément à l'index j de la liste baleines par la valeur stockée dans la variable temp. Comme nous l'avons vu précédemment, temp contenait à l'origine l'élément de l'index i, donc cet échange rétablit correctement l'ordre
                    baleines.set(j, temp);
                
                }
            }
        }

        // Affichage du titre pour la section des baleines triées
        System.out.println("Cétacés par ordre du poids total estimé:");
        
        // Boucle pour afficher le nom et le poids total estimé de chaque baleine
        for (BaleineTri baleine : baleines) {
            System.out.println(baleine.getNom() + " - Poids total estimé: " + baleine.poidsTotalEstime() + " tonnes");
        }
    }
}
