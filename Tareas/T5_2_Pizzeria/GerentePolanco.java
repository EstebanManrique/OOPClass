public class GerentePolanco extends Gerente 
{
    protected static GerentePolanco gerenteP= null;
    protected int gananciasDia;
    public GerentePolanco()
    {

    }
    protected GerentePolanco(String nombreEmpleado, String posicionEmpleado)
    {
        super(nombreEmpleado,posicionEmpleado);
    }
    public static GerentePolanco getGerente()
    {
        if(gerenteP==null)
        {
            gerenteP=new GerentePolanco();
        }
        return gerenteP;
    }
    public double actualizacionVentas(Pizza pizza, SucursalPolanco sucursal)
    {
        System.out.println("");
        gananciasDia=pizza.precio()+gananciasDia;
        System.out.println("Las ganancias del dia en la sucursal "+sucursal.getNombre()+" han sido: "+gananciasDia);
        System.out.println("");
        return gananciasDia;
    }
}