public class PalindromicPrime extends Prime
{
    private static PalindromicPrime instance=null;
    public PalindromicPrime()
    {
    }
    public static PalindromicPrime instanceOf()
    {
        if(instance==null)
        {
            instance=new PalindromicPrime();
        }
        return instance;
    }
    public String nPrime(int numerodenumero)
    {
        int numeroprimo1=0;
        int numeroprueba=2;
        int denominador=1;
        int numerosresiduo0=0;
        double numerodenumeros=0;
        boolean palindromo=false;
        while(numeroprueba<1000000000&&(numerodenumeros<(numerodenumero)))
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
                    numeroprimo1=numeroprueba;
                
                //System.out.println(numerosresiduo0);
                numerosresiduo0=0;
                String numeroString=Integer.toString(numeroprimo1);
                //System.out.println(numeroString);
                for(int i=0; i<(numeroString.length());i++)
                {
                    int j=numeroString.length();
                    //System.out.println(j);
                    //System.out.println(numeroString.charAt(i));
                    //System.out.println(numeroString.charAt(j));
                    if(numeroString.charAt(i)==numeroString.charAt(j-1))
                    {
                        palindromo=true;
                        j--;
                    }
                    else
                        palindromo=false;

                        break;
                }
                if(palindromo==true)
                {
                    numerodenumeros=numerodenumeros+1;
                }
                numeroprueba++;
                denominador=1;
            }
            else
            {
                numeroprueba++;
                denominador=1;
                numerosresiduo0=0;
            }
        }
        return Integer.toString(numeroprimo1); 
    }
    public String isPrime(int numero) throws NotPrimeNumberException
    {
        boolean numero1a=false;
        boolean palindromo=false;
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
        }
        if(numero1a==true)
        {
        String numeroString=Integer.toString(numero);
                //System.out.println(numeroString);
                for(int i=0; i<(numeroString.length());i++)
                {
                    int j=numeroString.length();
                    //System.out.println(j);
                    //System.out.println(numeroString.charAt(i));
                    //System.out.println(numeroString.charAt(j));
                    if(numeroString.charAt(i)==numeroString.charAt(j-1))
                    {
                        palindromo=true;
                        j--;
                    }
                    else
                        palindromo=false;

                        break;
                }
                if(palindromo==true)
                {
                    return ("TRUE");
                }
                else
                {
                    throw new NotPrimeNumberException(numero);
                }
            }
            else
            {
                throw new NotPrimeNumberException(numero);
            }
    }
}