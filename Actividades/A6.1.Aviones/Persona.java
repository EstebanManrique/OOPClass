public class Persona
{
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String direccion, String telefono)
    {
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public String getNombre()
    {
        return nombre;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public String getTelefono()
    {
        return telefono;
    }
    
    public void print()
    {
        System.out.println("nombre:"+getNombre()+" direccion:"+getDireccion()+" telefono:"+getTelefono());
    }
}