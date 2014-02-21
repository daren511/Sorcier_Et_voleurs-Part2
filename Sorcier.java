public class Sorcier extends Personnage implements Comparable {
	// Déclaration des variables privées
   	private String typeSorcier_ = "inconnu";	// If aucun type declaree, il sera à inconnu
   	private int puissanceType = 0;	// La puissance du type pour la comparaison (air = 1, eau = 2, feu = 3 et terre = 4)
   	private int comparaisonSexe = 0;	// Compare par le sexe des sorciers et sorcières (Homme = 1, Femme = 2)
   	static private int nbSorciers_ = 0;

   	// Constructeur à 3 paramètres
	public Sorcier(String nom, char sexe, String type)
	{
		setNom(nom);
		setSexe(sexe);
		setType(type);
		nbSorciers_++;
	}

	// Constructeur à 2 paramètres
	public Sorcier(String nom, char sexe)
	{
		setNom(nom);
		setSexe(sexe);
		setType(typeSorcier_);
		nbSorciers_++;
	}

	// Modifie le type du sorcier selon le type en parametres et attribut la puissance "(air < eau < feu < terre)"
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

	// Retourne le nbrs de sorciers
   	static public int getNbSorciers()
   	{
   		return nbSorciers_;
   	}

   	// Retourne le type
   	private String getType()
   	{
   		return typeSorcier_;
   	}

   	// Affiche la présentation du sorcier selon son sexe
   	public String toString()
   	{
   		String sexe = "un sorcier";

   		if (getSexe() == 'F')
   			sexe = "une sorciere";

   		return "Mon nom est " + getNom() + " et je suis " + sexe + " de type " + getType();
   	}

   	//Déterminer le plus fort (mâle < femelle) par la comparasion de sexe
   	private int comparerSexe (Object objet)
   	{
   		Sorcier o = (Sorcier)objet;
   		if(o.getSexe() == 'M')
   			comparaisonSexe = 1;

   		if(o.getSexe() == 'F')
   			comparaisonSexe = 2;

   		return comparaisonSexe;
   	}

   	// Surcharge de "equals()" pour comparer le type
   	@Override
   	public boolean equals(Object objet)
   	{
        return objet.equals(getType());
   	}

    // Surcharge de "compareTo()" pour comparer les sorciers
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