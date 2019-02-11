import java.text.DecimalFormat;
public class Vehiculo
{
    //PARAMETROS REQUERIDOS EN DOCUMENTOS
    private String nombreManufacturera; //TIENE GET Y SET
    private String nombreModelo; //TIENE GET Y SET
    private int anoModelo; //TIENE GET Y SET
    private String color; //TIENE GET Y SET
    private int numeroPasajeros; //TIENE GET Y SET
    private int numeroPuertas; //TIENE GET Y SET
    private double precioCompra; //TIENE GET Y SET
    private double kilometraje; //TIENE GET Y SET

    //PARAMETROS (SUB-OBJETOS) PARA COMPOSICION
    private Motor elMotor;
    private Transmision laTransmision;
    private Llantas llantas1;
    private Llantas llantas2;
    private Llantas llantas3;
    private Llantas llantas4;
    
    //PARAMETROS PARA METODOS DE AGREGACION
    private Puertas[] puerta;
    private int cont;
    private Ventanas[] ventana;
    private int cont2;

    public Vehiculo() //CONSTRUCTOS POR DEFAULT
    {
        this.nombreManufacturera="Sin nombre";
        this.nombreModelo="Sin nombre";
        anoModelo=1900;
        this.color="Sin color";
        numeroPasajeros=5;
        numeroPuertas=5;
        precioCompra=0.d;
        kilometraje=0.d;
        puerta=new Puertas[5];
        cont=0;
        ventana=new Ventanas[4];
        cont2=0;
        elMotor=new Motor("Gasolina",150,4,false);
        laTransmision=new Transmision("Automatica",5);
        llantas1=new Llantas(15,"Michelin");
        llantas2=new Llantas(15,"Michelin");
        llantas3=new Llantas(15,"Michelin");
        llantas4=new Llantas(15,"Michelin");
    }
    public Vehiculo(String nombreManufacturera, String nombreModelo, int anoModelo, String color, int numeroPasajeros, int numeroPuertas, 
                    double precioCompra, double kilometraje,String tipodeMotor, int numeroCaballosFuerza, int numeroCilindros, boolean turbo,
                    String tipoTransmision, int numeroVelocidades,int rin, String marca) //CONSTRUCTOR A UTILZIAR
    {
        this.nombreManufacturera=nombreManufacturera;
        this.nombreModelo=nombreModelo;
        this.color=color;
        this.anoModelo=anoModelo;
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.precioCompra=precioCompra;
        this.kilometraje=kilometraje;
        puerta=new Puertas[getNumeroPuertas()];
        cont=0;
        ventana=new Ventanas[getNumeroPuertas()-1];
        cont2=0;
        elMotor=new Motor(tipodeMotor,numeroCaballosFuerza,numeroCilindros,turbo);
        laTransmision=new Transmision(tipoTransmision,numeroVelocidades);
        llantas1=new Llantas(rin,marca);
        llantas2=new Llantas(rin,marca);
        llantas3=new Llantas(rin,marca);
        llantas4=new Llantas(rin,marca);
    }

    // METODOS GET Y SET DE PARAMETROS DE CLASE
    public String getNombreManufacturera()
    {
        return nombreManufacturera;
    }
    public void setNombreManufacturera(String nombreManufacturera) 
    {
        this.nombreManufacturera = nombreManufacturera;
    }
    public String getNombreModelo()
    {
        return nombreModelo;
    }
    public void setNombreModelo(String nombreModelo)
    {
        this.nombreModelo=nombreModelo;
    }
    public int getAnoModelo()
    {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo)
    {
        this.anoModelo=anoModelo;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public int getNumeroPasajeros()
    {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros)
    {
        this.numeroPasajeros=numeroPasajeros;
    }
    public int getNumeroPuertas()
    {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas)
    {
        this.numeroPuertas=numeroPuertas;
    }
    public double getPrecioCompra()
    {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra)
    {
        this.precioCompra=precioCompra;
    }
    public double getKilometraje()
    {
        return kilometraje;
    }
    public void setKilometraje(double kilometraje)
    {
        this.kilometraje=kilometraje;
    }

    //IMPRIMIR EN PANTALLA DESCRIPCION
    public void imprimirDescripcion()
    {
        System.out.println("Manufacturera: "+nombreManufacturera);
        System.out.println("Modelo: "+nombreModelo);
        System.out.println("Ano: "+anoModelo);
        System.out.println("Color: "+color);
        System.out.println("# de Puertas: "+numeroPuertas);
        System.out.println("# de Pasajeros: "+numeroPasajeros);
    }

    //IMPRIMIR LA EDAD DEL VEHiCULO
    public int edadAno()
    {
        int edad=2019-anoModelo;
        return edad;
    }
    public void printEdad()
    {
        System.out.println("La edad del auto es de: " +edadAno()+" anos");
    }

    //IMPRIMIR EL PRECIO DE VENTA
    public void precioVenta()
    {
        double precioVenta=precioCompra;
        for(int counter=0;counter<edadAno()-1;counter++)
        {
          precioVenta=precioVenta*.8;
          counter++;  
        }
        DecimalFormat twoDecimales = new DecimalFormat("#0.00");
        System.out.printf("El precio de Venta actual es de: $"+(twoDecimales.format(precioVenta)));
    }

    //METODO IMPRESION SERVICIO
    public void impresionServicio(double kilometrajee,int indicador)
    {
        DecimalFormat twoDecimales = new DecimalFormat("#0.00");
        switch(indicador)
        {
            case(0):
                System.out.println("Faltan "+(twoDecimales.format(kilometrajee))+"KM para su siguiente servicio, el cual debe ser SERVICIO BASICO");
                break;
            case(1):
                System.out.println("Faltan "+(twoDecimales.format(kilometrajee))+"KM para su siguiente servicio, el cual debe ser SERVICIO MEDIO");
                break;
            case(2):
                System.out.println("Faltan "+(twoDecimales.format(kilometrajee))+"KM para su siguiente servicio, el cual debe ser SERVICIO COMPLETO");
                break;
            case(3):
                System.out.println("Faltan "+(twoDecimales.format(kilometrajee))+"KM para su siguiente servicio, el cual debe ser SERVICIO COMPLETO PLUS");
                break;
        }
    }

    //METODO SERVICIO
    public void servicioCorrespondiente()
    {
        double kilometrajee=kilometraje;
        if(kilometrajee<=10000.00)
        {
            kilometrajee=10000.00-kilometrajee;
            impresionServicio(kilometrajee, 0);
        }
        else if((kilometrajee>10000.00)&&(kilometrajee<=20000.00))
        {
            kilometrajee=20000.00-kilometrajee;
            impresionServicio(kilometrajee, 1);
        }
        else if((kilometrajee>20000.00)&&(kilometrajee<=30000.00))
        {
            kilometrajee=30000.00-kilometrajee;
            impresionServicio(kilometrajee, 0);
        }
        else if((kilometrajee>30000.00)&&(kilometrajee<=40000.00))
        {
            kilometrajee=40000.00-kilometrajee;
            impresionServicio(kilometrajee,2);
        }
        else if((kilometrajee>40000.00)&&(kilometrajee<=50000.00))
        {
            kilometrajee=50000.00-kilometrajee;
            impresionServicio(kilometrajee, 0);
        }
        else if((kilometrajee>50000.00)&&(kilometrajee<=60000.00))
        {
            kilometrajee=60000.00-kilometrajee;
            impresionServicio(kilometrajee, 1);
        }
        else if((kilometrajee>60000.00)&&(kilometrajee<=70000.00))
        {
            kilometrajee=70000.00-kilometrajee;
            impresionServicio(kilometrajee, 0);
        }
        else if((kilometrajee>70000.00)&&(kilometrajee<=80000.00))
        {
            kilometrajee=80000.00-kilometrajee;
            impresionServicio(kilometrajee, 2);
        }
        else if((kilometrajee>80000.00)&&(kilometrajee<=90000.00))
        {
            kilometrajee=90000.00-kilometrajee;
            impresionServicio(kilometrajee, 0);
        }
        else
        {
            kilometrajee=100000.00-kilometrajee;
            impresionServicio(kilometrajee, 3);
        }
    }
    
    //METODO QUE AGREGAN PUERTAS Y VEHICULO
    public void almacenarInfoPuertas(Puertas puertaa)
    {
        if(cont<numeroPuertas)
        {
            puerta[cont]=puertaa;
            cont++;
        }
        else
            System.out.println("No se puede introducir mas info");
    }
    
    //METODO QUE AGREGAN VENTANAS Y VEHICULO
    public void almacenarInfoVentanas(Ventanas ventanaa)
    {
        if(cont2<(numeroPuertas-1))
        {
            ventana[cont2]=ventanaa;
            cont2++;
        }
        else
            System.out.println("No se puede introducir mas info");
    }

    //METODO PARA PASAJEROS
    public void pasajeroViajaEn(Pasajero pasajero)
    {
        pasajero.viajeEn(new Vehiculo());
    }

    //METODOS PARA CONDUCTOR
    public void conductorManeja(Conductor conductor)
    {
        conductor.conduce(new Vehiculo());
    }

    public void conductorCompra(Conductor conductor)
    {
        conductor.compra(new Vehiculo());
    }

    //METODOS PARA CONCESIONARIA
    public void concesionariaArregla(Concesionaria concesionaria)
    {
        concesionaria.arregla(new Vehiculo());
    }

    public void concesionariaVende(Concesionaria concesionaria)
    {
        concesionaria.vende(new Vehiculo());
    }

    //METODOS PARA MECANICO
    public void mecanicoRepara(Mecanico mecanico)
    {
        mecanico.repara(new Vehiculo());
    }

    public void mecanicoTrabaja(Mecanico mecanico)
    {
        mecanico.trabaja();
    }
}