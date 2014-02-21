public abstract class Personnage implements Comparable {
   // Déclaration des variables privées
   private String nom_;
   private char sexe_;

   // Modifie le nom avec celui en param
   public void setNom(String nom)
   {
   		if (!nom.trim().isEmpty())
   			nom_ = nom;
   }

   // Modifie le sexe selon le sexe en param
   public void setSexe(char sexe)
   {
   		if (sexe == 'M' || sexe == 'F')
   			sexe_ = sexe;
   }

   // Retourn le nom du personnage
   public String getNom()
   {
   		return nom_;
   }

   // Retourne le sexe du personnage
   public char getSexe()
   {
   		return sexe_;
   }

   // Comparaison des personnages
   public abstract int compareTo(Object objet);
}