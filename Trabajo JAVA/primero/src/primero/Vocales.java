package primero;

public class Vocales {
	
	public static void main(String[] args) {
	      contar("talento digital");

}
	
	public static void contar(String cadena)
{
		String vocales="aeiou";
		int contador[]={0,0,0,0,0};
		
		// recorremos la cadena
		
		for(int i=0;i<cadena.length();i++)
		{
			
			// Recorremos las vocales para comparar
			
			for(int j=0;j<vocales.length();j++)
{
	  if (cadena.charAt(i)==vocales.charAt(j))
		  
		  // aumentamos el contador con vocal encontrada
	  {
		  contador[j]++;
	  }
		  
	  }
	  }
		for(int i=0;i<vocales.length();i++)
		{
			System.out.println("aparece la letra  " +vocales.charAt(i)+": "+contador[i]+" veces");
}
		}
}