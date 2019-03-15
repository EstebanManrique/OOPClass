public class Test
{
    public static void main(String[] args) 
    {
        Banco bancoQuebrado=new Banco(1000);
        bancoQuebrado.deposit(1000);    
        try
        {
            bancoQuebrado.retirar(50000);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.toString());
        }
        try
        {
            int[] array= new int[5];
            //array[6]=20;
            int z= 10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
    }
}