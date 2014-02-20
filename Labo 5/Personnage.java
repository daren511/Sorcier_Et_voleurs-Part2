/////////////////////////////////////////////////
// S O R C I E R S _ E T _ V O L E U R S
/////////////////////////////////////////////////
// Fait par: Alexis Lalonde
// Le 24 f�vrier 2014
// But: jeu fantastique dans lequel �volue des
//      personnages
/////////////////////////////////////////////////
// Personnage.java
/////////////////////////////////////////////////

public abstract class Personnage implements Comparable {
   // D�claration des variables priv�es
   private String nom_;
   private char sexe_;
   
   // Modifie le nom du personnage selon le nom en param�tre
   public void setNom(String nom)
   {
   		if (!nom.trim().isEmpty())
   			nom_ = nom;
   }
   
   // Modifie le sexe du personnage selon le sexe en param�tre
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