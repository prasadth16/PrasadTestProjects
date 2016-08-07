package main;

public class SalaryCalculator {
	private long baseSalary;
	private String designation;
	private int bonusPersent;
	private int incrementPersent;
	private int profitPersent;
	
	public SalaryCalculator(long baseSalary,String designation,int bonusPersent,int incrementPersent,int profitPersent)
	{
		this.baseSalary=baseSalary;
		this.designation=designation;
		this.bonusPersent=bonusPersent;
		this.incrementPersent=incrementPersent;
		this.profitPersent=profitPersent;
	}
	
	private long calculateSalary()
	{
		long revisedSalary=0;
		if (designation.equalsIgnoreCase("Manager"))
		{
			revisedSalary=baseSalary+((baseSalary*bonusPersent)/100)+((baseSalary*incrementPersent)/100)+5000;
		}
		else if(designation.equalsIgnoreCase("VP"))
		{
			revisedSalary=baseSalary+((baseSalary*bonusPersent)/100)+((baseSalary*incrementPersent)/100)+((baseSalary*profitPersent)/100)+7000;
		}
		else
		{
			revisedSalary=baseSalary+((baseSalary*incrementPersent)/100)+3000;
		}
		
		return revisedSalary;
	}
	
	public long calculateSalaryWrapper(int userID)
	{
		long revisedSalary=0;
		if(userID==1000)//Authentication mechanism
		{
			calculateSalary();
			
		}
		return revisedSalary;
	}

}
