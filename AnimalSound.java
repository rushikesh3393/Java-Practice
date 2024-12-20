/*Write a Java program to create an abstract class Animal with an abstract method called sound().
 Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method 
 to make a specific sound for each animal*/
 
 
 
 abstract class Animal 
{
    
    public abstract String sound();
}


 class Lion extends Animal 
{
    @Override
    public String sound() 
	{
        return "Roar";
    }
}

 class Tiger extends Animal 
{
    @Override
    public String sound() 
	{
        return "Growl";
    }
}


public class AnimalSound 
{
    public static void main(String[] args) 
	{
        
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        
        System.out.println(lion.sound()); 
        System.out.println(tiger.sound()); 
    }
}
