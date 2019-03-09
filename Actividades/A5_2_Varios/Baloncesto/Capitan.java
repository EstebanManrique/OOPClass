package Actividades.A5_2_Varios.Baloncesto;
public class Capitan extends Jugador
{
    private static Capitan capitan= null;
    private Capitan()
    {

    }
    public Capitan(String nombre, String lastName, int numeroCamiseta, int numeroCanastas)
    {
        super(nombre,lastName,numeroCamiseta,numeroCanastas);
    }
    public static Capitan getInstance()
    {
        if(capitan==null)
        {
            capitan=new Capitan();
        }
        return capitan;
    }
    public void darOrdenes(Jugador jugador)
    {
        System.out.println(this.nombre+" le da una orden a "+jugador.getNombre());
    }
}