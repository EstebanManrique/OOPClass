package Actividades.A5_2_Varios.Caballos;
import java.sql.Date;
public class Caballo
{
    protected String nombre;
    protected String color;
    protected String fechaNacimiento;

    private Caballo()
    {

    }
    public Caballo(String nombre, String color, String fechaNacimiento)
    {
        this.nombre=nombre;
        this.color=color;
        this.fechaNacimiento=fechaNacimiento;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getFecha()
    {
        return fechaNacimiento;
    }
    public void setFecha(String fechaNacimiento)
    {
        this.fechaNacimiento=fechaNacimiento;
    }
    public void relinchar()
    {
        System.out.println(this.getNombre()+" Relinchando a lenta velocidad");
    }
}