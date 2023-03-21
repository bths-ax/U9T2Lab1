public class GuestUser extends User {
	private int timeLeft;

	public GuestUser(int id, String username, int timeLeft) {
		super(id, username);
		this.timeLeft = timeLeft;
	}

	public int getTimeLeft() { return timeLeft; }

	public void decreaseTimeLeft() {
		timeLeft--;
	}
}
