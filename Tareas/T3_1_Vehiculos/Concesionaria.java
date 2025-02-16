public class Concesionaria
{
    private String nombre;
    private String direccion;
    private String marcaConcesionaria;
    private int numeroMecanicos;
    private int numeroCochesReparando;
    private Vehiculo enVenta;

    public Concesionaria(String nombre, String direccion, String marcaConcesionaria, int numeroMecanicos, int numeroCochesReparando, Vehiculo enVenta)
    {
        this.nombre=nombre;
        this.direccion=direccion;
        this.marcaConcesionaria=marcaConcesionaria;
        this.numeroMecanicos=numeroMecanicos;
        this.numeroCochesReparando=numeroCochesReparando;
        this.enVenta=enVenta;
    }
    public void arregla(Vehiculo vehiculo)
    {
        System.out.println("La conncesionaria "+nombre+", mediante el servicio de esta arreglando el vehiculo "+vehiculo);
    }
    public void vende(Vehiculo vehiculo)
    {
        System.out.println("La conncesionaria "+nombre+" ha puesto a la venta el vehiculo "+vehiculo);
    }
    public void conductorAgenda(Conductor conductor)
    {
        conductor.agenda();
    }
    public void mecanicoTrabaja(Mecanico mecanico)
    {
        mecanico.trabaja();
    }
}