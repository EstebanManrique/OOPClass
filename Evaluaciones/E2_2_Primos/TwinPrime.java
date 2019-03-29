public class TwinPrime implements Prime
{
    public TwinPrime()
    {

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
            while(numeroprueba<1000&&(numerodenumeros<(numerodepareja)))
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
                }
                pareja=(numeroprimo1+"y"+numeroprimo2);
                numeroprueba++;
                denominador=1;
                //System.out.println(numerosresiduo0);
                numerosresiduo0=0;
                if(numeroprimo1-numeroprimo2==2)
                {
                    numerodenumeros=numerodenumeros+0.5;
                }
                System.out.println(numerodenumeros);
                //System.out.println(denominador);
                //System.out.println(numeroprueba);
                //System.out.println(numeroprimo1);
                //System.out.println(numeroprimo2);  
            }
        return pareja;
    }
    public String isPrime(int numero, int numero2) throws NotPrimeNumberException
    {
      
       if((numero2-numero==-2))
       {
           return new String("TRUE");
       }
       else
       {
         throw new NotPrimeNumberException(numero,numero2);
       }
    }
}
    