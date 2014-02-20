public class Sorcier extends Personnage{

   //Declaration static du nombre de sorciers
   static private int nbSorciers = 0;

   //Déclaration privée du type de sorcier
   private String type = "inconnu";

   //Construction a 3 params
   public Sorcier(String nom,char sexe,String type){
      super(nom,sexe);
      this.setType(type);
      this.nbSorciers++;
   }
   //Constructeur a 2 params
   public Sorcier(String nom,char sexe){
      super(nom,sexe);
      this.nbSorciers++;
   }
   //Setter du type
   public void setType(String type){
      if(type.equals("eau")||type.equals("feu")||type.equals("terre")||type.equals("air")){
         this.type = type;
      }
   }
   //Getter du type
   public String getType(){
      return type;
   }
   //Getter NbSorciers
   static public int getNbSorciers(){
      return nbSorciers;
   }
   // Function toString concaténation pour results final
   public String toString(){
      String chaine = "";
      if(getSexe() == 'M' || getSexe() == 'm'){
         chaine = "Mon nom est " + super.getNom() + " et je suis un sorcier de type " + getType();
      }
      else if(getSexe() == 'F' || getSexe() == 'f'){
         chaine = "Mon nom est " + super.getNom() + " et je suis une sorcière de type " + getType();
      }
      return chaine;
   }
   //surchage de loperateur equals pour regarder les sorciers
   @Override
      public boolean equals(Object objet)
      {
        return objet.equals(getType());
      }
}