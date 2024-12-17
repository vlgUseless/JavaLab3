public class Customer implements Runnable {
    private final TicketSystem system;
    private final int ticket;

    public Customer(TicketSystem system) {
        this.system = system;
        this.ticket = system.getTicket();
    }

    @Override
    public void run() {}
}
