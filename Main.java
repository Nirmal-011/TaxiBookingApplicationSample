package TaxiBooking;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws CloneNotSupportedException {
		boolean loop= true;
		while(loop) {
			System.out.println("Choose any one \n1.Book a Taxi\n2.Display\n3.Exit");
			Scanner in=new Scanner(System.in);
			int choice=in.nextInt();
			
			switch(choice){
				case 1:
				{
					System.out.println("Enter Pickup Location");
					char pickupLocation=in.next().charAt(0);
					System.out.println("Enter Drop Location");
					char dropLocation=in.next().charAt(0);
					System.out.println("Enter Pick up Time: ");
					int pickupTime=in.nextInt();
					System.out.println(Taxibooking.booking(pickupLocation, dropLocation, pickupTime));
					break;
				}
				case 2:
				{
					Taxibooking.display();
					break;
				}
				case 3:
				{
					loop=false;
					System.out.println("\nThank you");
					in.close();
					break;
				}
					
			}
		}
	}

}
