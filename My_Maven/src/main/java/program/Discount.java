package program;
public class Discount {
	static int totitemvalue;
	public static void totalAmount(int priceone,int pricetwo)
	{
		totitemvalue = priceone+pricetwo;
		System.out.println("Items total value is :"+totitemvalue);
	}
	public static void discount()
	{
		if(totitemvalue>=5000)
		{
			System.out.println("20% disount allowed");
			Double totamt = totitemvalue-0.20*totitemvalue;
			System.out.println("Items total value after discount amount added:"+totamt);
			//Double dis = totitemvalue* 0.20;
			//System.out.println("Item discount amount is :"+dis);
			//Double tot = totitemvalue - dis;
			//System.out.println("Items discounted total amount is :"+tot);
		}
		else
		{
			System.out.println("Discoun not allowed");
		}
	}
	public static void main(String[] args) 
	{
		Discount.totalAmount(2500, 3000);
		discount();
	}

}
