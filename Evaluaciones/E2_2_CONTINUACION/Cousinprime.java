public class Cousinprime extends Prime
{
    private static Cousinprime instance=null;
    public Cousinprime()
    {

    }
    public static Cousinprime instanceOf()
    {
        if(instance==null)
        {
            instance=new Cousinprime();
        }
        return instance;
    }
    public String nPrime(int numerodepareja)
    {
        String pareja="";
        int numeroprimo1=0;
        int numeroprimo2=0;
        double numerodeparejaobtenidas=0;
        int numeroprueba=2;
        int denominador=1;
        int numerosresiduo0=0;
        double numerodenumeros=-0.5;
            while(numeroprueba<1000000000&&(numerodenumeros*2<(numerodepareja-1)))
            {
                while(denominador<=numeroprueba)
                {
                    int residuo=numeroprueba%denominador;
                    if(residuo==0)
                    {
                        numerosresiduo0++;
                    }
                    denominador++;
                }
                if(numerosresiduo0==2)
                {
                    numeroprimo2=numeroprimo1;
                    numeroprimo1=numeroprueba;
                
                pareja=(numeroprimo1+"y"+numeroprimo2);
                numeroprueba++;
                denominador=1;
                //System.out.println(numerosresiduo0);
                numerosresiduo0=0;
                if(numeroprimo1-numeroprimo2==4)
                {
                    numerodenumeros=numerodenumeros+0.5;
                }
                //System.out.println(numerodenumeros);
                //System.out.println(denominador);
                //System.out.println(numeroprueba);
                //System.out.println(numeroprimo1);
                //System.out.println(numeroprimo2); 
                }
                else
                {
                    numeroprueba++;
                    denominador=1;
                    numerosresiduo0=0;
                }
                if(numerodepareja==1)
                {
                    pareja=(7+"y"+3);
                    return pareja;
                }
            }
        return pareja;
    }
    public String isPrime(int numero, int numero2) throws NotPrimeNumberException
    {
        boolean numero1a=false;
        boolean numero2a=false;
        int denominador=1;
        int numerosresiduo0=0;
        while(denominador<=numero)
        {
            int residuo=numero%denominador;
            if(residuo==0)
            {
                numerosresiduo0++;
            }
            denominador++;
        }
        if(numerosresiduo0==2)
        {
            numero1a=true;
            denominador=1;
            numerosresiduo0=0;
        }
        else
        {
            denominador=1;
            numerosresiduo0=0;
        }
        while(denominador<=numero2)
        {
            int residuo=numero2%denominador;
            if(residuo==0)
            {
                numerosresiduo0++;
            }
            denominador++;
        }
        //System.out.println(numerosresiduo0);
        if(numerosresiduo0==2)
        {
            numero2a=true;
        }
        //System.out.println(numero1a);
        //System.out.println(numero2a);
       if((numero2-numero==4)&&(numero1a==numero2a))
       {
           return new String("TRUE");
       }
       else
       {
         throw new NotPrimeNumberException(numero,numero2);
       }
    }
}