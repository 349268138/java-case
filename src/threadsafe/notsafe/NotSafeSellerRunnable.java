package threadsafe.notsafe;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class NotSafeSellerRunnable implements Runnable {
    private NotSaveTicket ticket;

    public NotSafeSellerRunnable(NotSaveTicket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while(ticket.getCount() > 0) {
            ticket.minus();
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
