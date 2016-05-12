package practice1;

/**
 * Created by Woo on 2016-05-12.
 */
public class TicketMaker {

    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

}
