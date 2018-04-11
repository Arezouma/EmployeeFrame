// CreateEmployeeFile.java
// Writing employee data to a sequential text file with class Formatter.
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateEmployeeFile
{
   private Formatter output; // object used to output text to file

   // enable user to open file
   public void openFile()
   {
      try
      {
         output = new Formatter( "hourly_employees.txt" );
      } // end try
      catch ( FileNotFoundException filesNotFoundException )
      {
         System.err.println( "Error creating file." );
         System.exit( 1 );
      } // end catch
   } // end method openFile

   // add records to file
   public void addEmployees()
   {
      Scanner input = new Scanner( System.in );
     
      while ( true ) // loop 
      {
         try // output values to file
         {
    		System.out.print("Enter Employee's Last Name: ");
    		String last = input.next();
    		if (last.equals("Q"))
    		{
    			break; // exit loop
     		}
     		System.out.print("Enter Employee's First Name: ");
    		String first = input.next();
    		System.out.print("Enter Employee's Hourly Rate: ");
    		double rate = input.nextDouble();
    		
    		HourlyEmployee employee = new HourlyEmployee(last, first, rate);

           // write new HourlyEmployee
           output.format( "%05d %s %s %.2f\n", employee.getEmployeeID(), 
        		   employee.getLastName(), employee.getFirstName(), 
        		   employee.getHourlyRate() );
         } // end try
         catch ( FormatterClosedException formatterClosedException )
         {
            System.err.println( "Error writing to file." );
            return;
         } // end catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // discard input so user can try again
         } // end catch

      } // end while
   } // end method addEmployees

   // close file
   public void closeFile()
   {
      if ( output != null )
         output.close();
   } // end method closeFile
} // end class CreateEmployeeFile

