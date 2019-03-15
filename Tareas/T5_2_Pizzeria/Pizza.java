public class Pizza
{
    protected String ingredientes;
    protected String ingredientesPersonalizada="";
    protected int precio;
    protected int precioPersonalizada;
    protected String tipo;
    protected String[] listaIngredientes={"Pina","Queso","Frijoles","Chorizo","Vegetales","Queso bajo en Grasa"};
    protected int[] costosIngredientes={20,40,30,35,25,45};

    public Pizza()
    {

    }
    public Pizza(String tipo, boolean sucursalP, boolean sucursalS)
    {
        this.tipo=tipo;
        if(tipo.equalsIgnoreCase("Hawaiana")&&sucursalP==false&&sucursalS==true)
        {
            this.ingredientes="Piña y Queso";
            this.precio=60;
        }
        else if(tipo.equalsIgnoreCase("Hawaiana")&&sucursalP==true&&sucursalS==false)
        {
            System.out.println("No se puede hacer la pizza pedida debido a la falta de ingredientes");
        }
        else if(tipo.equalsIgnoreCase("Mexicana")&&sucursalP==false&&sucursalS==true)
        {
            this.ingredientes="Frijoles y Chorizo";
            this.precio=65;
        }
        else if(tipo.equalsIgnoreCase("Mexicana")&&sucursalP==true&&sucursalS==false)
        {
            System.out.println("No se puede hacer la pizza pedida debido a la falta de ingredientes");
        }
        else if(tipo.equalsIgnoreCase("Vegetariana")&&sucursalP==true&&sucursalS==false)
        {
            this.ingredientes="Vegetales";
            this.precio=25;
        }
        else if(tipo.equalsIgnoreCase("Vegetariana")&&sucursalP==false&sucursalS==true)
        {
            System.out.println("No se puede hacer la pizza pedida debido a la falta de ingredientes");
        }
        else if(sucursalP==true&&sucursalS==true)
        {
            System.out.println("No se puede hacer la pizza pedida por falta de ingredientes");
        }
        else if(sucursalP==false&&sucursalS==false)
        {
            System.out.println("No se puede hacer la pizza pedida por falta de ingredientes");
        }
        else if((tipo.equalsIgnoreCase("Personalizada")&&(sucursalP==false)&&(!ingredientesPersonalizada.contains("Vegetales"))))
        {
            this.ingredientes=ingredientesPersonalizada;
            this.precio=precio;
        }
        else
        {
            this.precio=0;
        }

    }
    public String ingredientesPersonalizada(String string)
    {
        int contador2=0;
        while(contador2<listaIngredientes.length)
        {
            if(string.equalsIgnoreCase(listaIngredientes[contador2]))
            {
                ingredientesPersonalizada=ingredientesPersonalizada.concat(string+" ");
                precio=precio+costosIngredientes[contador2];
            }
            contador2++;
        }
        return ingredientesPersonalizada;   
    }
    
    public int precio()
    {
        if(ingredientesPersonalizada.contains("Vegetales")||ingredientesPersonalizada.contains("Queso bajo en Grasa"))
        {
            System.out.println("No se puede hacer la pizza pedida por falta de ingredientes");
            return 0;
        }
        else
            return precio;  
    }
    public String getTipo()
    {
        return tipo;
    }
}
