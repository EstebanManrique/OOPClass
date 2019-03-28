public class Test
{
    public static void main(String[] args) 
    {
        Animal[] arr=new Animal[2];


        Bird birdy=new Bird(); //STATIC BINDING
        Animal twetty=new Bear(); //DYNAMIC BINDING
        Animal birddy=new Bird();


        arr[0]=birdy;
        arr[1]=twetty;

        if(birddy instanceof Animal)
            ((Bird)birddy).sing("cancion");
        else
            twetty.doHisStuff();

        birdy.eat();
        twetty.eat();
    }
}