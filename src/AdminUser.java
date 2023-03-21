public class AdminUser extends User {
	private int permLevel;

	public AdminUser(int id, String username, int permLevel) {
		super(id, username);
		this.permLevel = permLevel;
	}

	public int getPermLevel() { return permLevel; }

	public int compareTo(AdminUser other) {
		return getPermLevel() - other.getPermLevel();
	}
}
