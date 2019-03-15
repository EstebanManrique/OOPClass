public class SucursalSanta extends Sucursal
{
    protected static SucursalSanta sucursalS=null;
    protected String[][] empleados;
    protected int contador1;
    protected int contador2;
    public SucursalSanta()
    {
        empleados=new String[10][2];
        contador1=0;
        contador2=0;
    }
    protected SucursalSanta(String direccion, String nombre)
    {
        super(direccion,nombre);
        empleados=new String[10][2];
        contador1=0;
        contador2=0;
    }
    public static SucursalSanta getSucursal()
    {
        if(sucursalS==null)
        {
            sucursalS=new SucursalSanta();
        }
        return sucursalS;
    }
    public void addEmpleado(Empleado empleado)
    {
        if(contador1<10)
        {
            empleados[contador1][contador2]=empleado.getNombre();
            contador2++;
            empleados[contador1][contador2]=empleado.getPosicion();
            contador1++;
            contador2=0;
        }
        else
        {
            System.out.println("Ya no es posible añadir otro empleado");
            System.out.println("");
        }
    }
}