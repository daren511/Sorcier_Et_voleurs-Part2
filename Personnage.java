public abstract class Personnage{

   //Déclaration privée du nom / Sexe
   private String nom;
   private char sexe;
   
   // Constructeur 2 params
   public Personnage(String nom,char sexe){
      setNom(nom);
      setSexe(sexe);
   }
   //Setter du sexe
   public void setSexe(char sexe){
      if(sexe == 'M'|| sexe == 'm' || sexe=='f'|| sexe =='F'){
         this.sexe = sexe;
      }
   }
   //Getter du sexe
   public char getSexe(){
      return sexe;
   }
   //Getter du nom
   public String getNom(){
      return nom;
   }
   //Setter du Nom
   public void setNom(String nom){
      //verifie si le nom est pas seulement des espace blancs
      if(nom.trim().length() > 0){
         this.nom = nom;
      }
   }
}