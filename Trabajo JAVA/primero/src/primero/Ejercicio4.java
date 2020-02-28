package primero;

public class Ejercicio4 {
	
	public static void main(String[] args){
		String cadena ="Una cadena de caracteres";
		char[] arrayChar = cadena.toCharArray();
 
		for(int i=0; i<arrayChar.length; i++){
 
			if( arrayChar[i] == 'a')
				System.out.println( arrayChar[i] + " -> es la vocal a");
			else
				System.out.println( arrayChar[i] + " -> no es la vocal a");
			
		}
	}
}
