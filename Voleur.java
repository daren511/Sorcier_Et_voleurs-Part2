public final class Voleur extends Personnage implements Comparable {
   // Déclaration des variables privées
   private int nbLarcins_ = 0;
   private int comparaisonSexe = 0;	// Compare les sexes (femme = 1 homme = 2)
   static private int nbVoleurs_ = 0;

   // Constructeur à 3 attributs
   public Voleur(String nom, char sexe, int nbLarcins)
   {
   		setNom(nom);
		setSexe(sexe);
		setNbLarcins(nbLarcins);
		nbVoleurs_++;
   }

   // Constructeur à 2 attributs
   public Voleur(String nom, char sexe)
   {
   		setNom(nom);
		setSexe(sexe);
		setNbLarcins(nbLarcins_);
		nbVoleurs_++;
   }

   // Modifie le nombre de larcins selon le nombre en paramètre
   private void setNbLarcins(int nbLarcins)
   {
   		if (nbLarcins >= 0)
   			nbLarcins_ = nbLarcins;
   }

   // Incrémentation le nombre de larcins
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

   // Affiche le voleur selon son sexe
   public String toString()
   {
   		String sexe = "un voleur";

   		if (getSexe() == 'F')
   			sexe = "une voleuse";

   		return "Mon nom est " + getNom() + " et je suis " + sexe + " ayant commis " + getNbLarcins() + " larcin(s)";
   }

    // Compare les sexes des voleurs pour déterminer le plus fort (femelle < mâle)
   	private int comparerSexe (Object objet)
   	{
   		Voleur o = (Voleur)objet;
   		if(o.getSexe() == 'F')
   			comparaisonSexe = 1;

   		if(o.getSexe() == 'M')
   			comparaisonSexe = 2;

   		return comparaisonSexe;
   	}

   // Surcharge de equals() pour comparer le nombre de larcins
   @Override
   public boolean equals(Object objet)
   {
       return objet.equals(getNbLarcins());
   }

   // Surcharge de compareTo() pour comparer les voleurs
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