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
    public synchronized int getTicket() {}

    // Ожидаем, пока currentNumber не будет равен ticket
    public synchronized void waitForTurn(int ticket) throws InterruptedException {}

    // Когда обслуживание закончилось, увеличиваем currentNumber и оповещаем другие потоки
    public synchronized void done() {}
}