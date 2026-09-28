public class Main {
    public static void main(String[] args) {
        System.out.println("Creating ticket manager");
        TicketManager manager = new TicketManager(30);

        System.out.println("Intializing events and ticket types");
        Event event1 = new Event("Career Fair", "Recreational Center");
        Event event2 = new Event("Baseball Game", "Baseball Fields");

        TicketType type1 = new TicketType("student", 5.00);
        TicketType type2 = new TicketType("senior", 7.00);

        Ticket t1 = manager.createTicket(event2, type2, "Alice West");
        Ticket t2 = manager.createTicket(event1, type2, "Bob Ivy");
        Ticket t3 = manager.createTicket(event1, type1, "Lewis Hart");
        Ticket t4 = manager.createTicket(event2, type2, "James Ding");
        Ticket t5 = manager.createTicket(event1, type1, "Ella Croft");

        System.out.println("Created all tickets:");
        manager.printAllTickets();

        System.out.println("Admitting one ticket");
        boolean admitted = manager.admitTicket(t1.getId());
        System.out.println("Status-Admit: " + admitted);

        System.out.println("Canceling one ticket");
        boolean canceled = manager.cancelTicket(t4.getId());
        System.out.println("Status-Cancel: " + canceled);

        System.out.println("Canceling already admitted ticket");
        boolean cancelAdmit = manager.cancelTicket(t1.getId());
        System.out.println("Status-Cancel: " + cancelAdmit);


        System.out.println("All Tickets");
        manager.printAllTickets();
        System.out.println("All Tickets under " + event2);
        manager.printTicketsForEvent(event2);
    }
}