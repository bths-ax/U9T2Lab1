public class AnimalRunner {
	public static void main(String[] args) {
		Animal animal = new Animal("test subject a", 1, true);
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.isVaccinated());
		System.out.println(animal.isSleeping());
		animal.adopt();
		animal.feed();
		animal.sleep();

		Dog dog = new Dog("test subject b", 2, false);
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println(dog.isVaccinated());
		System.out.println(dog.isSleeping());
		System.out.println(dog.getHasBeenWalked());
		dog.adopt();
		dog.feed();
		dog.sleep();
		dog.walk();
		dog.bark();

		Cat cat = new Cat("test subject c", 3, true);
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.isVaccinated());
		System.out.println(cat.isSleeping());
		System.out.println(cat.getHasPlayedWith());
		cat.adopt();
		cat.feed();
		cat.sleep();
		cat.play();
		cat.meow();
	}
}
