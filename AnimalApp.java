abstract class Animal
{
  abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.printf("Bark");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.printf("\n Meowing");
	}
}

public class AnimalApp
{
	public static void main(String x[])
	{
	
	Animal a=new Dog();
	a.makeSound();
	
	a=new Cat();
	a.makeSound();
	}
}