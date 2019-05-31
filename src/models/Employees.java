package models;

public class Employees {

	public String name;
	public int totalSales;
	public int salesPeriod;
	public double experienceMultiplier;
	
	public Employees(String employee1name,int totalSales,int salesPeriod,double experienceMultiplier) {
		this.name = employee1name;
		this.totalSales = totalSales;
		this.salesPeriod = salesPeriod;
		this.experienceMultiplier = experienceMultiplier;
	}

}
