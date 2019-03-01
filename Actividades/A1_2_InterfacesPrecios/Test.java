public class Test
{
    public static void main(String[] args) 
    {
        Car carro1= new Car("advanced");
        Car carro2= new Car("basic");
    
        System.out.println(carro1.isMoreExpensive(carro2));

        House house1= new House(3);
        House house2= new House(37);

        System.out.println(house1.isMoreExpensive(house2));

        Hamburger hamburguesin= new Hamburger(2);
        Hamburger hamburguesina= new Hamburger(3);

        System.out.println(hamburguesin.isMoreExpensive(hamburguesina));
        System.out.println(hamburguesin.isMoreExpensive(house1));
    }
}