package org.company;

public class CompanyInfo  {
	private void companyName() {
		// TODO Auto-generated method stub
System.out.println("hitech");
	}
	private void companyName(int id,char g) {
		// TODO Auto-generated method stub
System.out.println("company id:"+id);
System.out.println("g:"+ g);
	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyName(316531,'f');
		System.out.println("viv");
	}
	
}
