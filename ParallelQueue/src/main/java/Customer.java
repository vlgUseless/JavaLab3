public class Customer implements Runnable {
    private final TicketSystem system;
    private final int ticket;
    private final int customerId;

    public Customer(TicketSystem system, int customerId) {
        this.system = system;
        this.ticket = system.getTicket();
        this.customerId = customerId;
    }

    @Override
    public void run() {
        try {
            // Ждем, пока очередь дойдет до нашего билета
            system.waitForTurn(ticket);
            // Имитация обслуживания
            System.out.println("Customer #" + customerId + " with ticket " + ticket + " is being served.");
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println("Customer #" + customerId + " with ticket " + ticket + " has been served.");
            // Сообщаем системе о завершении обслуживания
            system.done();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
