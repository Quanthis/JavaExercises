public class Human implements  Edible, Soldable
{
    private String name;
    private String surname;
    private Double age;
    private Integer id;
    private Animal animal;
    private Phone number;
    private Double salary;
    private Car car;

    public Human(String nameC, String surnameC, Double ageC, Integer idC, Animal animalC, Phone numberC, Double salaryC, Car carC)
    {
        name = nameC;
        surname = surnameC;
        age = ageC;
        id = idC;
        animal = animalC;
        number = numberC;
        salary = salaryC;
        car = carC;
    }

    public Human()
    {

    }


    public String getName()
    {
        return name;
    }

    public void setName(String nameM)
    {
        name = nameM;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surnameM)
    {
        surname = surnameM;
    }

    public Double getAge()
    {
        return age;
    }

    public void setAge(Double ageM)
    {
        age = ageM;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer idM)
    {
        id = idM;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animalM)
    {
        animal = animalM;
    }

    public Phone getNumber()
    {
        return number;
    }

    public void setNumber(Phone numberM)
    {
        number = numberM;
    }

    public Double getSalary()
    {
        return salary;
    }

    public void setSalary(Double salaryM)
    {
        salary = salary;
    }

    public Car getCar()
    {
        return car;
    }

    public void setCar(Car car)
    {
        car = car;
    }

    @Override
    public void beEaten() throws Exception
    {
        throw new Exception("You can't eat humans.");
    }

    @Override
    public String Sell() throws Exception
    {
        throw new Exception("You can't sell humans. ");
    }
}
