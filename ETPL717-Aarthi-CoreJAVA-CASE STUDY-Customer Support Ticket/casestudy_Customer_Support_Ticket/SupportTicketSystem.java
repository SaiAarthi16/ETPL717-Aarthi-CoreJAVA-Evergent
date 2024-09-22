package com.evergent.corejava.aarthi.casestudy_Customer_Support_Ticket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class SupportTicketSystem {
	static {
		System.out.println("\t\tWelcome to Customer Support Ticketing System");
	}
	static int number=1;
	static Scanner sc=new Scanner(System.in);
	static Deque<Ticket> ticketQueue = new ArrayDeque<>();
	
	public static void main(String[] args) {
		while (true) {
            System.out.println("\nCustomer Support Ticketing System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Peek Next Ticket");
            System.out.println("4. Display All Tickets");
            System.out.println("5. Add Ticket to first");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1-6.");
                continue;
            }

            switch (choice) {
                case 1:
                    addTicket();
                    break;

                case 2:
                    processNextTicket();
                    break;

                case 3:
                    peekNextTicket();
                    break;

                case 4:
                    displayQueue();
                    break;

                case 5:
                    addTicketFirst();
                    break;
                    
                case 6:
                    System.out.println("Exiting....ThankYou:)");
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
	}

	public static void addTicket() {
		System.out.println("Enter the Ticket description : ");
		String description=sc.nextLine();
		int ticketNumber = number++;
		Ticket ticket = new Ticket(ticketNumber, description);
        ticketQueue.add(ticket);
        System.out.println("Added: " + ticket);
	}
	public static void processNextTicket() {
		if(ticketQueue.isEmpty())
			System.out.println("No Tickets to Process!");
		else {
			Ticket ticket=ticketQueue.poll();
			System.out.println("Ticket No : "+ticket.getNumber()+" is Processed!");
		}
	}
	public static void peekNextTicket() {
		if(ticketQueue.isEmpty())
			System.out.println("No Tickets in the queue!");
		else {
			Ticket ticket=ticketQueue.peek();
			System.out.println("Next Ticket to Process: " + ticket);
		}
	}
	public static void addTicketFirst() {
		System.out.println("Enter the Ticket description : ");
		String description=sc.nextLine();
		int ticketNumber = number++;
		Ticket ticket = new Ticket(ticketNumber, description);
        ticketQueue.offerFirst(ticket);
        System.out.println("Added: " + ticket);
	}
	public static void displayQueue() {
		if(ticketQueue.isEmpty())
			System.out.println("No Tickets in the queue (queue is Empty)!");
		else {
			System.out.println("Tickets currently in the queue are : ");
			for(Ticket ticket:ticketQueue)
				System.out.println(ticket);
		}
	}
}