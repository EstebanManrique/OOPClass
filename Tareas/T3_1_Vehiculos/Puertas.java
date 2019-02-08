public class Puertas
{
    private String tipodePuerta; // Tipo ala, tijera, suicidio, cúpula, corredizas, cajuela
    private int pesoPuertaKg;

    public Puertas()
    {
        this.tipodePuerta="corrediza";
        this.pesoPuertaKg=3;
    }
    public Puertas(String tipo, int peso)
    {
        this.tipodePuerta=tipo;
        this.pesoPuertaKg=peso;
    }
}