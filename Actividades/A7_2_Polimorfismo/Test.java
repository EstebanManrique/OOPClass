public class Test
{
    public static void main(String[] args) 
    {
        Animal[] arr=new Animal[2];


        Bird birdy=new Bird(); //STATIC BINDING
        Animal twetty=new Bear(); //DYNAMIC BINDING

        arr[0]=birdy;
        arr[1]=twetty;

        if(twetty instanceof Bird)
            ((Bird)twetty).sing("cancion");
        else
            twetty.doHisStuff();

        birdy.eat();
        twetty.eat();
    }
}