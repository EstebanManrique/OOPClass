public class TestFracciones
{
    public static void main(String[]args)
    {
        Fracciones fraccion=new Fracciones(4,6);
        Fracciones segundaf=new Fracciones(1,6);

        System.out.println(fraccion.getNumerador());
        System.out.println(fraccion.getDenominador());
        System.out.println(segundaf.getNumerador());
        System.out.println(segundaf.getDenominador());
        System.out.println("");

        fraccion.simplifyFraction(fraccion); 
        fraccion.sumFraction(fraccion,segundaf);
        fraccion.substractFraction(fraccion,segundaf);
        fraccion.multiplyFraction(fraccion,segundaf);
        fraccion.divideFraction(fraccion,segundaf);
    }
}