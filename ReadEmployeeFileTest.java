// ReadEmployeeFileTest.java
// This program test class ReadEmployeeFile.

public class ReadEmployeeFileTest
{
   public static void main( String args[] )
   {
	   ReadEmployeeFile application = new ReadEmployeeFile();

      application.openFile();
      application.readEmployees();
      application.closeFile();
   } // end main
} // end class ReadEmployeeFileTest
