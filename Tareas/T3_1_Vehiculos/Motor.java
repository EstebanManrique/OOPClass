public class Motor 
{
    private String tipodeMotor; //Gasolina, diesel, electrico
    private int numeroCaballosFuerza;
    private int numeroCilindros;
    private boolean turbo;

    public Motor()
    {

    }
    public Motor(String tipodeMotor, int numeroCaballosFuerza, int numeroCilindros, boolean turbo)
    {
        this.tipodeMotor=tipodeMotor;
        this.numeroCaballosFuerza=numeroCaballosFuerza;
        this.numeroCilindros=numeroCilindros;
        this.turbo=turbo;
    }
}