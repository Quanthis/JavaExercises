import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Animal implements  Soldable, Edible
{
    private String species;
    private String name;
    private BigDecimal weight;
    private File pic;
    private boolean isAlive;
    private BigDecimal worth;

    Animal(String speciesC, String nameC, BigDecimal weightC, File pictureC)
    {
        species = speciesC;
        name = nameC;
        weight = weightC;
        pic = pictureC;
        isAlive = true;
    }

    public Animal(String species, String name, BigDecimal weight, File pic, boolean isAlive, BigDecimal worth) {
        this.species = species;
        this.name = name;
        this.weight = weight;
        this.pic = pic;
        this.isAlive = isAlive;
        this.worth = worth;
    }

    public String getSpecies()
    {
        return species;
    }

    public void setSpecies(String speciesM)
    {
        species = speciesM;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String nameM)
    {
        name = nameM;
    }

    public BigDecimal getWeight()
    {
        return weight;
    }

    public void setWeight(BigDecimal weightM)
    {
        weight = weightM;
    }

    public File getPic()
    {
        return pic;
    }

    public void setPic(File pic2)
    {
        pic = pic2;
    }

    public void feedAnimal()
    {
        weight.subtract(new BigDecimal(1));
        System.out.println("Food eaten, animal weight's now: " + weight);
    }

    public void goForWalk(Double distance)
    {
        while(distance > 0)
        {
            System.out.println("Distance to make: " + distance);
            --distance;

            weight = weight.subtract(new BigDecimal(1));
            weight = weight.setScale(2, RoundingMode.HALF_UP);
            System.out.println(weight);

            isHungry();
            if(!animalState()) break;
        }
        System.out.println("Weight after walk: " + weight);
    }

    public boolean animalState()
    {
        if (weight.doubleValue() <= 0)
        {
            System.out.println("Animal is dead");
            isAlive = false;
            return false;
        }
        System.out.println("Animal lives... yet");
        return true;
    }

    public void isHungry()
    {
        if (weight.doubleValue() <= 5.0 && animalState())
        {
            System.out.println("I'm hungry");
            return;
        }
        System.out.println("I'm not hungry");
    }

    @Override
    public String Sell()
    {
        return getWorth().toString();
    }

    public BigDecimal getWorth()
    {
        return worth;
    }

    public void setWorth(BigDecimal worth)
    {
        this.worth = worth;
    }

    @Override
    public void beEaten()
    {
        System.out.println(this.name + " was eaten. ");
        this.isAlive = false;
    }
}
