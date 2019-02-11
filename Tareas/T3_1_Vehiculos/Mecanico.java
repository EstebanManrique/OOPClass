public class Mecanico
{
    private String nombre;
    private int anosExperiencia;
    private String marcaDeEspecializacion;
    private Concesionaria lugarDeTrabajo;

    public Mecanico(String nombre, int anosExperiencia, String marcaDeEspecializacion, Concesionaria lugarDeTrabajo)
    {
        this.nombre=nombre;
        this.anosExperiencia=anosExperiencia;
        this.marcaDeEspecializacion=marcaDeEspecializacion;
        this.lugarDeTrabajo=lugarDeTrabajo;
    }
    public void trabaja()
    {
        System.out.println(nombre+"trabaja en la Concesionaria "+lugarDeTrabajo);
    }
    public void repara(Vehiculo vehiculo)
    {
        System.out.println(nombre+" repara el vehiculo "+vehiculo);
    }
    public void daServicios(Vehiculo vehiculo)
    {
        System.out.println(nombre+" le esta dando servicio al Vehiculo "+vehiculo);
    }
}