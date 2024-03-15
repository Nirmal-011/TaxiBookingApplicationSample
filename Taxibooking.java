package TaxiBooking;
import java.util.*;
public class Taxibooking {
	private static ArrayList<Taxi>taxilist=new ArrayList<Taxi>();
	private static int taxilistlimit=4,idGenerator=1;
	private static ArrayList<Taxi>taxiBookedlist=new ArrayList<>();
	
	public static String booking(char pickupLocation,char dropLocation,int pickuptime) throws CloneNotSupportedException{
		if(taxilist.size()<taxilistlimit) {
			taxilist.add(new Taxi());
		}
		int min=Integer.MAX_VALUE;
		Taxi taxiReady=null;
		for(Taxi T:taxilist) {
			 if(T.getDropTime()<pickuptime && Math.abs(pickupLocation-T.getCurrentlocation())<=min) 
			 {
				 if(Math.abs(pickupLocation)-T.getCurrentlocation()==min) {
					 if(taxiReady!=null &&T.getEarnings() <taxiReady.getEarnings())
					 {
						 taxiReady=T;
					 }
				 }
				 taxiReady=T;
				 min=Math.abs(pickupLocation-T.getCurrentlocation());
			 }
		}
		if(taxiReady!=null){
			taxiReady.setCustomerId(idGenerator++);
			taxiReady.setPickupTime(pickuptime);
			taxiReady.setPickupLocation(pickupLocation);
			taxiReady.setDropLocation(dropLocation);
			taxiReady.setCurrentlocation(dropLocation);
			taxiReady.setDropTime(pickuptime+Math.abs(dropLocation-pickupLocation));
			taxiReady.setEarnings(taxiReady.getEarnings()+Math.abs(dropLocation-pickupLocation)*(100+(10*10)));
			taxiReady.setTaxiId(taxilist.indexOf(taxiReady)+1);
			taxiBookedlist.add((Taxi)taxiReady.clone());//clone Object
		}
		return taxiReady!=null?"Taxi number "+ taxiReady.getTaxiId()+" is Booked": "Taxi not available";
	}
	public static void display() {
		System.out.println("-------------------");
		for(Taxi t: taxiBookedlist) {
			System.out.println(t.toString());
			System.out.println("-------------------");
		}
	}

}
