package override;

public class Ostrich extends Bird {

    public Ostrich(long speed) {
        super(speed);
        System.out.println("Ostrich call with speed param");
    }

    public Ostrich() {
        super();
        System.out.println("Ostrich call without param");
    }

    @Override
    public void fly() {
        System.out.println("Ostrich fly speed：" + getSpeed());
    }
}
