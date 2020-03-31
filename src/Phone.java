import java.math.BigDecimal;

public class Phone extends Device
{
    private Integer number;
    private String net;
    private Integer dialling_code;

    public Phone(Integer numberC, String netC)
    {
        number = numberC;
        net = netC;
        dialling_code = -1;
    }

    public Phone(Integer numberC, String netC, Integer dialling_codeC)
    {
        number = numberC;
        net = netC;
        dialling_code = dialling_codeC;
    }

    public Phone(int number, String producer, BigDecimal worth, Integer number1, String net, Integer dialling_code)
    {
        super(number, producer, worth);
        this.number = number1;
        this.net = net;
        this.dialling_code = dialling_code;
    }


    public void setNumber(Integer numberM)
    {
        number = numberM;
    }

    public String getNet()
    {
        return net;
    }

    public void setNet(String net)
    {
        net = net;
    }

    public Integer getDialling_code()
    {
        return dialling_code;
    }

    public void setDialling_code(Integer dialling_codeM)
    {
        dialling_code = dialling_codeM;
    }

}
