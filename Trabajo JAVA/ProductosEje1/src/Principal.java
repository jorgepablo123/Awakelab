import java.util.Scanner;

public class Principal {

	    public static void main(String[] args) {
		int num, num1;
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("ingrese precio1");
		num = entrada.nextInt();
		
		System.out.println("ingrese precio2");
		num1 = entrada.nextInt();
				
		 Producto ListaProductos[]=new Producto[2];
	       
	     ListaProductos[0]=new Perecedero(3, "producto2",num);
	     ListaProductos[1]=new Noperecedero("tipo 1", "producto 3", num1);
	           	       
	     double suma=0;
	     for(int i=0;i<ListaProductos.length;i++){
	        suma=suma+ListaProductos[i].Calcular(1);
	       }
	     System.out.println("El precio total de productos es: "+suma);      
	      
	    }
	    		
	}
		
		
	


