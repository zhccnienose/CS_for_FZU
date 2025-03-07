// Fig. 18.16: SetTest.java
// HashSet used to remove duplicate values from array of strings.
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
//SET是抽象类，不能实现，所以要用HashSet
public class SetTest 
{
   public static void main( String[] args )
   {
      // create and display a List< String >
      String[] colors = { "red", "white", "blue", "green", "gray", 
         "orange", "tan", "white", "cyan", "peach", "gray", "orange" };
      List< String > list = Arrays.asList( colors );
      System.out.printf( "List: %s\n", list );

      // eliminate duplicates then print the unique values
      printNonDuplicates( list );
   } // end main 

   // create a Set from a Collection to eliminate duplicates
   private static void printNonDuplicates( Collection< String > values )
   {
      // create a HashSet 
      Set< String > set = new HashSet< String >( values );

      System.out.print( "\nNonduplicates are: " );

      for ( String value : set )
         System.out.printf( "%s ", value );

//      System.out.println();
   } // end method printNonDuplicates
} // end class SetTest


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
