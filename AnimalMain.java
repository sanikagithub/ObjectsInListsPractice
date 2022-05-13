import java.util.Scanner; 
import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args){ 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Animal Menu" + "\n"+"Entering nothing will stop the loop");
ArrayList<Animal> Animals = new ArrayList<>();

while (true) {
    System.out.print("Enter animal name (enter" + " done " + "to stop entries:)");
    String animalName = scanner.nextLine();
    boolean YesorNo = false;
    if (animalName.equals("done") || animalName.equals("")) {
        break;
    }
    System.out.print("Is it a dog? Yes or No:");
    YesorNo = scanner.nextLine().equalsIgnoreCase("yes");    
    Animals.add(new Animal(animalName, YesorNo));
}

for (Animal animal: Animals) {
        System.out.println(animal);
}
    scanner.close();
}
}
