package com.question3;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	
	

	public int calculateTicketCost(int noOfTickets) {
		
		if(noOfTickets<=availableTickets)
		{
			availableTickets=(int)(availableTickets-noOfTickets);
			 return 1;
			 
		}else
		{
			return -1;
		}
	}
	
	
	

}
