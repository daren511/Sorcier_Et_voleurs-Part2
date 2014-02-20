/////////////////////////////////////////////////
// S O R C I E R S _ E T _ V O L E U R S
/////////////////////////////////////////////////
// Fait par: Alexis Lalonde
// Le 24 f�vrier 2014
// But: jeu fantastique dans lequel �volue des
//      personnages
/////////////////////////////////////////////////
// Sorcier.java
/////////////////////////////////////////////////

public class Sorcier extends Personnage implements Comparable {
	// D�claration des variables priv�es
   	private String typeSorcier_ = "inconnu";	// Si aucun type d�clar�, il sera � "inconnu" par d�faut
   	private int puissanceType = 0;	// La puissance du type pour la comparaison (air = 1, eau = 2, feu = 3 et terre = 4)
   	private int comparaisonSexe = 0;	// Compare les sexes des sorciers/sorci�res (m�le = 1, femelle = 2)
   	static private int nbSorciers_ = 0;

   	// Constructeur � 3 param�tres
	public Sorcier(String nom, char sexe, String type)
	{
		setNom(nom);
		setSexe(sexe);
		setType(type);
		nbSorciers_++;
	}

	// Constructeur � 2 param�tres
	public Sorcier(String nom, char sexe)
	{
		setNom(nom);
		setSexe(sexe);
		setType(typeSorcier_);
		nbSorciers_++;
	}

	// Modifie le type du sorcier selon le type en param�tre et attribut la puissance (air < eau < feu < terre)
	public void setType(String type)
	{
		if (type.equals("eau") || type.equals("feu") || type.equals("terre") || type.equals("air"))
		{
			typeSorcier_ = type;
			
			if (type.equals("air"))
				puissanceType = 1;
			if (type.equals("eau"))
				puissanceType = 2;
			if (type.equals("feu"))
				puissanceType = 3;
			if (type.equals("terre"))
				puissanceType = 4;
		}
	}

	// Retourne le nombre de sorciers
   	static public int getNbSorciers()
   	{
   		return nbSorciers_;
   	}

   	// Retourne le type du sorcier
   	private String getType()
   	{
   		return typeSorcier_;
   	}

   	// Affiche la pr�sentation du sorcier selon son sexe
   	public String toString()
   	{
   		String sexe = "un sorcier";

   		if (getSexe() == 'F')
   			sexe = "une sorciere";

   		return "Mon nom est " + getNom() + " et je suis " + sexe + " de type " + getType();
   	}
   	
   	// Compare les sexes des sorciers pour d�terminer le plus fort (m�le < femelle)
   	private int comparerSexe (Object objet)
   	{
   		Sorcier o = (Sorcier)objet;
   		if(o.getSexe() == 'M')
   			comparaisonSexe = 1;
   			
   		if(o.getSexe() == 'F')
   			comparaisonSexe = 2;
   			
   		return comparaisonSexe;
   	}

   	// Surcharger "equals()" pour comparer le type des sorciers
   	@Override
   	public boolean equals(Object objet)
   	{
        return objet.equals(getType());
   	}

    // Surcharger "compareTo()" pour comparer les sorciers/sorci�res
    @Override
    public int compareTo(Object objet)
    {
    	Sorcier o = (Sorcier)objet;
    	int resultat = 0;
    	
    	if(this.puissanceType < o.puissanceType)
    		resultat = -1;
    	
    	if(this.puissanceType == o.puissanceType)
    	{
    		if (comparerSexe(this) < comparerSexe(o))
    			resultat = -1;
    		if (comparerSexe(this) == comparerSexe(o))
    			resultat = 0;
    		if (comparerSexe(this) > comparerSexe(o))
    			resultat = 1;
    	}
    	
    	if(this.puissanceType > o.puissanceType)
    		resultat = 1;
    	
    	return resultat;
    }
}