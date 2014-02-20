/////////////////////////////////////////////////
// S O R C I E R S _ E T _ V O L E U R S
/////////////////////////////////////////////////
// Fait par: Alexis Lalonde
// Le 24 février 2014
// But: jeu fantastique dans lequel évolue des
//      personnages
/////////////////////////////////////////////////
// Test2.java
/////////////////////////////////////////////////

public class Test2
{
   static final int MAX_PERSONNAGES = 10;

   public static void main( String args[] )
   {
      int nbPersonnages = 0; // nombre courant de personnages

      //
      // création du tableau de personnages
      //
      Personnage pers[] = new Personnage[ MAX_PERSONNAGES ];

      //
      // création des personnages
      //
      pers[ 0 ] = new Sorcier( "Kalamanji", 'M', "eau" );
      pers[ 1 ] = new Sorcier( "Zoumtor",   'M', "air" );
      pers[ 2 ] = new Sorcier( "Sagasse",   'F', "eau" );
      pers[ 3 ] = new Sorcier( "Erlag",     'F', "air" );
      pers[ 4 ] = new Sorcier( "Miramar",   'F', "feu" );

      pers[ 5 ] = new Voleur(  "Zarpeur",   'M',  0 );
      pers[ 6 ] = new Voleur(  "Filouzine", 'F',  7 );
      pers[ 7 ] = new Voleur(  "Ombro",     'M',  51 );
      pers[ 8 ] = new Voleur(  "Borlog",    'M',  7 );
      pers[ 9 ] = new Voleur(  "Garouche",  'F',  7 );

      //
      // tests de comparaison
      //
      int n = 0;
      int comparaison;

      for( int i = 0; i < pers.length - 1; i++ )
         for( int j = i + 1; j < pers.length; j++ )
         {
            if( ( pers[ i ] instanceof Sorcier )
               && ( pers[ j ] instanceof Sorcier ) ||
               ( pers[ i ] instanceof Voleur )
               && ( pers[ j ] instanceof Voleur ) )
            {
               System.out.print( n++ + "- " + pers[ i ].getNom()
                  + " affronte " + pers[ j ].getNom() + " et " );
               comparaison = pers[ i ].compareTo( pers[ j ] );
               if( comparaison > 0 )
                  System.out.println( "gagne ");
               else if( comparaison < 0 )
                  System.out.println( "perd" );
               else
                  System.out.println( "c'est un match nul" );
            }

         }
   }
}
