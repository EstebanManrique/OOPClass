public class Nariz
{
    private String condicionTabique;
    private String mucosidad;

    public Nariz()
    {
        condicionTabique="Desviado";
        mucosidad="baja";
    }
    public Nariz(String condicionTabique, String mucosidad)
    {
        this.condicionTabique=condicionTabique;
        this.mucosidad=mucosidad;
    }

    public void narizInhala()
    {
        System.out.println("Inhala");
    }
    public voud narizExhala()
    {
        System.out.println("Exhala");
    }
}