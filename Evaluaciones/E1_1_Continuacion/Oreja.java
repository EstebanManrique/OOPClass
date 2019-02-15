public class Oreja
{
    private String forma;
    private String volumenCerilla;

    public Oreja()
    {
        forma="Alargada";
        volumenCerilla="Excesivo";
    }
    public Oreja(String forma, String volumenCerilla)
    {
        this.forma=forma;
        this.volumenCerilla=volumenCerilla;
    }

    public void escuchaOreja()
    {
        System.out.println("Escucha");
    }
    
}