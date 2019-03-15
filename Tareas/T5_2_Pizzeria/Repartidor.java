public class Repartidor extends Empleado
{
    public Repartidor()
    {

    }
    public Repartidor(String nombreEmpleado, String posicionEmpleado)
    {
        super(nombreEmpleado,posicionEmpleado);
    }
    public void repartir(Pizza pizza)
    {
        System.out.println("El repartidor "+this.nombreEmpleado+" repartira la pizza "+pizza.getTipo()); //FALTA COMPLEMENTARLO
    }
}