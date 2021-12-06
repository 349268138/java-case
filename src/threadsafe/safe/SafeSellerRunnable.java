package threadsafe.safe;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class SafeSellerRunnable implements Runnable {
    private SafeTicket ticket;

    public SafeSellerRunnable(SafeTicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while(ticket.minus()) {
            hold(100);
        }
    }

    private void hold(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
