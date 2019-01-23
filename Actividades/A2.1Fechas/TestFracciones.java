public class TestFracciones
{
    public static void main(String[]args)
    {
        Fracciones fraccion=new Fracciones();
        fraccion.setNumerador(12);
        fraccion.setDenominador(10);
        System.out.println(fraccion.getNumerador()+"/"+fraccion.getDenominador());
        fraccion.simplifyFraction(fraccion.getNumerador(), fraccion.getDenominador());
        System.out.println("");

        Fracciones segundaf=new Fracciones();
        segundaf.setNumerador(4);
        segundaf.setDenominador(20);
        System.out.println(segundaf.getNumerador()+"/"+segundaf.getDenominador());
        fraccion.simplifyFraction(fraccion.getNumerador(), fraccion.getDenominador());
        System.out.println("");

        segundaf.sumFraction(fraccion.getNumerador(),fraccion.getDenominador(),segundaf.getNumerador(),segundaf.getDenominador());
        segundaf.substractFraction(fraccion.getNumerador(),fraccion.getDenominador(),segundaf.getNumerador(),segundaf.getDenominador());
        segundaf.multiplyFraction(fraccion.getNumerador(),fraccion.getDenominador(),segundaf.getNumerador(),segundaf.getDenominador());
        segundaf.divideFraction(fraccion.getNumerador(),fraccion.getDenominador(),segundaf.getNumerador(),segundaf.getDenominador());
    }
}