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
    public void conduce()
    {
        System.out.println("CONDUCIENDO");
    }
    public void compra()
    {
        System.out.println("COMPRANDO");
    }
    public void agenda()
    {
        System.out.println("AGENDA");
    }
    public void pasajeroAcompana(Pasajero pasajero)
    {
        pasajero.acompana();
    }
}