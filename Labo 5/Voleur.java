/////////////////////////////////////////////////
// S O R C I E R S _ E T _ V O L E U R S
/////////////////////////////////////////////////
// Fait par: Alexis Lalonde
// Le 24 f�vrier 2014
// But: jeu fantastique dans lequel �volue des
//      personnages
/////////////////////////////////////////////////
// Voleur.java
/////////////////////////////////////////////////

public final class Voleur extends Personnage implements Comparable {
   // D�claration des variables priv�es
   private int nbLarcins_ = 0;
   private int comparaisonSexe = 0;	// Compare les sexes des sorciers/sorci�res (femelle = 1, m�le = 2)
   static private int nbVoleurs_ = 0;

   // Constructeur � 3 attributs
   public Voleur(String nom, char sexe, int nbLarcins)
   {
   		setNom(nom);
		setSexe(sexe);
		setNbLarcins(nbLarcins);
		nbVoleurs_++;
   }

   // Constructeur � 2 attributs
   public Voleur(String nom, char sexe)
   {
   		setNom(nom);
		setSexe(sexe);
		setNbLarcins(nbLarcins_);
		nbVoleurs_++;
   }

   // Modifie le nombre de larcins selon le nombre en param�tre
   private void setNbLarcins(int nbLarcins)
   {
   		if (nbLarcins >= 0)
   			nbLarcins_ = nbLarcins;
   }

   // Incr�mente le nombre de larcins par 1
   public void incNbLarcins()
   {
   		nbLarcins_++;
   }

   // Retourne le nombre de voleurs
   static public int getNbVoleurs()
   {
   		return nbVoleurs_;
   }

   // Retourne le nombre de larcins
   private int getNbLarcins()
   {
   		return nbLarcins_;
   }

   // Affiche la pr�sentation du voleur selon son sexe
   public String toString()
   {
   		String sexe = "un voleur";

   		if (getSexe() == 'F')
   			sexe = "une voleuse";

   		return "Mon nom est " + getNom() + " et je suis " + sexe + " ayant commis " + getNbLarcins() + " larcin(s)";
   }
   
    // Compare les sexes des voleurs pour d�terminer le plus fort (femelle < m�le)
   	private int comparerSexe (Object objet)
   	{
   		Voleur o = (Voleur)objet;
   		if(o.getSexe() == 'F')
   			comparaisonSexe = 1;
   			
   		if(o.getSexe() == 'M')
   			comparaisonSexe = 2;
   			
   		return comparaisonSexe;
   	}
   
   // Surcharger "equals()" pour comparer le nombre de larcins
   @Override
   public boolean equals(Object objet)
   {
       return objet.equals(getNbLarcins());
   }
   
   // Surcharger "compareTo()" pour comparer les voleurs/voleuses
   @Override
   public int compareTo(Object objet)
   {
   		Voleur o = (Voleur)objet;
   		int resultat = 0;
   	
   		if(this.getNbLarcins() < o.getNbLarcins())
   			resultat = -1;
   			
   		if(this.getNbLarcins() == o.getNbLarcins())
    	{
    		if (comparerSexe(this) < comparerSexe(o))
    			resultat = -1;
    		if (comparerSexe(this) == comparerSexe(o))
    			resultat = 0;
    		if (comparerSexe(this) > comparerSexe(o))
    			resultat = 1;
    	}
    	
    	if(this.getNbLarcins() > o.getNbLarcins())
   			resultat = 1;
   			
   		return resultat;
   }
}