public class Main {
    public static void main(String[] args) {
        TicketManager manager = new TicketManager(30);

        Event event1 = new Event("Career Fair", "Recreational Center");
        Event event2 = new Event("Baseball Game", "Baseball Fields");

        TicketType type1 = new TicketType("student", 5.00);
        TicketType type2 = new TicketType("senior", 7.00);

    }
}