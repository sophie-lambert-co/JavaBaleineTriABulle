// Définition de la classe Baleine
public class BaleineTri {
    
    // Attributs privés de la classe Baleine
    private String nom;       // Nom de la baleine
    private double taille;    // Taille de la baleine en mètres
    private double poids;     // Poids de la baleine en tonnes
    private int nombre;       // Nombre estimé de baleines de ce type

    // Constructeur de la classe Baleine
    public BaleineTri(String nom, double taille, double poids, int nombre) {
        this.nom = nom;               // Initialisation du nom
        this.taille = taille;         // Initialisation de la taille
        this.poids = poids;           // Initialisation du poids
        this.nombre = nombre;         // Initialisation du nombre
    }

     // Constructeur de la classe Baleine
    public BaleineTri(String nom, double taille, double poids) {
        this.nom = nom;               // Initialisation du nom
        this.taille = taille;         // Initialisation de la taille
        this.poids = poids;           // Initialisation du poids
    }

     public BaleineTri(String nom) {
        this.nom = nom;               // Initialisation du nom
    }


    // Méthode pour calculer le poids de la baleine par mètre
    public double poidsAuMetre() {
        return poids / taille;        // Retourne le poids divisé par la taille
    }

    // Méthode pour estimer le poids total de toutes les baleines de ce type
    public double poidsTotalEstime() {
        return poids * nombre;        // Retourne le poids multiplié par le nombre
    }

    // Méthode getter pour obtenir le nom de la baleine
    public String getNom(){
        return this.nom;              // Retourne le nom de la baleine
    }

    // Méthode pour convertir les attributs de la baleine en une chaîne de caractères
    @Override
    public String toString() {
        return "toString: Nom: " + nom + ", Taille: " + taille + " mètres, Poids: " + poids + " tonnes, Nombre: " + nombre;
    }

    
}

