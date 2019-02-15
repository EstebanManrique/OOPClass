public class Cabeza
{
    private String tipo; //Alargada, Redonda, Ovalada, Cuadrada
    private String estilo; //Adecuado, Desalineada, Promedio
    
    private Ceja ceja1;
    private Ceja ceja2;
    private Mejilla mejilla1;
    private Mejilla mejilla2;
    private Boca boca;
    private Ojo ojo1;
    private Ojo ojo2;
    private Oreja oreja1;
    private Oreja oreja2;
    private Nariz nariz;
    private Labio labioSuperior;
    private Labio labioInferior;

    public Cabeza()
    {
        tipo="Ovalada";
        estilo="Desalineada";
        Mejilla mejilla1=new Mejilla();
        Mejilla mejilla2=new Mejilla();
        Boca boca=new Boca();
        Ojo ojo1=new Ojo();
        Ojo ojo2=new Ojo();
        Oreja oreja1=new Oreja();
        Oreja oreja2=new Oreja();
        Nariz nariz=new Nariz();
        Labio labioSuperior=new Labio();
        Labio labioInferior=new Labio();

    }
    public Cabeza(String tipo, String estilo, Mejilla mejilla1, Mejilla mejilla2, Boca boca, Ojo ojo1, Ojo ojo2, Oreja oreja1, Oreja oreja2, 
                    Nariz nariz, Labio labioSuperior, Labio labioInferior)
    {
        this.tipo=tipo;
        this.estilo=estilo;
        this.mejilla1=mejilla1;
        this.mejilla2=mejilla2;
        this.boca=boca;
        this.ojo1=ojo1;
        this.ojo2=ojo2;
        this.oreja1=oreja1;
        this.oreja2=oreja2;
        this.nariz=nariz;
        this.labioSuperior=labioSuperior;
        this.labioInferior=labioInferior;
    }
}