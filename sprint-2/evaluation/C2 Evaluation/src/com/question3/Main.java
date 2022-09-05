package com.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket ticket=new Ticket();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of bookings");
		int noOfBookings=sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		int i1=sc.nextInt();
		ticket.availableTickets=i1;
		
		for(int i=0; i<noOfBookings; i++)
		{
			System.out.println("Enter the ticketid:");
			int id=sc.nextInt();
			
			System.out.println("Enter the price:");
			int price=sc.nextInt();
			
			System.out.println("Enter the no of tickets:");
			int noOfTickets=sc.nextInt();
			
			System.out.println("Available tickets:"+ticket.availableTickets);
			

			
			int check=ticket.calculateTicketCost(noOfTickets);
			
			if(check!= -1) {
				
				System.out.println("Total Amount:"+(noOfTickets*price));
				
				System.out.println("Available tickets after booking:"+ticket.availableTickets);
			}else
			{
				System.out.println("-1");
			}
			
			
			
		}
		
		
	}

}
