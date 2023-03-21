public class Dog extends Animal {
	private boolean hasBeenWalked;

	public Dog(String name, int age, boolean vaccinated) {
		super(name, age, vaccinated);
		this.hasBeenWalked = false;
	}

	public boolean getHasBeenWalked() { return hasBeenWalked; }

	public void walk() {
		this.hasBeenWalked = true;
		System.out.println(this.getName() + " has been walked");
	}

	public void bark() {
		System.out.println(this.getName() + " barks");
	}
}
