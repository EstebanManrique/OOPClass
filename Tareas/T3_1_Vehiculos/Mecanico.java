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
        System.out.println("TRABAJA");
    }
    public void repara()
    {
        System.out.println("REPARA");
    }
    public void daServicios()
    {
        System.out.println("DA SERVICIOS");
    }
}