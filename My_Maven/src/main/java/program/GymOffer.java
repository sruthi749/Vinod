package program;

public class GymOffer {
	
	String memname;
	int duration;
	
	public GymOffer(String memname, int duration)
	{
		this.memname=memname;
		this.duration=duration;
		System.out.println("Member name is :"+this.memname);
		System.out.println("Gym training duration is :"+this.duration);
	}
	
	int fee =1000;
	int total;
	public void calculateFee()
	{
		total = fee*duration;
		System.out.println("Total fees :"+total);
	}
	public void splOffer()
	{
		if(total>1000)
		{
			System.out.println("10% discount allowed");
			Double disamt = total - 0.1*total;
			System.out.println("Total Discounted amount is : "+disamt);
			
		}
		else
		{
			System.out.println("Discount not allowed");
		}
	}
	public static void main(String[] args) {
		GymOffer ob = new GymOffer("Sara", 2);
		ob.calculateFee();
		ob.splOffer();
	}

}
