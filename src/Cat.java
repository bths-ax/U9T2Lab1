public class Cat extends Animal {
	private boolean hasPlayedWith;

	public Cat(String name, int age, boolean vaccinated) {
		super(name, age, vaccinated);
		this.hasPlayedWith = false;
	}

	public boolean getHasPlayedWith() { return hasPlayedWith; }

	public void play() {
		this.hasPlayedWith = true;
		System.out.println(this.getName() + " has been played with");
	}

	public void meow() {
		System.out.println(this.getName() + " meows");
	}
}
