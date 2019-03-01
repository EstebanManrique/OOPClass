public class FigurasTest
{
    public static void main(String[] args) 
    {
        Triangulo triangulo1=new Triangulo(3.d,4.d,3.d,2.d);
        System.out.println(triangulo1.getPerimetro());
        System.out.println(triangulo1.getArea());

        Cuadrado cuadrado1=new Cuadrado(3.32);
        System.out.println(cuadrado1.getPerimetro());
        System.out.println(cuadrado1.getArea());

        Rectangulo rectangulo1=new Rectangulo(4.31,3.45);
        System.out.println(rectangulo1.getPerimetro());
        System.out.println(rectangulo1.getArea());

        Circulo circulo1=new Circulo(3.12);
        System.out.println(circulo1.getPerimetro());
        System.out.println(circulo1.getArea());

        Rombo rombo1=new Rombo(4.56,2.d,3.d);
        System.out.println(rombo1.getPerimetro());
        System.out.println(rombo1.getArea());

        Trapecio trapecio1=new Trapecio(4.d,5.67,3.45,6.1);
        System.out.println(trapecio1.getPerimetro());
        System.out.println(trapecio1.getArea());

        Romboide romboide1=new Romboide (4.56,3.81,2.d);
        System.out.println(romboide1.getPerimetro());
        System.out.println(romboide1.getArea());

        PoligonoRegular poligono1=new PoligonoRegular(5,3.45,2.37);
        System.out.println(poligono1.getPerimetro());
        System.out.println(poligono1.getArea());
    }
}