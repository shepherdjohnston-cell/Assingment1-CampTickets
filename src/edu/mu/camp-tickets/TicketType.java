public class TicketType {
    private final String name;
    private final double price;

    public TicketType(String name, double price) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArguementException("Ticket Type name cannot be null or blank");
        }

        if (price < 0){
            throw new IllegalArguementException("Ticket price cannot be negative");
        }

        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    @override
    public String toString(){
        return name + ": " + price;
    }
}