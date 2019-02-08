
public class VehiculosTest
{
    public static void main(String[] args)
    {
        Vehiculo auto1=new Vehiculo();
        auto1.setNombreManufacturera("Audi");
        auto1.setNombreModelo("A4");
        auto1.setAnoModelo(2014);
        auto1.setColor("Blanco");
        auto1.setNumeroPasajeros(5);
        auto1.setNumeroPuertas(5);
        auto1.setPrecioCompra(345890.83);
        auto1.setKilometraje(34589.19);

        auto1.imprimirDescripcion();
        System.out.println();

        auto1.printEdad();
        System.out.println();

        auto1.precioVenta();
        System.out.println();
        System.out.println();

        auto1.servicioCorrespondiente();
        System.out.println();

        Puertas puerta1=new Puertas("ala",4);
        Puertas puerta2=new Puertas("ala",4);
        Puertas puerta3=new Puertas("ala",4);
        Puertas puerta4=new Puertas("ala",4);
        Puertas puerta5=new Puertas("cajuela",6);

        auto1.almacenarInfoPuertas(puerta1);
        auto1.almacenarInfoPuertas(puerta2);
        auto1.almacenarInfoPuertas(puerta3);
        auto1.almacenarInfoPuertas(puerta4);
        auto1.almacenarInfoPuertas(puerta5);

        Ventanas ventana1=new Ventanas("electrica", 77, 35, true);
        Ventanas ventana2=new Ventanas("electrica", 77, 35, true);
        Ventanas ventana3=new Ventanas("electrica", 77, 35, true);
        Ventanas ventana4=new Ventanas("electrica", 77, 35, true);

        auto1.almacenarInfoVentanas(ventana1);
        auto1.almacenarInfoVentanas(ventana2);
        auto1.almacenarInfoVentanas(ventana3);
        auto1.almacenarInfoVentanas(ventana4);

        Motor elMotor=new Motor("Gasolina",600,6,false);
        
        Transmision laTransmision=new Transmision("electrica",7);
       
        Llantas llantas1=new Llantas(15,"Michelin");
        Llantas llantas2=new Llantas(15,"Michelin");
        Llantas llantas3=new Llantas(15,"Michelin");
        Llantas llantas4=new Llantas(15,"Michelin");

        Concesionaria audiUniversidad=new Concesionaria("Audi Universidad","Universidad 237","Audi",17,11,auto1);
        Mecanico joaquin=new Mecanico("Joaquin",25,"Audi",audiUniversidad);
        Pasajero pasajero=new Pasajero("Juan",35);
        Conductor conductor=new Conductor("Paco Ignacio",42,345000.56,audiUniversidad,joaquin);
    

        System.out.println();


        Vehiculo auto2=new Vehiculo("Chevrolet","Camaro",2017,"Negro",2,3,678340.22,14567.11,
                                    "Gasolina",678,8,true,"Automatica",7,16,"Continental");

        auto2.imprimirDescripcion();
        System.out.println();

        auto2.printEdad();
        System.out.println();

        auto2.precioVenta();
        System.out.println();
        System.out.println();

        auto2.servicioCorrespondiente();
    }
}