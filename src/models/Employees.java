package models;

public class Employees {

	public String name;
	public int totalSales;
	public int salesPeriod;
	public double experienceMultiplier;
	
	public Employees(String name,int totalSales,int salesPeriod,double experienceMultiplier) {
		this.name = name;
		this.totalSales = totalSales;
		this.salesPeriod = salesPeriod;
		this.experienceMultiplier = experienceMultiplier;
	}

}
