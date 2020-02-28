
public class Ejecutable {

	public static void main(String[] args) {
		   
        
        Electrodomesticos arrayElectro[]=new Electrodomesticos[10];
   
        
        arrayElectro[0]=new Television(22,100,'A', "rojo", 50, true);
        arrayElectro[1]=new Television(300, 50);
        arrayElectro[2]=new Television(19, 200, 'B', "verde", 42, true);
        arrayElectro[3]=new Television(20,100);
        arrayElectro[4]=new Electrodomesticos(600, 20, 'D', "gris");
        arrayElectro[5]=new Electrodomesticos(200, 30);
        arrayElectro[6]=new Television(250, 70);
        arrayElectro[7]=new Lavadora(400, 130, 'B', "azul", 15);
        arrayElectro[8]=new Lavadora(400, 60, 'C', "blanco", 20);
        arrayElectro[9]=new Lavadora(40, 50);
   
        
        
        double sumTele=0;
        double sumLava=0;    
        double sumElec=0;
           
        
		for(int i=0;i<arrayElectro.length;i++){
                   
            
            if(arrayElectro[i] instanceof Lavadora){
                sumLava+=arrayElectro[i].precioFinal();
            }
            if(arrayElectro[i] instanceof Television){
                sumTele+=arrayElectro[i].precioFinal();
            }
            if(arrayElectro[i] instanceof Electrodomesticos){
                sumElec+=arrayElectro[i].precioFinal();
            }
        }
   
        System.out.println("El precio total de televisores :    "+sumTele);
        
        System.out.println("El precio total de lavadoras :      "+sumLava);
        
        System.out.println("El precio total electrodomesticos : "+sumElec);
       
        
        
        double SumaTotal;
        
        SumaTotal= (sumTele+sumLava+sumElec);
        
        System.out.println("La suma total de las 3 categorias:  " +  SumaTotal);
        
    }  	
}



