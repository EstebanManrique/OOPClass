public class ClinicaTest
{
    public static void main(String[] args)
    {
        Persona Juan=new Persona("Juan");
        Persona Marianita=new Persona("Marianita");
        Persona Lucecita=new Persona("Lucecita");

        Juan.mirar(Juan,Marianita);
        Juan.pedirBeso(Juan,Marianita);
        Juan.otorgarPermiso(Juan,Marianita,false);
        Juan.darBeso(Juan,Marianita);

    }
}