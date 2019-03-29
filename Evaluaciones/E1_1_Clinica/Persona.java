public class Persona
{
    private String nombre;
    private Cabeza cabeza;
    private int cont;
    private Persona[][]permisos;
    private int cont2;

    public Persona()
    {
        int cont=0;
        int cont1=0;
        permisos=new Persona[100][100];
    }
    
    public Persona(String nombre)
    {
        this.nombre=nombre;
        Cabeza cabeza=new Cabeza();
        int cont=0;
        int cont2=0;
        permisos=new Persona[100][100];
    }
    
    public void getName()
    {
        System.out.print(nombre);
    }
    

    public void mirar(Persona persona, Persona persona2)
    {
        persona.getName();
        System.out.print(" esta mirando a ");
        persona2.getName();
        System.out.println();
    }
    public void pedirBeso(Persona persona, Persona persona2)
    {
        persona.getName();
        System.out.print(" dice: ");
        persona2.getName();
        System.out.println(", te puedo dar un beso?");  
    }

    public void otorgarPermiso(Persona persona, Persona persona2, boolean permiso)
    {
        if(permiso)
        {
            permisos[0][0]=persona;
            cont2++;
            permisos[0][1]=persona2;
            System.out.println("Se ha otorgado el permiso");
        }
        else
        System.out.println("No se ha otorgado el permiso");
    }

    public void darBeso(Persona persona, Persona persona2)
    {
        if(permisos[0][0]==persona&&permisos[0][1]==persona2)
        {
            persona.getName();
            System.out.print(" le esta dando un beso a ");
            persona2.getName();
            System.out.println();  
        }
        else
        {
            persona.getName();
            System.out.print(" no le puede dar un beso a ");
            persona2.getName();
            System.out.println();   
        }
    }

}