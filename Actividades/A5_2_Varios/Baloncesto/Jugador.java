package Actividades.A5_2_Varios.Baloncesto;
import java.util.Random;

public class Jugador
{
    protected String nombre;
    protected String lastName;
    protected int numeroCamiseta;
    protected int numeroCanastas;

    public Jugador()
    {
    }
    public Jugador(String nombre, String lastName, int numeroCamiseta, int numeroCanastas)
    {
        this.nombre=nombre;
        this.lastName=lastName;
        this.numeroCamiseta=numeroCamiseta;
        if(numeroCamiseta>=0&&numeroCamiseta<=100)
        {
            this.numeroCamiseta=numeroCamiseta;
        }
        else
        {
            this.numeroCamiseta=(int)(Math.random() * 100) + 0;
        }
        this.numeroCanastas=numeroCanastas;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre()
    {
        this.nombre=nombre;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName()
    {
        this.lastName=lastName;
    }
    public int getNumeroCamiseta()
    {
        return numeroCamiseta;
    }
    public void setNumeroCamiseta()
    {
        this.numeroCamiseta=numeroCamiseta;
    }
    public int getNumeroCanastas()
    {
        return numeroCanastas;
    }
    public void setNumeroCanasta()
    {
        this.numeroCanastas=numeroCanastas;
    }
    public void seguirOrdenes()
    {
        System.out.println(this.nombre+" esta siguiendo ordenes");
    }
}