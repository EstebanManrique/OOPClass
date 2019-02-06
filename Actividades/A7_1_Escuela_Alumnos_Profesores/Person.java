public class Person
{
    private String name;

    private Person()
    {
    }
    public Persona(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void print()
    {
        System.out.println(name);
    }
}