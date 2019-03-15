public class SucursalPolanco extends Sucursal
{
    protected String[][] empleados;
    protected int contador1;
    protected int contador2;
    protected static SucursalPolanco sucursalP=null;
    
    public SucursalPolanco()
    {
        empleados=new String[10][2];
        contador1=0;
        contador2=0;
    }
    protected SucursalPolanco(String direccion, String nombre)
    {
        super(direccion,nombre);
        empleados=new String[10][2];
        contador1=0;
        contador2=0;
    }
    public static SucursalPolanco getSucursal()
    {
        if(sucursalP==null)
        {
            sucursalP=new SucursalPolanco();
        }
        return sucursalP;
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
