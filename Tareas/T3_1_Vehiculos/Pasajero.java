public class Pasajero
{
    private String nombre;
    private int edad;

    public Pasajero(String nombre,int edad)
    {
        this.nombre=nombre;
        this.edad=edad;
    }
    public void acompana()
    {
        System.out.println("ACOMPAÑANDO");
    }
    public void viajeEn()
    {
        System.out.println("VIAJANDO");
    }
}