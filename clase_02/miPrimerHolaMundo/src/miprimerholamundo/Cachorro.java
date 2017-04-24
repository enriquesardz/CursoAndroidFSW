/*
    package miprimerholamundo;

public class Cachorro {
   public  Cachorro () {
   }

   public  Cachorro (String name) {
      // Este contructor tiene un parametro , name.//
   }
}
*/

/*
package miprimerholamundo;

public class Cachorro {
   public  Cachorro () {
   }

   public  Cachorro (String name) {
      // Este contructor tiene un parametro , name.


       System.out.println("Su nombre es :" + name );
   }

   public static void main(String []args) {
      // Following statement would create an object miCachorro
      Cachorro myCachorro = new Cachorro( "SoloVino" );
      }
}
*/


package miprimerholamundo;
public class Cachorro {
    int edadCachorro;
 
   public  Cachorro (String name) {
      // Este contructor tiene un parametro , name.
       System.out.println("Su nombre es :" + name );
   }

    public void setEdad( int edad ) { edadCachorro = edad;} 
    
   public int getEdad( ) {
      System.out.println("La edad del cachorro es :" + edadCachorro );
      return edadCachorro;
   }
   
   public static void main(String []args) {
      // Siguiendo los estandares para crear in objeto myCachorro
      Cachorro myCachorro = new Cachorro( "SoloVino" );
      
        /*Llamar la clase metodo para establecer la edadCachorro */
      myCachorro.setEdad( 2 );

      /* LLamar otra clase del metodo para optener la edadCachorro*/
      myCachorro.getEdad( );

      /* Tu puedes acceder a la  variable instanciada como seguirla*/
      System.out.println("Valor de la variable :" + myCachorro.edadCachorro ); 
      }
}