public class Ticket {
    private final int id;
    private final Event event;
    private final TicketType ticketType;
    private final String studentName;
    private boolean canceled;
    private boolean admitted;

    public Ticket(id, event, ticketType, studentName){
        if (id <= 0) throw new IllegalArguementException("Id has to be a positive integer");

        if(event == null || ticketType == null) throw new IllegalArguementException("Event and TicketType cannot be null");

        if (studentName == null || studentName.trim().isEmpty()) throw new IllegalArguementException("Student Name cannot be null or blank");

        this.id = id;
        this.event = event;
        this.ticketType = ticketType;
        this.studentName = studentName;
        this.canceled = false;
        this.admitted = false;
    }

     public boolean cancel(){
        if (!isCanceled() && !isAdmitted()){
            this.canceled = true;
            return true;
        }
        return false;
    }

    public void admit(){
        if (!isAdmitted() && !isCanceled()){
            this.admitted = true;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }
    
    public Event getEvent(){
        return event;
    }

    public TicketType getTicketType(){
        return ticketType;
    }

    public String getStudentName(){
        return studentName;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public boolean isAdmitted() {
        return admitted;
    }

    public boolean isActive() {
        return !canceled && !admitted;
    }

    @override
    public String toString(){
        String status = "Active";
        if (canceled){
            status = "Canceled";
        } else if (admitted){
            status = "Admitted";
        }
        return id + ", " + studentName + ", " + event + ", " + ticketType + ", " + status;
    }


}