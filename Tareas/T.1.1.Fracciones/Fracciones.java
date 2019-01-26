public class Fracciones
{
    //attributes
    private int numerador;
    private int denominador;

    //methods
    public Fracciones()
    {
        System.out.println("contructor sin parámetro");
    }
    public Fracciones(int numerador, int denominador)
    {
        this.numerador=numerador;
        this.denominador=denominador;
    }
    public int getNumerador()
    {
        return numerador;
    }
    public int getDenominador()
    {
        return denominador;  
    }
    public void simplifyFraction(Fracciones myFraccion) //método para simplificar solamente
    {
        int counter=2;
        int numeradorr=myFraccion.getNumerador();
        int denominadorr=myFraccion.getDenominador();
        {
            while(counter<=(numeradorr/2)||counter<=(denominadorr/2))
                if((numeradorr%counter)==0&&((denominadorr%counter)==0)){
                    numeradorr=numeradorr/counter;
                    denominadorr=denominadorr/counter;
                    counter=2;
                }
                else{
                    counter++;
                }   
            }  
        System.out.println(numeradorr+"/"+denominadorr);
    }
    public void simplifyFraction(int numeradorr, int denominadorr) //método para simplificar dentro de operación (suma, resta, etc.)
    {
        int counter=2;
        {
            while(counter<=(numeradorr/2)||counter<=(denominadorr/2))
                if((numeradorr%counter)==0&&((denominadorr%counter)==0)){
                    numeradorr=numeradorr/counter;
                    denominadorr=denominadorr/counter;
                    counter=2;
                }
                else{
                    counter++;
                }   
            }  
        System.out.println(numeradorr+"/"+denominadorr);
    }
    public void sumFraction(Fracciones fraccion, Fracciones segundaf)
    {
        int numeradorr=0;
        int denominadorr=0;
        if(fraccion.getDenominador()==segundaf.getDenominador())
        {
            numeradorr=fraccion.getNumerador()+segundaf.getNumerador();
            denominadorr=segundaf.getDenominador();
            simplifyFraction(numeradorr, denominadorr);
        }
        else
        {
            numeradorr=((fraccion.getNumerador()*segundaf.getDenominador())+(segundaf.getNumerador()*fraccion.getDenominador()));
            denominadorr=(fraccion.getDenominador()*segundaf.getDenominador());
            simplifyFraction(numeradorr, denominadorr);
        }
    }
    public void substractFraction(Fracciones fraccion, Fracciones segundaf)
    {
        int numeradorr=0;
        int denominadorr=0;
        if(fraccion.getDenominador()==segundaf.getDenominador())
        {
            numeradorr=fraccion.getNumerador()-segundaf.getNumerador();
            denominadorr=segundaf.getDenominador();
            simplifyFraction(numeradorr, denominadorr);
        }
        else
        {
            numeradorr=((fraccion.getNumerador()*segundaf.getDenominador())-(segundaf.getNumerador()*fraccion.getDenominador()));
            denominadorr=fraccion.getDenominador()*segundaf.getDenominador();
            simplifyFraction(numeradorr, denominadorr);
        }
    }
    public void multiplyFraction(Fracciones fraccion, Fracciones segundaf)
    {
        int numeradorr=0;
        int denominadorr=0;
        numeradorr=fraccion.getNumerador()*segundaf.getNumerador();
        denominadorr=fraccion.getDenominador()*segundaf.getDenominador();
        simplifyFraction(numeradorr, denominadorr);
    }
    public void divideFraction(Fracciones fraccion, Fracciones segundaf)
    {
        int numeradorr=0;
        int denominadorr=0;
        numeradorr=fraccion.getNumerador()*segundaf.getDenominador();
        denominadorr=fraccion.getDenominador()*segundaf.getNumerador();
        simplifyFraction(numeradorr, denominadorr);
    }
}