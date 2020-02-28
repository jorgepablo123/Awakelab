
	public class Lavadora extends Electrodomesticos{
		
		private final static int CARGA=5;
		  
	    
	    private int carga;
	  
	    
	    public int getCarga() {
	    	return carga;
	    }
	    public double precioFinal() {
	    		
	    double plus=super.precioFinal();
	  
	        
	        if (carga>30){
	            plus+=50;
	        }
	  
	        return plus;
	    }
	  
	    
	    public Lavadora(){
	        this(PRECIOBASE, PESO, CONSUMOE, COLOR, CARGA);
	    }
	  
	   
	    public Lavadora(double precioBase, double peso){
	        this(precioBase, peso, CONSUMOE, COLOR, CARGA);
	    }
	  
	   
	    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
	        super(precioBase,peso, consumoEnergetico,color);
	        this.carga=carga;
	    
	}
	}


