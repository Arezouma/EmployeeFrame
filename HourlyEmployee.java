
public class HourlyEmployee 
{
	static int numberOfEmployees;
	private String lastName;
	private String firstName;
	private Double hourlyRate;
	private int employeeID;
	
	public HourlyEmployee(String last, String first, double rate)
	{
		lastName = last;
		firstName = first;
		hourlyRate = rate;
		employeeID = numberOfEmployees++; 
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public void setEmployeeID(int id)
	{
		employeeID = id;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	public void setHourlyRate(double rate)
	{
		hourlyRate = rate;
	}
	
	public String toString()
	{
		return (String.format("%05d %s, %s $%.2f per hour", 
				employeeID, lastName, firstName, hourlyRate));
	}
}
