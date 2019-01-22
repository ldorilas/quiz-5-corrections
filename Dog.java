import java.util.Scanner;

public class Dog {

	String name;
  String breed;
  String color;
  double weight;
  
  public Dog {
    this.name = name;
    this.breed = breed;
    this.color = color;
    this.weight = weight;
  }

	public void bark() {

		if (breed = "German Shepherd" || breed = "Golden Retriever" || breed = "Rottweiler") {
      System.out.println("Bark! Bark! Bark!");
    }
    else if (breed = "French Bulldog" || breed = "Beagle" || breed = "Yorkshire Terrier") {
      System.out.println("Bark!");
    }
    else {
      System.out.println("Bark! Bark!");
    }
	}

	public void run(int steps, String direction) {

		System.out.println(name + " ran " + steps + " steps toward " + direction + ".");

	}
  
  public void toString() {
    return "Name: " + name + "; Breed: " + breed + "; Color " + color + "; Weight: " + weight;
  }

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Name: ");
    String name = in.nextLine();
    System.out.println("Breed: ");
    String breed = in.nextLine();
    System.out.println("Color: ");
    String color = in.nextLine();
    System.out.println("Weight: ");
    double weight = in.nextDouble();
    
		Dog info = new Dog();
    info.bark();
		info.run();
	}
}
