package primero;
import java.util.Scanner;
public class Ejerc3 {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String args[]){
		int numero = 0;
		
		System.out.println("Ingrese un numero del 00 al 255");
		numero = entrada.nextInt();
		char c = (char)numero;
		System.out.println("Valor ASCII: "+ c);
	}

}

