public class Principal {

    public static void main(String[] args){

        Comercial c1=new Comercial(300000,"juan", 40,200);
        Repartidor R1=new Repartidor(3,"rodrigo",30,200);
         Repartidor R2=new Repartidor(3,"rodrigo",30,200);
        
        c1.Plus();
        R1.Plus();
        R2.Plus();
        c1.mostrarDatos();
        R1.mostrarDatos();
        R2.mostrarDatos();
        System.out.println(c1.getsalario());
         }
    
}


