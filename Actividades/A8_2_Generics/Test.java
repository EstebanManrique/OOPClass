public class Test
{
    public static void main(String[] args)
    {
        Tuple<Integer,String> intString=new Tuple<>(1,"Dave"); 
        Tuple<String,String> StringString=new Tuple<>("Hola","Juan Carlos");
        Tuple<Double,String> scannerScanner=new Tuple<>(6.25,"new Scanner(System.in)");

        Tuple[] arr= new Tuple[3];
        arr[0]=intString;
        arr[1]=StringString;
        arr[2]=scannerScanner;

        System.out.println(intString); //ESTA UTILIZANDO EL METODDO TO STRING DE MANERA AUTOMATICA

        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i].getValue());
        }

        Dog dog1=new Dog(18);
        Dog dog2=new Dog(8);
        System.out.println(dog1.compare2(dog2));

    }
}