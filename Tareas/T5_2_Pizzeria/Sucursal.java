public class Sucursal
{
    protected String direccion;
    protected String nombre;

    public Sucursal()
    {

    }
    public Sucursal(String direccion, String nombre)
    {
        this.direccion=direccion;
        this.nombre=nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public void setDireccion(String direccion)
    {
        this.direccion=direccion;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
}