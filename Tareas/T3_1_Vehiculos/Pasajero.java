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
        System.out.println(nombre+" es considerado como acompañante en el vehiculo");
    }
    public void viajeEn(Vehiculo vehiculo)
    {
        System.out.println(nombre+ " esta viajando en el vehiculo "+vehiculo);
    }
}