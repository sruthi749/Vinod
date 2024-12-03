package program;

public class Residential extends Building 
{	
	int noofapartment;
	int rentperapartment;
	public Residential(String address, int numoffloor, float totarea,int noofapartment,int rentperapartment) 
	{
		super(address, numoffloor, totarea);
		this.noofapartment= noofapartment;
		this.rentperapartment= rentperapartment;
		System.out.println("No of apartment is :"+noofapartment);
		System.out.println("Rent per Apartment is :"+rentperapartment);
	}
	Double totrent;
	public Double calculateTotalRent()
	{
		return totrent = (double) (noofapartment*rentperapartment);
		
	}
	public static void main(String[] args) 
	{
		Residential ob = new Residential("Skyline", 3, 1200.05f, 2, 5000);
		System.out.println("Total apartmenr rent is :"+ ob.calculateTotalRent());
		ob.information();
	}

}
