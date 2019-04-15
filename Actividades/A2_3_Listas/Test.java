import java.util.ArrayList;

public class Test
{
    public static void main(String[] args) 
    {
        GenericList<String> listaStrings=new GenericList<>();
        listaStrings.add("hola");
        listaStrings.add("como");
        listaStrings.add("estas");
        listaStrings.add("el dia");
        listaStrings.add("de hoy");
        listaStrings.print();

        List<String> lista=new ArrayList<>();
    }
}