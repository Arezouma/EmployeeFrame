// ReadEmployeeFile.java
// This program reads a text file and displays each record.
import java.io.File;
import java.io.FileNotFoundException;
//import java.lang.IllegalStateException;
//import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadEmployeeFile
{
   private Scanner input;

   // enable user to open file
   public void openFile()
   {
	   try
	   {
		   input = new Scanner( new File( "hourly_employees.txt" ) );
	   }
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error opening file." );
         System.exit( 1 );
      } // end catch
  }
   
   public void readEmployees()
   {
      // object to be written to screen
	   HourlyEmployee employee = new HourlyEmployee("last", "first", 0.0);

      System.out.printf( "%-15s%-12s%-12s%15s\n", "Employee ID",
         "Last Name", "First Name", "Hourly Rate" );
      System.out.println("--------------------------------------------------------------");
    		  
     while ( input.hasNext() )
     {
    	 employee.setEmployeeID( input.nextInt() ); // read account number
    	 employee.setLastName( input.next() ); // read last name
    	 employee.setFirstName( input.next() ); // read first name
    	 employee.setHourlyRate( input.nextDouble() ); // read balance

        // display record contents
        System.out.printf( "  %05d      %-12s %-12s %10.2f\n",
        		employee.getEmployeeID(), employee.getLastName(),
        		employee.getFirstName(), employee.getHourlyRate() );
     } // end while
   } // end method readRecords

   // close file and terminate application
   public void closeFile()
   {
      if ( input != null )
         input.close(); // close file
   } // end method closeFile
} // end class ReadTextFile
