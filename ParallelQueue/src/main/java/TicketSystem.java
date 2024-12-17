public class TicketSystem {
    private final int maxTickets;
    private int nextTicket;
    private int currentNumber;

    public TicketSystem(int maxTickets) {
        this.maxTickets = maxTickets;
        this.nextTicket = 1;
        this.currentNumber = 1; // Номер, который сейчас обслуживается
    }

    // Выдать следующий билет покупателю
    public synchronized int getTicket() {
        int ticket = nextTicket;
        // Следующий билет после MT будет снова 1
        nextTicket = (nextTicket % maxTickets) + 1;
        return ticket;
    }

    // Ожидаем, пока currentNumber не будет равен ticket
    public synchronized void waitForTurn(int ticket) throws InterruptedException {}

    // Когда обслуживание закончилось, увеличиваем currentNumber и оповещаем другие потоки
    public synchronized void done() {}
}