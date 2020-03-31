import java.io.File;
import java.math.BigDecimal;

public class Program
{
    public static void main(String[] args)
    {
        Animal dog = new Animal("Husky", "myDog", new BigDecimal(4), new File("somedog.jpg"));

        System.out.println( dog.getName() + " is " + dog.getSpecies() + " weight's " + dog.getWeight() + " kg.");
        dog.feedAnimal();
        dog.goForWalk(10.0);

        Human man = new Human(
                        "Janusz",
                        "Biedronka",
                        new Double(35),
                        new Integer(00000000000),
                        new Animal
                                ("Doggy", "TheDog", new BigDecimal(4), new File("")),
                        new Phone
                                (123456789, "T-Mobile", 48),
                        new Double(3000.5),
                        new Car
                                ("Kombi", "Opal", "GD 12345", new BigDecimal(827362.4), 5));

        System.out.println("Man's car: " + man.getCar().getName());
        //System.out.println(czlek.getAge());
        //System.out.println(czlek.getSalary());

        var somePhone = new Phone(999888777, "MotoMoto", new BigDecimal(1500.1), 15500, "NetFet", 909090);

        somePhone.setWorth(new BigDecimal(1500));

        var someCar = new Car(123, "Volfo Smerfo", new BigDecimal(14000.50), "Vroom", "Groom", "SM791-1", new BigDecimal(150000.785), 2);

        System.out.println(someCar.getProducer());

        someCar.setProducer("Unknown");

        System.out.println(someCar.getProducer());
    }

}
