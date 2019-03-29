public class Test
{
    public static void main(String[] args) 
    {
        TwinPrime po=new TwinPrime();
        System.out.println(po.nPrime(3)); 
        try
        {
        System.out.println(po.isPrime(5,3));
        }
        catch(NotPrimeNumberException e)
        {
            System.out.println(e.toString());
        }
    }
}