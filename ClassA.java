import java.util.Arrays;
import java.util.Scanner;
public class ClassA
{
	static Scanner sc= new Scanner(System.in);
	void ticketBooking()
	{
		System.out.println("      Welcome to EasyTickets");
		System.out.println("        --UPCOMING SHOWS--\n");
		System.out.println("      1)Interstellar");
		System.out.println("      2)Inception");
		System.out.println("      3)Inside out");
		System.out.println("      4)Five Feet Apart");
		System.out.println("      5)Shutter Island");
	    System.out.println("     please select the movie number to book:");
	    String movies[]= {" NONE,please select the options above"," Interstellar"," Inception"," Inside out"," Five Feet Apart","Shutter Island"," NONE"};
	    String movieName = movies[sc.nextInt()];   
	    System.out.println("you have selected :"+movieName);
	    System.out.println("\n");
	    
	    
	    System.out.println("      Show Timings");
	    System.out.println("      1)7:1 5AM");
	    System.out.println("      2)9:00 AM");
	    System.out.println("      3)10:15 AM");
	    System.out.println("      4)11:00 AM");
	    System.out.println("      5)2:15 PM");
	    System.out.println("      6)6:00 PM");
	    System.out.println("      7)9:00 PM");
	    System.out.println("      8)10:15 PM");
	    System.out.println("Please select the show timing");
	    String Time[] = {"NONE,please select from the options above","7:1 5AM","9:00 AM","10:15 AM","11:00 AM","2:15 PM","6:00 PM","9:00 PM","10:15 PM"};
	    String ShowTime = Time[sc.nextInt()];
	    System.out.println("You have selected: "+ShowTime);
	    
	    
	    
	    
	    
	    
	    System.out.println("       --Available Theatres--\n");
	    System.out.println("       1)AMB Gachibowli");
	    System.out.println("       2)AAA(formerly Satyam");
	    System.out.println("       3)Sandhya 70 MM");
	    System.out.println("       4)Prasads Multiplex");
	    System.out.println("       5)PVR Irrum Manzil");
	    System.out.println("       6)PVR Hyd Central");
	    System.out.println("       7)Sudarshan 4k Dolby Atmos\n");
	    System.out.println("     Please Select a theatre to proceed");
	    String theatres[]= {"NONE,please Select the options above"," AMB Gachibowli"," AAA(formerly Satyam)"," Sandhya 70 MM","Prasads Multiplex"," PVR Irrum Manzil"
	    		," PVR Irrum Manzil","17)Sudarshan 4k Dolby Atmos"};
	    String theatreName = theatres[sc.nextInt()];
	    System.out.println("you have selected: "+theatreName);
	    System.out.println("\n");
	    System.out.println("     --Please Select the Seats--");
	    
	    System.out.println("AVAILABLE ROWS A,C,F,K,M");
	    System.out.println("enter your desired row:");
	    sc.nextLine();
	    String seats = sc.nextLine(); 
	    if(seats.equals("A") || seats.equals("C") || seats.equals("C") || 
	    		seats.equals("F") || seats.equals("K") || seats.equals("M"))
	    {
	    	for(int i=1;i<=15;i++)
	    	{
	    		System.out.println(seats+i);
	    		
	    	}
	    	int arr[];

	        System.out.println("Please enter the number of tickets:");
	        int noOfTickets = sc.nextInt();

	        if (noOfTickets <= 15) {
	            arr = new int[noOfTickets];
	            boolean[] seatTaken = new boolean[16]; // Keeps track of seat availability (from 1 to 15)

	            System.out.println("Please select the "+noOfTickets+" seat numbers from 1 to 15 from row "+seats);
	            for (int i = 0; i < noOfTickets; i++)
               {
	                int seatNumber = sc.nextInt();

	                // Check if the seat number is within the range and not already booked
	                if (seatNumber >= 1 && seatNumber <= 15 && !seatTaken[seatNumber]) {
	                    arr[i] = seatNumber;
	                    seatTaken[seatNumber] = true; // Mark the seat as booked
	                } else {
	                    System.out.println("Invalid seat number or seat already booked. Please select again.");
	                    i--; // Decrement the loop counter to re-enter the seat number
	                }
	            }

	            // Print booked tickets
	            for (int i = 0; i < noOfTickets; i++)
	            {
	                System.out.println("Your ticket is booked at seat number " + arr[i]);
	            }
	            System.out.println("\n");
	            System.out.println("      ~~~~~BOOKING CONFIRMATION~~~~~");
	            System.out.println("        Show name: "+movieName);
	            System.out.println("        Theatre name: "+theatreName);
	            System.out.println("        Show time: "+ShowTime);
	            System.out.println("        Seat numbers: "+seats+Arrays.toString(arr));
	            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        } 
	        else {
	            System.out.println("Cannot book more than 15 tickets.");
	        }
	    }
	}

	public static void main(String[] args)
	{
		ClassA aobj = new ClassA();
		aobj.ticketBooking();
		
	}
}