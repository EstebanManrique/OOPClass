import java.sql.Date;

public class Mensaje
{
    protected String texto;
    protected Date date;

    public Mensaje(String texto, Date date)
    {
        this.texto=texto;
        this.date=date;
    }
    public String getTexto()
    {
        return texto;
    }
    public void setTexto(String texto)
    {
        this.texto=texto;
    }
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date=date;
    }
}