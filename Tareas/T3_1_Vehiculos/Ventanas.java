public class Ventanas
{
    private String tipodeVentanas; //electricas, manuales
    private int largoCm;
    private int altoCm;
    private boolean polarizadas;

    public Ventanas()
    {
        this.tipodeVentanas="electricas";
        this.largoCm=95;
        this.altoCm=45;
        this.polarizadas=false;
    }
    public Ventanas(String tipo, int largo, int alto, boolean polarizada)
    {
        this.tipodeVentanas=tipo;
        this.largoCm=largo;
        this.altoCm=alto;
        this.polarizadas=polarizada;
    }
}