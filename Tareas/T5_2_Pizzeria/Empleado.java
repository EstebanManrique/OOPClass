public class Empleado
{
    protected String nombreEmpleado;
    protected String posicionEmpleado;

    public Empleado()
    {

    }
    public Empleado(String nombreEmpleado, String posicionEmpleado)
    {
        this.nombreEmpleado=nombreEmpleado;
        this.posicionEmpleado=posicionEmpleado;
    }
    public String getNombre()
    {
        return nombreEmpleado;
    }
    public void setNombre(String nombreEmpleado)
    {
        this.nombreEmpleado=nombreEmpleado;
    }
    public String getPosicion()
    {
        return posicionEmpleado;
    }
    public void setPosicion(String posicionEmpleado)
    {
        this.posicionEmpleado=posicionEmpleado;
    }
}