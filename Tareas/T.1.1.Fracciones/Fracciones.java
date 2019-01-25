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
        int counter=2;
        {
            while(counter<(numerador/2))
            if((numerador%counter)==0&&((denominador%counter)==0)){
                numerador=numerador/counter;
                denominador=denominador/counter;
                counter++;
            }
            else{
                counter++;
            }   
        }  
        System.out.println(numerador+"/"+denominador);
    }
    public void sumFraction(int numerador, int denominador, int numerador2, int denominador2)
    {
        if(denominador==denominador2)
        {
            numerador=numerador+numerador2;
            denominador=denominador2;
            simplifyFraction(numerador, denominador);
        }
        else
        {
            numerador=((numerador*denominador2)+(numerador2*denominador));
            simplifyFraction(numerador,(denominador*denominador2));
        }
    }
    public void substractFraction(int numerador, int denominador, int numerador2, int denominador2)
    {
        if(denominador==denominador2)
        {
            numerador=numerador-numerador2;
            denominador=denominador2;
            simplifyFraction(numerador,denominador);
        }
        else
        {
            numerador=((numerador*denominador2)-(numerador2*denominador));
            simplifyFraction(numerador, (denominador*denominador2));
        }
    }
    public void multiplyFraction(int numerador, int denominador, int numerador2, int denominador2)
    {
       simplifyFraction((numerador*numerador2),(denominador*denominador2));
    }
    public void divideFraction(int numerador, int denominador, int numerador2, int denominador2)
    {
        simplifyFraction((denominador*numerador2),(numerador*denominador2));
    }
}
