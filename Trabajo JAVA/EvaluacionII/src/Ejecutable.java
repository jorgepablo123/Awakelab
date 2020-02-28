
public class Ejecutable {

	public static void main(String[] args) {
		
		
		Electrodomestico array[] = new Electrodomestico [10];
		
		array [0] = new Electrodomestico ("Lavadora",5);
		array [1] = new  Electrodomestico("Lavadora",1);
		array [2] = new Electrodomestico ("Televisor",4);
		array [3] = new Electrodomestico ("Televisor",6);
		array [4] = new Electrodomestico ("Televisor",6);
		array [5] = new Electrodomestico ("Televisor",6);
		array [6] = new Electrodomestico ("Televisor",6);
		array [7] = new Electrodomestico ("Televisor",6);
		array [8] = new Electrodomestico ("Televisor",6);
		array [9] = new Electrodomestico ("Televisor",6);
		// TODO Auto-generated method stub
		
		int suma=0;
        for (int i=0;i<array.length;i++){
            suma+=array[i].Calcular(i);
	
	}
        
        System.out.println("El valor total es: "+suma);
}
}

