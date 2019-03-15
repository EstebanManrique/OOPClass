public class Cajero extends Empleado
{
    public Cajero()
    {

    }
    public Cajero(String nombreEmpleado, String posicionEmpleado)
    {
        super(nombreEmpleado,posicionEmpleado);
    }
    public void recibirOrden(Pizza pizza)
    {
        System.out.println("El cajero "+this.nombreEmpleado+" recibe la orden de la pizza "+pizza.getTipo()); //FALTA COMPLEMENTARLO
    }
    public void pedirChef(Chef chef, Pizza pizza)
    {
        System.out.println("El cajero "+this.nombreEmpleado+" le pide al chef "+chef.getNombre()+" que empiece la orden de la pizza "+pizza.getTipo()); //FALTA COMPLEMENTARLO
    }
    public void pedirRepartidor(Repartidor repartidor, Pizza pizza)
    {
        System.out.println("El cajero "+this.nombreEmpleado+" le pide al repartidor "+repartidor.getNombre()+" que reparta la pizza "+pizza.getTipo()); //FALTA COMPLEMENTARLO
    }
}