public class Test
{
    public static void main(String[] args) 
    {
        TwinPrime po=TwinPrime.instanceOf();
        System.out.println(po.nPrime(1));
        System.out.println(po.nPrime(2));
        System.out.println(po.nPrime(3));
        System.out.println(po.nPrime(4));
        System.out.println(po.nPrime(5));
        System.out.println(po.nPrime(6));
        System.out.println(po.nPrime(7));
        System.out.println(po.nPrime(8));
        System.out.println(po.nPrime(9));
        try
        {
        System.out.println(po.isPrime(137,139));
        }
        catch(NotPrimeNumberException e)
        {
            System.out.println(e.toString());
        }
        Cousinprime pi=Cousinprime.instanceOf();
        System.out.println(pi.nPrime(1));
        System.out.println(pi.nPrime(2));
        System.out.println(pi.nPrime(3));
        System.out.println(pi.nPrime(4));
        System.out.println(pi.nPrime(5));
        System.out.println(pi.nPrime(6));
        System.out.println(pi.nPrime(7));
        System.out.println(pi.nPrime(8));
        System.out.println(pi.nPrime(9));
        try
        {
        System.out.println(pi.isPrime(883,887));
        }
        catch(NotPrimeNumberException e)
        {
            System.out.println(e.toString());
        }
        PalindromicPrime pu= PalindromicPrime.instanceOf();
        System.out.println(pu.nPrime(1));
        System.out.println(pu.nPrime(2));
        System.out.println(pu.nPrime(3));
        System.out.println(pu.nPrime(4));
        System.out.println(pu.nPrime(5));
        System.out.println(pu.nPrime(6));
        System.out.println(pu.nPrime(7));
        System.out.println(pu.nPrime(8));
        System.out.println(pu.nPrime(9));
        try
        {
            System.out.println(pu.isPrime(787));
        }
        catch(NotPrimeNumberException e)
        {
            System.out.println(e.toString());
        }  
    }
}