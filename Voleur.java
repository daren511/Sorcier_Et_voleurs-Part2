final public class Voleur extends Personnage {

   //Variable static pour le nombre de voleurs
   static private int nbVoleur = 0;

   //Déclaration privée du nbLarcins
   private int nbLarcins;

   //Constructeur 3 params
   public Voleur(String nom,char sexe,int nbLarcins){
      super (nom,sexe);
      this.nbLarcins = nbLarcins;
      this.nbVoleur++;
   }
   //Constructeur 2 params
   public Voleur(String nom,char sexe){
      super (nom,sexe);
      this.nbLarcins = 0;
      this.nbVoleur++;

   }
   // Function ToString de concaténation pour resultat final
   public String toString(){
      String chaine = "";
      if(getSexe() == 'M' || getSexe() == 'm'){
         chaine = "Mon nom est " + super.getNom() + " et je suis un voleur ayant commis " + getNbLarcins() + " larcin(s).";
      }
      else if(getSexe() == 'F' || getSexe() == 'f'){
         chaine = "Mon nom est " + super.getNom() + " et je suis une voleuse ayant commis " + getNbLarcins() + " larcin(s).";
      }
      return chaine;
   }

   //Getter NbVoleurs
   static public int getNbVoleurs(){
      return nbVoleur;
   }
   //Getter NbLarcins
   public int getNbLarcins(){
      return nbLarcins;
   }
   // Incrémentation NbLarcins
   public void incNbLarcins(){
      nbLarcins++;
   }
   //surchage de loperateur equals pour regarder les voleurs
   @Override
   public boolean equals(Object objet)
   {
     return objet.equals(getNbLarcins());
   }
}