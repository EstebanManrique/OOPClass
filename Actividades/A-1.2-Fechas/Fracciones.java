public class Fracciones
{
    //attributes
    int numerador;
    int denominador;

    //methods
    public int getNumerador()
    {
        return numerador;
    }
    public void setNumerador(int numerador)
    {
        this.numerador=numerador;
    }
    public int getDenominador()
    {
        return denominador;  
    }
    public void setDenominador(int denominador)
    {
        this.denominador=denominador;
    }
    public void simplifyFraction(int numerador, int denominador)
    {
        int numerator=numerador;
        int denominator=denominador;
        int counter=2;
        while(counter<(numerador/2))
        {
            if((numerator%2)==0&&((denominator%2)==0)){
                numerator=numerator/2;
                denominator=denominator/2;
                counter++;
            }
            else{
                counter++;
            }
            //this.numerador=numerator;   
        }
            //this.denominador=denominator;   
        System.out.println(numerator+"/"+denominator);
    }
}
