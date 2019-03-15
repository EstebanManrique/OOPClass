public class Chef extends Empleado
{
    public Chef()
    {

    }
    public Chef(String nombreEmpleado, String posicionEmpleado)
    {
        super(nombreEmpleado,posicionEmpleado);
    }
    public void amasa(Pizza pizza)
    {
        System.out.println("El chef "+this.getNombre()+ " amasa la pizza "+pizza.getTipo()); //FALTA COMPLEMENTAR
    }
    public void agregaIngredientes(Pizza pizza)
    {
        System.out.println("El chef "+this.getNombre()+ " agrega los ingredientes a la pizza "+pizza.getTipo()); //FALTA COMPLEMENTAR
    }
    public void hornea(Pizza pizza)
    {
        System.out.println("El chef "+this.getNombre()+ " hornea la pizza "+pizza.getTipo()); //FALTA COMPLEMENTAR
    }
}