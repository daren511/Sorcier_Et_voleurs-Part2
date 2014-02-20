
public class Test {

   static final int MAX_PERSONNAGES = 8;

   public static void main( String args[] )
   {
      int nbPersonnages = 0; // nombre courant de personnages

      //
      // création du tableau de personnages
      //
      Personnage pers[] = new Personnage[ MAX_PERSONNAGES ];

      //
      // décompte des personnages au début de l'histoire
      //
      nbPersonnages = Sorcier.getNbSorciers() + Voleur.getNbVoleurs();
      System.out.println( "Au debut de l'histoire il y a "
         + nbPersonnages + " personnage(s)\n" );

      //
      // création des personnages
      //
      pers[ 0 ] = new Sorcier( "Gandalf", 'M' );
      pers[ 1 ] = new Sorcier( "Zoumtor", 'M', "air" );
      pers[ 2 ] = new Sorcier( "Sagasse", 'F', "feu" );
      pers[ 3 ] = new Voleur( "Zarpeur", 'M' );
      pers[ 4 ] = new Voleur( "Filouzine", 'F', 7 );
      pers[ 5 ] = new Voleur( "Ombro", 'M', 50 );
      pers[ 6 ] = new Sorcier( "Zoumtor", 'M', "air" );
      pers[ 7 ] = new Sorcier( "Erzag", 'F', "terre" );

      //
      // modification de quelques personnages
      //
      pers[ 0 ].setNom( "Kalamanji" );
      pers[ 1 ].setNom( "   " ); // aucun effet
      ( ( Sorcier )pers[ 1 ] ).setType( "pizza" ); // aucun effet
      ( ( Sorcier )pers[ 2 ] ).setType( "eau" );
      pers[ 3 ].setSexe( 'X' ); // aucun effet
      ( ( Voleur )pers[ 5 ] ).incNbLarcins();

      //
      // copie d'un personnage
      //
      pers[ 7 ] = pers[ 2 ];

      //
      // présentation des personnages
      //
      nbPersonnages = Sorcier.getNbSorciers() + Voleur.getNbVoleurs();
      for( int i = 0; i < nbPersonnages; i++ )
         System.out.println( i + "- " + pers[ i ] );
      System.out.println();

      //
      // Tests d'égalité
      //
      for( int i = 0; i < pers.length - 1; i++ )
         for( int j = i + 1; j < pers.length; j++ )
         {
            if( pers[ i ] == pers[ j ] )
               System.out.println( "Personnages " + i + " et " + j
                  + " : meme personnage" );

            if( pers[ i ].equals( pers[ j ] ) )
               System.out.println( "Personnages " + i + " et " + j
                  + " : memes attributs" );
         }

   //
   // décompte des personnages à la fin de l'histoire
   //
   System.out.println( "\nA la fin de l'histoire il y a "
      + nbPersonnages + " personnage(s)" );
   }
}