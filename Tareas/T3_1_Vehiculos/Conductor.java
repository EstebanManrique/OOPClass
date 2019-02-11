public class Conductor 
{
    private String nombre;
    private int edad;
    private double presupuesto;
    private Concesionaria favorita;
    private Mecanico deConfianza;

    public Conductor(String nombre, int edad, double presupuesto, Concesionaria favorita, Mecanico deConfianza)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.presupuesto=presupuesto;
        this.favorita=favorita;
        this.deConfianza=deConfianza;
    }
    public void conduce(Vehiculo vehiculo)
    {
        System.out.println(nombre+" esta conduciendo el vehiculo "+vehiculo);
    }
    public void compra(Vehiculo vehiculo)
    {
        System.out.println(nombre+" compra el vehiculo "+vehiculo);
    }
    public void agenda()
    {
        System.out.println(nombre+" realiza una cita en la Concesionaria de su preferencia");
    }
    public void pasajeroAcompana(Pasajero pasajero)
    {
        pasajero.acompana();
    }
}