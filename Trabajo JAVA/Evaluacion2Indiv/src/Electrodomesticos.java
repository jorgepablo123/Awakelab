
public class Electrodomesticos {
	
	
protected final static String COLOR="blanco";
	   
    
    protected final static char CONSUMOE='F';
   
    
    protected final static double PRECIOBASE=100;
   
    
    protected final static double PESO=5;
      
    protected String color;
   
    protected double precioBase;
    
    protected char consumoE;
   
       protected double peso;
   
   
   
    private void comprobarColor(String color){
   
        
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR;
        }
          
          
    }
      
        public void comprobarConsumoE(char consumoE){
          
        if(consumoE>=65 && consumoE<=70){
            this.consumoE=consumoE;
        }else{
            this.consumoE=CONSUMOE;
        }
          
    }
   
        public double getPrecioBase() {
        return precioBase;
    }
        public String getColor() {
        return color;
    }
   
         public char getConsumoE() {
        return consumoE;
    }
        public double getPeso() {
        return peso;
    }
    
    public double precioFinal(){
        double calc=0;
        switch(consumoE){
            case 'A':
                calc+=100;
                break;
            case 'B':
                calc+=80;
                break;
            case 'C':
                calc+=60;
                break;
            case 'D':
                calc+=50;
                break;
            case 'E':
                calc+=30;
                break;
            case 'F':
                calc+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            calc+=10;
        }else if(peso>=20 && peso<49){
            calc+=50;
        }else if(peso>=50 && peso<=79){
            calc+=80;
        }else if(peso>=80){
            calc+=100;
        }
   
        return precioBase+calc;
    }
   
        public Electrodomesticos(){
        this(PRECIOBASE, PESO, CONSUMOE, COLOR);
    }
   
        public Electrodomesticos(double precioBase, double peso){
        this(precioBase, peso, CONSUMOE, COLOR);
    }
   
        
    public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoE(consumoE);
        comprobarColor(color);
    }
   
}


