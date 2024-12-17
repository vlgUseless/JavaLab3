public class Main {
    public static void main(String[] args) {
        int MT = 5; // Максимальный номер билета в рулоне
        int numberOfCustomers = 15; // Количество покупателей

        TicketSystem system = new TicketSystem(MT);

        // Создаем и запускаем потоки-покупателей
        for (int i = 0; i < numberOfCustomers; i++) {
            Thread customerThread = new Thread(new Customer(system));
            customerThread.start();

            try {
                Thread.sleep((long)(Math.random() * 500));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
