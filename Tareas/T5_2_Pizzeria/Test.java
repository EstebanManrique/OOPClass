public class Test
{
    public static void main(String[] args) 
    {
        Cajero cajero1=new Cajero("Juan","cajero");
        Ayudante ayudante1=new Ayudante("Ignacio","ayudante");
        Chef chef1=new Chef("Chefsito","chef");
        Repartidor repartidor1=new Repartidor("Felipe","repartidor");
        GerentePolanco gerentePolancoUnico=GerentePolanco.getGerente();
        gerentePolancoUnico.setNombre("Dionisio");
        gerentePolancoUnico.setPosicion("gerente Polanco");

        Cajero cajero2=new Cajero("Pedro","cajero");
        Ayudante ayudante2=new Ayudante("Santiago","ayudante");
        Chef chef2=new Chef("Gerardo","chef");
        Repartidor repartidor2=new Repartidor("Emilio","repartidor");
        GerenteSantaFe gerenteSantaFeUnico=GerenteSantaFe.getGerente();
        gerentePolancoUnico.setNombre("Billy");
        gerentePolancoUnico.setPosicion("gerente Santa Fe");

        SucursalPolanco sucursalPolanco=SucursalPolanco.getSucursal();
        sucursalPolanco.setDireccion("Arquimides 245");
        sucursalPolanco.setNombre("Pizzeria Polanco");
        SucursalSanta sucursalSanta=SucursalSanta.getSucursal();
        sucursalSanta.setDireccion("Paseo a Santa Fe 185");
        sucursalSanta.setNombre("Pizzeria Santa");

        sucursalPolanco.addEmpleado(cajero1);
        sucursalPolanco.addEmpleado(repartidor1);
        sucursalPolanco.addEmpleado(chef1);
        sucursalPolanco.addEmpleado(ayudante1);
        sucursalPolanco.addEmpleado(gerentePolancoUnico);

        sucursalSanta.addEmpleado(cajero2);
        sucursalSanta.addEmpleado(repartidor2);
        sucursalSanta.addEmpleado(chef2);
        sucursalSanta.addEmpleado(ayudante2);
        sucursalSanta.addEmpleado(gerenteSantaFeUnico);

        Pizza pizza1=new Pizza("Personalizada",false,true);
        pizza1.ingredientesPersonalizada("Queso");
        pizza1.ingredientesPersonalizada("Pina");
        pizza1.ingredientesPersonalizada("Frijoles");
        pizza1.ingredientesPersonalizada("Chorizo");
        
        cajero1.recibirOrden(pizza1);
        cajero1.pedirChef(chef1,pizza1);
        ayudante1.ayudaAmasa(chef1,pizza1);
        chef1.amasa(pizza1);
        chef1.agregaIngredientes(pizza1);
        chef1.hornea(pizza1);
        ayudante1.ayudaEmpacar(pizza1);
        cajero1.pedirRepartidor(repartidor1,pizza1);
        repartidor1.repartir(pizza1); 

        System.out.println();

        Pizza pizza2=new Pizza("Vegetariana",true,false);
        //Pizza pizza3=new Pizza("Hawaiana",true,false);
         
        cajero2.recibirOrden(pizza2);
        cajero2.pedirChef(chef2,pizza2);
        ayudante2.ayudaAmasa(chef2,pizza2);
        chef2.amasa(pizza2);
        chef2.agregaIngredientes(pizza2);
        chef2.hornea(pizza2);
        ayudante2.ayudaEmpacar(pizza2);
        cajero2.pedirRepartidor(repartidor2,pizza2);
        repartidor2.repartir(pizza2); 
        
        gerenteSantaFeUnico.actualizacionVentas(pizza1,sucursalSanta);
        gerentePolancoUnico.actualizacionVentas(pizza2,sucursalPolanco);
    }
}