
// CreateEmployeeFileTest.java
// Testing the CreateEmployeeFile class.

public class CreateEmployeeFileTest
{
   public static void main( String args[] )
   {
	   CreateEmployeeFile application = new CreateEmployeeFile();

      application.openFile();
      application.addEmployees();
      application.closeFile();
   } // end main
} // end class CreateTextFileTest
