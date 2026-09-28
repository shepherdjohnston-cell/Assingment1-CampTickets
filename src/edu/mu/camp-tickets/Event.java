public class Event {
    private final String name;
    private final String location;

    public Event(String name, String location) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Event name cannot be blank or null");
        }

        if (location == null || location.trim().isEmpty()) {
            throw new IllegalArgumentException("Event location cannot be blank or null");
        }

        this.name = name.trim();
        this.location = location.trim();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name + "@" + location;
    }
}