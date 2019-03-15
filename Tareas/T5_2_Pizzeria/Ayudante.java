public class Ayudante extends Empleado
{
    public Ayudante()
    {

    }
    public Ayudante(String nombreEmpleado, String posicionEmpleado)
    {
        super(nombreEmpleado,posicionEmpleado);
    }
    public void ayudaAmasa(Chef chef, Pizza pizza)
    {
        System.out.println("El ayudante "+this.getNombre()+" ayuda al chef "+chef.getNombre()+" a amasar la pizza "+pizza.getTipo()); //FALTA COMPLEMENTAR
    }
    public void ayudaEmpacar(Pizza pizza)
    {
        System.out.println("El ayudante "+this.getNombre()+" ayuda a empacar la pizza "+pizza.getTipo()); //FALTA COMPLEMENTAR
    }
}