public class Animal {
	private String name;
	private int age;
	private boolean vaccinated;
	private boolean sleeping;

	public Animal(String name, int age, boolean vaccinated) {
		this.name = name;
		this.age = age;
		this.vaccinated = vaccinated;
		this.sleeping = false;
	}

	public String getName() { return name; }
	public int getAge() { return age; }
	public boolean isVaccinated() { return vaccinated; }
	public boolean isSleeping() { return sleeping; }

	public void adopt() {
		System.out.println(name + " has been adopted");
	}

	public void feed() {
		System.out.println(name + " has been fed");
	}

	public void sleep() {
		this.sleeping = true;
		System.out.println(name + " has fallen asleep");
	}
}
