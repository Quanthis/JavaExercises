import java.math.BigDecimal;

public class Car
{
    private String type;
    private String name;
    private String code;
    private BigDecimal km_state;
    private Integer seats;

    public Car(String typeC, String nameC, String codeC, BigDecimal km_stateC, Integer seatsC)
    {
        type = typeC;
        name = nameC;
        code = codeC;
        km_state = km_stateC;
        seats = seatsC;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String typeM)
    {
        type = typeM;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String nameM)
    {
        name = nameM;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String codeM)
    {
        code = codeM;
    }

    public BigDecimal getKm_state()
    {
        return km_state;
    }

    public void setKm_state(BigDecimal km_stateM)
    {
        km_state = km_stateM;
    }

    public Integer getSeats()
    {
        return seats;
    }

    public void setSeats(Integer seatsM)
    {
        seats = seatsM;
    }
}
