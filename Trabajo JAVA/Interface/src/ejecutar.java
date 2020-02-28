import java.util.Scanner;

public class ejecutar {
	
	public static void main (String[]args) {
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Ingrese un Valor:  ");
		
		int valor = entrada.nextInt();
	 
	    Acumulador num1= new Acumulador(valor);
	    
	    System.out.println("Ingrese el valor 2:  ");
		
		int valor2 = entrada.nextInt();
		
		num1.incremento(valor2);
	    
		 System.out.println("los valores sumados son:  " +num1.daValor());
		 
		 entrada.close();
	}    
	

}
