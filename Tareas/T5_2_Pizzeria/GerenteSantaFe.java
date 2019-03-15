public class GerenteSantaFe extends Gerente 
{
    protected static GerenteSantaFe gerenteS= null;
    protected int gananciasDia;
    private GerenteSantaFe()
    {

    }
    protected GerenteSantaFe(String nombreEmpleado, String posicionEmpleado)
    {
        super(nombreEmpleado,posicionEmpleado);
    }
    public static GerenteSantaFe getGerente()
    {
        if(gerenteS==null)
        {
            gerenteS=new GerenteSantaFe();
        }
        return gerenteS;
    }
    public double actualizacionVentas(Pizza pizza, SucursalSanta sucursal)
    {
        System.out.println("");
        gananciasDia=pizza.precio()+gananciasDia;
        System.out.println("Las ganancias del dia en la sucursal "+sucursal.getNombre()+" han sido: "+gananciasDia);
        System.out.println("");
        return gananciasDia;
    }
}