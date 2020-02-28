package primero;
import java.util.Scanner;

public class EdadMayor {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[]args) {
		String nombre;
		int edad;
	 
    System.out.println("ingrese nombre");
    nombre = entrada.nextLine();
    System.out.println("ingrese edad");
    edad = entrada.nextInt();
    
    if (edad>=18) {
    	System.out.println( nombre + " eres mayor de edad");
    } else { 
    	System.out.println(nombre + " eres menor de edad");
    }
}
}

