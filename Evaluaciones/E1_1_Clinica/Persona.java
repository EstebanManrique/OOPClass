public class Persona
{
    private String nombre;
    private Cabeza cabeza;

    public Persona()
    {
    }
    
    public Persona(String nombre,Cabeza cabeza)
    {
        this.nombre=nombre;
        this.cabeza=cabeza;
    }

    public void verPersona(Persona persona)
    {
        //System.out.println("Soy "+nombre+" y estoy viendo a "+persona.getName());
    }
}