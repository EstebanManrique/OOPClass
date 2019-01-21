public class TestFracciones
{
    public static void main(String[]args)
    {
        Fracciones fraccion=new Fracciones();
        fraccion.setNumerador(12);
        fraccion.setDenominador(10);
        System.out.println(fraccion.getNumerador()+"/"+fraccion.getDenominador());
        fraccion.simplifyFraction(fraccion.getNumerador(), fraccion.getDenominador());
    }
}