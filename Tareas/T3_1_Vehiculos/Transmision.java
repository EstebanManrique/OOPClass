public class Transmision
{
    private String tipoTransmision; // automatica, estandar, doble embargue
    private int numeroVelocidades;

    public Transmision()
    {
        
    }

    public Transmision(String tipoTransmision, int numeroVelocidades)
    {
        this.tipoTransmision=tipoTransmision;
        this.numeroVelocidades=numeroVelocidades;
    }
}