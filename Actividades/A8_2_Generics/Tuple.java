public class Tuple <Key, Value> //TIPOS DE DATOS GENERICOS
{
    protected Key key;
    protected Value value;
    protected String name;

    public Tuple(Key key, Value value)
    {
        this.key=key;
        this.value=value;
        name="Tupla";
    }
    public Key getKey()
    {
        return key;
    }
    public Value getValue()
    {
        return value;
    }
    public String toString() //NECESARIO CREARLO PARA NI IMPRIMIR LA DIRECCION
    {
        return "("+key+ ", "+value+")";
    }
}