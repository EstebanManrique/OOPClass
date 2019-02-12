public class Cliente extends Person
{
    //public Cliente(){}
    public Cliente(String nombre)
    {
        super(nombre);
    }
    public void retirar(double cantidad, Sucursal s)
    {
      s.retiro(cantidad,this);  
    }

    public static void main(String[] args) 
    {
        Sucursal s=new Sucursal("Benito");
        Sucursal sb=new Sucursal("Juan");
        Cliente c= new Cliente("Paco");
        c.retirar(10000.d, s);    
        c.retirar(50000.d,sb);
    }
}