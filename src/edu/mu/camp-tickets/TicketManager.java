public class TicketManager {
    private final TicketBook ticketBook;
    private int nextId;

    public TicketManager(int capacity){
        this.ticketBook = new TicketBook(capacity);
        this.nextId = 1;
    }

    public Ticket createTicket(Event event, TicketType type, String studentName) {
        Ticket ticket = ticketBook.createTicket(nextId, event, type, studentName);
        nextId++;
        return ticket;
    }

    public boolean cancelTicket(int id){
        Ticket ticket = ticketBook.findById(id);
        if (ticket == null) {
            return false
        }

        return ticket.cancel();
    }

    public boolean admitTicket(int id){
        Ticket ticket = ticketBook.findById(id);
        if (ticket == null) {
            return false
        }

        return ticket.admit();
    }


}