// Fig. 18.12: BinarySearchTest.java
// Collections method binarySearch.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest 
{
   public static void main( String[] args )
   {
      // create an ArrayList< String > from the contents of colors array
      String[] colors = { "red", "white", "blue", "black", "yellow", 
         "purple", "tan", "pink" };
      List< String > list = 
         new ArrayList< String >( Arrays.asList( colors ) );

      Collections.sort( list ); // sort the ArrayList
      System.out.printf( "Sorted ArrayList: %s\n", list );

      // search list for various values
      printSearchResults( list, colors[ 3 ] ); // first item
      printSearchResults( list, colors[ 0 ] ); // middle item
      printSearchResults( list, colors[ 7 ] ); // last item
      printSearchResults( list, "aqua" ); // below lowest
      printSearchResults( list, "gray" ); // does not exist
      printSearchResults( list, "teal" ); // does not exist
   } // end main     

   // perform search and display result
   private static void printSearchResults( 
      List< String > list, String key )
   {
      int result = 0;

      System.out.printf( "\nSearching for: %s\n", key );
      result = Collections.binarySearch( list, key );
      
      if ( result >= 0 )
         System.out.printf( "Found at index %d\n", result );
      else
         System.out.printf( "Not Found (%d)\n",result );
   } // end method printSearchResults
} // end class BinarySearchTest

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
