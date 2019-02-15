public class Boca
{
    private String estadoSalud;
    private String olor;

    public Boca()
    {
        estadoSalud="Adecuado";
        olor="Regular";
    }
    public Boca(String estadoSalud, String olor)
    {
        this.estadoSalud=estadoSalud;
        this.olor=olor;
    }

    public void bocaBesa()
    {
        System.out.println("Besa");
    }
    public voud bocaHabla()
    {
        System.out.println("Habla");
    }
}