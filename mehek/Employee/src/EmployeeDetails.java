
public class EmployeeDetails {

	private int ID;
	private String name;
	private float monthlyBasic;
	private float pf;
	private final int medicalAllowance =  1250;
	private final int conveyance = 800;
	
	public void setID(int ID) 
	{
		this.ID = ID;
	}
		
	public int getID() 
	{
		return ID;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public float getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(float monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	

	public float getAnnualBasic(float monthlyBasic) 
	{
		return 12 * monthlyBasic;
	}
	
	public double getHRA(float monthlyBasic) {
		double hra = 0.5 * monthlyBasic;
		return hra;
	}
	
	public double getMonthlyGrossSalary(float monthlyBasic, double hra, int medicalAllowance, int conveyance) 
	{
		
		double monthlyGrossSalary = monthlyBasic + hra + medicalAllowance + conveyance;
		return monthlyGrossSalary;
	}
	
	
	
	public double getAnnualGrossSalary(double monthlyGrossSalary) 
	{
		return 12 * monthlyGrossSalary;
	}
	
	public float getPFRate() 
	{
		float pf;
		if(monthlyBasic < 6500)
		{
			pf = 0.1f * monthlyBasic;
		}
		else
			 pf = 0.1f * 6500;
		return pf;
	}
	
	
	public void setPFRate(float pf) 
	{
		this.pf = pf;
	}
	
	public double getMonthlyDeductions(float pf, float monthlyBasic, double monthlyGrossSalary) 
	{
		double profTax, esic=0.0;
		
		
		if(monthlyBasic <= 5000)
		{
			esic = 0.0475 * monthlyBasic;
		}
		
		if(monthlyGrossSalary <= 1000)
		{
			profTax = 50;
		}
		else 
			profTax = 100;
		
		double monthlyDeductions = pf + esic + profTax;
		return monthlyDeductions;
	}
	
	
	public double getMonthlyTakeHome(double monthlyGrossSalary, double monthlyDeductions) 
	{
		double monthlyTakeHome = monthlyGrossSalary - monthlyDeductions;
		return monthlyTakeHome;
	}
	
	
	public double getAnnualTakeHome(double monthlyTakeHome) 
	{
		return 12 * monthlyTakeHome;
	}
		
}
