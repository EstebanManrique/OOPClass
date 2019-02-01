public class Calculadora
{
    public int suma(int cantidad1, int cantidad2)
    {
        int resultado=0;
        resultado=cantidad1+cantidad2;
        return resultado;
    }
    public double suma(double cantidad1, double cantidad2)
    {
        double resultado=0.d;
        resultado=cantidad1+cantidad2;
        return resultado;
    }
    public int resta(int cantidad1, int cantidad2)
    {
        int resultado=0;
        resultado=cantidad1-cantidad2;
        return resultado;
    }
    public double resta(double cantidad1, double cantidad2)
    {
        double resultado=0.d;
        resultado=cantidad1-cantidad2;
        return resultado;
    }
    public int multiplicacion(int cantidad1, int cantidad2)
    {
        int resultado=0;
        resultado=cantidad1*cantidad2;
        return resultado;
    }
    public double multiplicacion(double cantidad1, double cantidad2)
    {
        double resultado=0.d;
        resultado=cantidad1*cantidad2;
        return resultado;
    }
    public int division(int cantidad1, int cantidad2)
    {
        int resultado=0;
        if(cantidad2==0)
        {
            return 0;
        }
        else
        {
            resultado=cantidad1/cantidad2;
            return resultado;
        }
    }
    public double division(double cantidad1, double cantidad2)
    {
        double resultado=0.d;
        if(cantidad2==0.0)
        {
            return 0.0;  
        }     
        else
        {
            resultado=cantidad1/cantidad2;
            return resultado;
        }
    }
    public int potencia(int cantidad, int potencia)
    {
        int resultado=0;
        int counter=0;
        while(counter<potencia)
        {
            resultado=resultado*resultado;
            counter++;
        }
        return resultado;
    }
    public double potencia(double cantidad, int potencia)
    {
        double resultado=0.d;
        int counter=0;
        while(counter<potencia)
        {
            resultado=resultado*resultado;
            counter++;
        }
        return resultado;
    }
    public double raízCuadrada(int cantidad)
    {
        double resultado=0.d;
        double counter=0.d;
        while(resultado<cantidad)
        {
            resultado=counter*counter;
            counter=counter+0.1;
        }
        return resultado;
    }
    public double raízCuadrada(double cantidad)
    {
        double resultado=0.d;
        resultado=Math.sqrt(cantidad);
        return resultado;
    }
}