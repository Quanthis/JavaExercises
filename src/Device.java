import java.math.BigDecimal;

public abstract class Device
{
    protected int number;
    protected String producer;
    protected BigDecimal worth;

    public  Device()
    {

    }

    public Device(int number, String producer, BigDecimal worth)
    {
        this.number = number;
        this.producer = producer;
        this.worth = worth;
    }

    public Device(int number, String producer)
    {
        this.number = number;
        this.producer = producer;
    }

    public Device(String producer, BigDecimal worth)
    {
        this.producer = producer;
        this.worth = worth;
    }

    public Device(int number, BigDecimal worth)
    {
        this.number = number;
        this.worth = worth;
    }

    public Device(int number)
    {
        this.number = number;
    }

    public Device(String producer)
    {
        this.producer = producer;
    }

    public Device(BigDecimal worth)
    {
        this.worth = worth;
    }



    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }

    public BigDecimal getWorth()
    {
        return worth;
    }

    public void setWorth(BigDecimal worth)
    {
        this.worth = worth;
    }
}
