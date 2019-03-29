public class IPTables 
{
    protected ReglaDeNavegacion[] reglas;
    protected int contador;
    boolean navigationPossibility;
    public IPTables()
    {
        reglas=new ReglaDeNavegacion[10000];
        navigationPossibility=false;
        contador=0;
    }
    public void start()
    {
        navigationPossibility=true;
    }
    public void end()
    {
        navigationPossibility=false;
    }
    public boolean running()
    {
       return navigationPossibility;
    }
    public void addRule(String command, String sourceIp, String action)
    {
        int i=0;
        if(contador<10000)
        {
            
                reglas[contador]=new ReglaDeNavegacion<>(command,sourceIp,action);
                contador++;
        }
        else
        {
            System.out.println("Se ha llegado a un punto en donde no es posible agregar mas reglas; depurar Tabla");
        }
    }
    public ReglaDeNavegacion[] mandarArray()
    {
        return reglas;
    }
}