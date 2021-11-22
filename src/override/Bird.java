package override;

public abstract class Bird {
    private long speed;

    public Bird() {
        this(2);
        System.out.println("Bird call without param");
    }

    public Bird(long speed) {
        this.speed = speed * speed;
        System.out.println("Bird call with speed param");
    }

	public void fly() {
		System.out.println("bird fly speed: " + getSpeed());
	}

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }
}
