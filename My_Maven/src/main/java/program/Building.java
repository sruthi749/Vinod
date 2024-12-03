package program;

public class Building 
{
	String address;
	int numoffloor;
	float totarea;
	public Building(String address,int numoffloor,float totarea)
	{
		this.address=address;
		this.numoffloor=numoffloor;
		this.totarea=totarea;
	}
	
	public void information()
	{
		System.out.println("Address is :"+this.address);
		System.out.println("No of floor is :"+this.numoffloor);
		System.out.println("Total area is :"+this.totarea);
	}

}
